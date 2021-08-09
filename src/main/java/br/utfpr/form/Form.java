package br.utfpr.form;


import java.time.LocalDate;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/")
public class Form extends VerticalLayout{
    
    public Form() {        
        this.setClassName("centered-content");
        
        H2 titleForm = new H2("Cadastro de Pessoas");
        
        FormLayout formPerson = new FormLayout();
        H4 titlePersonForm = new H4("Dados Pessoais");
        TextField textFieldFirstName = new TextField("Nome");
        TextField textFieldLastName = new TextField("Sobrenome");
        DatePicker dataPickerBirthDate = new DatePicker("Data de Nascimento");
        dataPickerBirthDate.setAutoOpen(true);
        dataPickerBirthDate.setMax(LocalDate.now());

        FormLayout formAddress = new FormLayout();
        H4 titleAddress = new H4("Endereço");
        TextField textFieldAddress = new TextField("Rua");
        TextField textFieldNumber = new TextField("Número");
        TextField textFieldCity = new TextField("Cidade");
        ComboBox<String> comboBoxStates = new ComboBox<>();
        comboBoxStates.setLabel("Estado");
        comboBoxStates.setItems("RJ","MG","SP","PR","SC","RS");

        formPerson.add(textFieldFirstName);
        formPerson.add(textFieldLastName);
        formPerson.add(dataPickerBirthDate);

        formAddress.add(textFieldAddress);
        formAddress.add(textFieldNumber);
        formAddress.add(textFieldCity);
        formAddress.add(comboBoxStates);

        add(titleForm);

        add(titlePersonForm);
        add(formPerson);

        add(titleAddress);
        add(formAddress);
    }
    
}

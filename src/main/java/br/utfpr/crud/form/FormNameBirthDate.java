package br.utfpr.crud.form;

import java.time.LocalDate;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class FormNameBirthDate extends VerticalLayout{
    
    public FormNameBirthDate() {

        FormLayout formLayout = new FormLayout();
        formLayout.getStyle().set("margin-top", "0");
        this.getStyle().set("margin-top", "0");
        formLayout.setResponsiveSteps(
            new ResponsiveStep("1px", 1),
            new ResponsiveStep("600px", 2),
            new ResponsiveStep("700px", 3)
        );

        TextField firstName = new TextField("Nome");
        firstName.setRequiredIndicatorVisible(true);

        TextField lastName = new TextField("Sobrenome");
        lastName.setRequiredIndicatorVisible(true);

        DatePicker birthDate = new DatePicker("Data de Nascimento");
        birthDate.setRequiredIndicatorVisible(true);
        birthDate.setMax(LocalDate.now());

        formLayout.add(
            firstName,
            lastName,
            birthDate       
        );

        add(formLayout);
    }
}

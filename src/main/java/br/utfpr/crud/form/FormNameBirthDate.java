package br.utfpr.crud.form;

import java.time.LocalDate;
import java.util.Locale;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class FormNameBirthDate extends VerticalLayout{
    
    
    TextField firstName;
    TextField lastName;
    DatePicker birthDate;

    public FormNameBirthDate() {

        FormLayout formLayout = new FormLayout();
        formLayout.getStyle().set("margin-top", "0");
        this.getStyle().set("margin-top", "0");
        formLayout.setResponsiveSteps(
            new ResponsiveStep("1px", 1),
            new ResponsiveStep("600px", 2),
            new ResponsiveStep("700px", 3)
        );

        firstName = new TextField("Nome");
        firstName.setRequiredIndicatorVisible(true);

        lastName = new TextField("Sobrenome");
        lastName.setRequiredIndicatorVisible(true);

        Locale brasilLocale = new Locale("pt", "BR");
        birthDate = new DatePicker("Data de Nascimento");
        birthDate.setLocale(brasilLocale);
        birthDate.setHelperText("dd/mm/yyyy");
        birthDate.setRequiredIndicatorVisible(true);
        birthDate.setMax(LocalDate.now());

        formLayout.add(
            firstName,
            lastName,
            birthDate       
        );

        add(formLayout);
    }

    public TextField getFirstName() {
        return firstName;
    }

    public TextField getLastName() {
        return lastName;
    }
    
    public DatePicker getBirthDate() {
        return birthDate;
    }
}

package br.utfpr.crud.form;

import java.time.format.DateTimeFormatter;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import br.utfpr.crud.Records;
import br.utfpr.crud.database.DataBase;
import br.utfpr.crud.entity.Person;

public class Form extends VerticalLayout {
    
    public Form() {
        this.getStyle().set("margin", "auto");
        this.getStyle().set("max-width", "900px");        

        H4 formTitle = new H4("Formulário");
        formTitle.getStyle().set("padding-left", "16px");
        formTitle.getStyle().set("text-transform", "uppercase");
        formTitle.getStyle().set("color", "#808080");

        FormNameBirthDate formNameBirthDate = new FormNameBirthDate();
        FormContactInfo formContactInfo = new FormContactInfo();
        FormAddress formAddress = new FormAddress();
        FormAbout formAbout = new FormAbout();

        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.getStyle().set("padding-left", "16px");
        
        Button saveButton = new Button("Salvar", event -> {            
            if (mandatoryIsFilled(formNameBirthDate, formContactInfo, formAddress, formAbout)) {                
                if (!formNameBirthDate.getBirthDate().isEmpty()){
                    DataBase.getPersonList().add(
                        new Person(
                            formNameBirthDate.getFirstName().getValue(),
                            formNameBirthDate.getLastName().getValue(),
                            formNameBirthDate.getBirthDate().getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                            formContactInfo.getEmail().getValue(),
                            formContactInfo.getPhone().getValue(),
                            Long.parseLong(formAddress.getZipCode().getValue()),
                            formAddress.getAddress().getValue(),
                            formAddress.getNumber().getValue(),
                            formAbout.getLevelOfEducation().getValue(),
                            formAbout.getAbout().getValue()
                        )
                    );
                    Records.grid.getDataProvider().refreshAll();
                } else {
                    Notification.show(
                        "Preencher data no formato: dd/mm/yyyy",
                        3000,
                        Notification.Position.TOP_CENTER
                    ); 
                }         
            } else { 
                Notification.show(
                    "Preencher Campos Obrigatórios",
                    3000,
                    Notification.Position.TOP_CENTER
                );
            }
        });
        saveButton.getStyle().set("margin-right",  "16px");
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        
        Button cleanButton = new Button("Limpar", event -> {
            formNameBirthDate.getFirstName().clear();
            formNameBirthDate.getLastName().clear();
            formNameBirthDate.getBirthDate().clear();
            formContactInfo.getEmail().clear();
            formContactInfo.getPhone().clear();
            formAddress.getZipCode().clear();
            formAddress.getAddress().clear();
            formAddress.getNumber().clear();
            formAbout.getLevelOfEducation().clear();
            formAbout.getAbout().clear();
        });       
        
        buttonLayout.add(saveButton, cleanButton);       

        add(
            formTitle,
            formNameBirthDate,
            new Hr(),
            formContactInfo,
            new Hr(),
            formAddress,
            new Hr(),
            formAbout,
            buttonLayout   
        );
    }

    private boolean mandatoryIsFilled(FormNameBirthDate formNameBirthDate,
        FormContactInfo formContactInfo,
        FormAddress formAddress,
        FormAbout formAbout) {
        
        boolean isEmpty = 
            formNameBirthDate.getFirstName().getValue().trim().isEmpty() ||
            formNameBirthDate.getLastName().getValue().trim().isEmpty() ||
            formContactInfo.getEmail().getValue().trim().isEmpty() ||
            formAddress.getZipCode().getValue().trim().isEmpty() ||
            formAddress.getAddress().getValue().trim().isEmpty() ||
            formAddress.getNumber().getValue(). trim().isEmpty() ||
            formAbout.getLevelOfEducation().getValue().trim().isEmpty();
        
        return !isEmpty;
    }
}
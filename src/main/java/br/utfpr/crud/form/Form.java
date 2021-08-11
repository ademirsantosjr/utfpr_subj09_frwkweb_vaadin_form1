package br.utfpr.crud.form;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Form extends VerticalLayout {
    
    public Form() {
        this.getStyle().set("margin", "auto");
        this.getStyle().set("max-width", "900px");

        H4 formTitle = new H4("Cadastrar");
        formTitle.getStyle().set("padding-left", "16px");
        formTitle.getStyle().set("text-transform", "uppercase");
        formTitle.getStyle().set("color", "#808080");

        FormNameBirthDate formNameBirthDate = new FormNameBirthDate();

        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.getStyle().set("padding-left", "16px");
        
        Button saveButton = new Button("Salvar", event -> {
            Notification.show("Gravar informações");
        });
        saveButton.getStyle().set("margin-right",  "16px");
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        
        Button cleanButton = new Button("Limpar", event -> {
            Notification.show("Limpar Campos!");
        });
        buttonLayout.add(saveButton, cleanButton);

        add(
            formTitle,
            formNameBirthDate,
            new Hr(),
            new FormContactInfo(),
            new Hr(),
            new FormAddress(),
            new Hr(),
            new FormAbout(),
            buttonLayout   
        );
    }
}
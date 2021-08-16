package br.utfpr.crud.form;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;

public class FormContactInfo extends VerticalLayout{
    
    private EmailField email;
    private Checkbox doNotSendNotification;
    private TextField phone;
    
    public FormContactInfo() {
        FormLayout formLayout = new FormLayout();
        formLayout.getStyle().set("margin-top", "0");
        formLayout.setResponsiveSteps(
            new ResponsiveStep("1px", 1),
            new ResponsiveStep("600px", 2),
            new ResponsiveStep("700px", 3)
        );

        email = new EmailField("E-mail");
        email.setRequiredIndicatorVisible(true);

        doNotSendNotification = new Checkbox("Não quero receber e-mails de notificações");
        doNotSendNotification.getStyle().set("color", "#808080");
        doNotSendNotification.getStyle().set("font-size", "12px");

        FormLayout emailContainer = new FormLayout();        
        emailContainer.add(email, doNotSendNotification);
        
        phone = new TextField("Telefone");
        phone.setHelperText("ex: +55 11 3322-4000");

        formLayout.add(
            emailContainer,
            phone       
        );
        
        add(formLayout);
    }

    public EmailField getEmail() {
        return email;
    }

    public Checkbox getDoNotSendNotification() {
        return doNotSendNotification;
    }

    public TextField getPhone() {
        return phone;
    }
}

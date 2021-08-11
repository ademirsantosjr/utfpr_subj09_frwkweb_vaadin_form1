package br.utfpr.crud.form;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;

public class FormContactInfo extends VerticalLayout{
    
    public FormContactInfo() {
        FormLayout formLayout = new FormLayout();
        formLayout.getStyle().set("margin-top", "0");
        formLayout.setResponsiveSteps(
            new ResponsiveStep("1px", 1),
            new ResponsiveStep("600px", 2),
            new ResponsiveStep("700px", 3)
        );

        EmailField email = new EmailField("E-mail");
        email.setRequiredIndicatorVisible(true);

        Checkbox doNotSentNotification = new Checkbox("Não quero receber e-mails de notificações");
        doNotSentNotification.getStyle().set("color", "#808080");
        doNotSentNotification.getStyle().set("font-size", "12px");

        FormLayout emailContainer = new FormLayout();        
        emailContainer.add(email, doNotSentNotification);
        
        TextField phone = new TextField("Telefone");

        formLayout.add(
            emailContainer,
            phone       
        );
        
        add(formLayout);
    }
}

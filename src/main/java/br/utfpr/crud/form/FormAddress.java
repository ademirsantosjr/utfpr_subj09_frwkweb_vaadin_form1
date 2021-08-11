package br.utfpr.crud.form;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;

public class FormAddress extends VerticalLayout{
    
    public FormAddress() {

        FormLayout formLayout = new FormLayout();
        formLayout.getStyle().set("margin-top", "0");
        formLayout.setResponsiveSteps(
            new ResponsiveStep("1px", 1),
            new ResponsiveStep("600px", 2),
            new ResponsiveStep("700px", 3)
        );

        TextField zipCode = new TextField("CEP");
        TextField address = new TextField("Endereço");
        NumberField number = new NumberField("Número");

        zipCode.setRequiredIndicatorVisible(true);
        zipCode.setHelperText("apenas números");
        zipCode.setPattern("^\\d{8}$");

        address.setRequiredIndicatorVisible(true);
        number.setRequiredIndicatorVisible(true);

        formLayout.add(
            zipCode,
            address,
            number       
        );

        add(formLayout);
    }
}

package br.utfpr.crud.form;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class FormAddress extends VerticalLayout{
    
    private TextField zipCode;
    private TextField address;
    private TextField number;
    
    public FormAddress() {

        FormLayout formLayout = new FormLayout();
        formLayout.getStyle().set("margin-top", "0");
        formLayout.setResponsiveSteps(
            new ResponsiveStep("1px", 1),
            new ResponsiveStep("600px", 2),
            new ResponsiveStep("700px", 3)
        );

        zipCode = new TextField("CEP");
        address = new TextField("Endereço");
        number = new TextField("Número");

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

    public TextField getZipCode() {
        return zipCode;
    }

    public TextField getAddress() {
        return address;
    }

    public TextField getNumber() {
        return number;
    }
}

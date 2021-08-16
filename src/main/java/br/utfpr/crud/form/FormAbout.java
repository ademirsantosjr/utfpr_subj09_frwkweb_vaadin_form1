package br.utfpr.crud.form;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;

public class FormAbout extends VerticalLayout{
    
    private ComboBox<String> levelOfEducation;
    private TextArea about;

    public FormAbout() {

        FormLayout formLayout = new FormLayout();
        formLayout.getStyle().set("margin-top", "0");
        formLayout.setResponsiveSteps(
            new ResponsiveStep("1px", 1),
            new ResponsiveStep("600px", 2),
            new ResponsiveStep("700px", 3)
        );

        levelOfEducation = new ComboBox<>("Escolaridade");
        levelOfEducation.setRequiredIndicatorVisible(true);
        levelOfEducation.setItems(
            "Nenhum",
            "Primário",
            "Fundamental",
            "Ensido Médio",
            "Superior"
        );

        about = new TextArea("Informações Adicionais");
        formLayout.setColspan(about, 3);

        formLayout.add(
            levelOfEducation,
            about       
        );

        add(formLayout);
    }

    public ComboBox<String> getLevelOfEducation() {
        return levelOfEducation;
    }

    public TextArea getAbout() {
        return about;
    }
}

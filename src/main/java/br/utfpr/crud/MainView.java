package br.utfpr.crud;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import br.utfpr.crud.form.Form;

@Route("/")
@PWA(name = "Cadastro de Pessoas",
        shortName = "Cadastro",
        description = "Exemplo de formulário para cadastro de pessoas.",
        enableInstallPrompt = false)
public class MainView extends VerticalLayout{
    
    public MainView() {
        this.getStyle().set("padding", "0");

        MenuBar menuBar = new MenuBar();
        menuBar.getStyle().set("background", "#808080");
        menuBar.getStyle().set("height", "60px");
        menuBar.setWidthFull();
        
        SplitLayout splitLayout = new SplitLayout(new Form(), new Records());
        splitLayout.getStyle().set("margin-top", "0");
        splitLayout.setWidthFull();

        add(menuBar, splitLayout);
    }
}

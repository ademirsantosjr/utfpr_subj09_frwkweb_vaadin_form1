package br.utfpr.crud;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import br.utfpr.crud.database.DataBase;
import br.utfpr.crud.entity.Person;

public class Records extends VerticalLayout{
    
    public Records() {
        Grid<Person> grid = new Grid<>(Person.class);

        grid.setItems(DataBase.getPersonList());
        grid.setColumns("firstName", "lastName", "address");

        add(grid);
    }
}

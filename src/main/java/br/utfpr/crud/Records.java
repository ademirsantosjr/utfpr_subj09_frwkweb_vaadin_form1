package br.utfpr.crud;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import br.utfpr.crud.database.DataBase;
import br.utfpr.crud.entity.Person;

public class Records extends VerticalLayout {
    
    public static Grid<Person> grid = new Grid<>(Person.class);

    public Records() {          
        
        grid.setItems(DataBase.getPersonList());
        
        grid.setColumns(
            "firstName",
            "lastName",
            "birthDate",
            "email",
            "phone",
            "cep",                        
            "address",                        
            "buildingNumber",
            "instructionLevel",
            "additionalInfo"
        );

        grid.getColumns().forEach(column -> column.setAutoWidth(true));
        
        add(grid);
    }

}

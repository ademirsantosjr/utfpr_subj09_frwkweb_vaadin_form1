package br.utfpr.crud.database;

import java.util.ArrayList;
import java.util.List;

import br.utfpr.crud.entity.Person;

public class DataBase {
    
    private static List<Person> personList = new ArrayList<Person>(
        List.of(
            new Person("Emília",
                       "Almeida",
                       "25/06/1975",
                       "emilia@gmail.com",
                       "+55 41 3222-2222",
                       25445258,
                       "Rua Barão",
                       "585",
                       "Esino Médio",
                       "Costureira"),
            new Person("João",
                       "Miranda",
                       "01/01/2008",
                       "miranda@msn.com",
                       "+55 41 1234-2567",
                       83000000,
                       "Av. Cascavel",
                       "5A",
                       "Primário",
                       "Estudante")            
        )
    );

    public static List<Person> getPersonList() {
        return personList;
    }

    public static void save(Person person) {
        personList.add(person);
    }
}

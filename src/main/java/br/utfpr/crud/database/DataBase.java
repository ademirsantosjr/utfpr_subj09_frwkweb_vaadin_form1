package br.utfpr.crud.database;

import java.util.ArrayList;
import java.util.List;

import br.utfpr.crud.entity.Person;

public class DataBase {
    
    private static List<Person> personList = new ArrayList<Person>(
        List.of(
            new Person("Emília", "Almeida", "Rua Barão, 585"),
            new Person("João", "Miranda", "Av. Cascavel, 5A")
        )
    );

    public static List<Person> getPersonList() {
        return personList;
    }

    public static void save(Person person) {
        personList.add(person);
    }
}

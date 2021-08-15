package br.utfpr.crud.database;

import java.util.ArrayList;
import java.util.List;

import br.utfpr.crud.entity.Person;

public class DataBase {
    
    private static List<Person> personList = new ArrayList<Person>(
        List.of(
            new Person("Emília", "Almeida", "emilia@gmail.com", "Rua Barão", "585"),
            new Person("João", "Miranda", "miranda@msn.com", "Av. Cascavel", "5A"),
            new Person("Pedro", "Mathias", "pmatias@uol.com.br", "Rua São Mateus", "2"),
            new Person("Ermengarda", "Pereira", "e.pereire@yahoo.com", "Av. das Avenidas", "47")
        )
    );

    public static List<Person> getPersonList() {
        return personList;
    }

    public static void save(Person person) {
        personList.add(person);
    }
}

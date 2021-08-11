package br.utfpr.crud.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String firstName;
    private String lastName;
    private String address;    

    //public Person(){}

    public Person (String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static List<Person> list() {
        List<Person> list = new ArrayList<>();
        
        list.add(new Person("Emília", "Almeida", "Rua Barão, 585"));
        list.add(new Person("João", "Miranda", "Rua Rio de Janeiro, 5A"));
        list.add(new Person("Pedro", "Barbosa", "Rua Cascavel, 89"));
        list.add(new Person("Ermengarda", "Alves", "Rua Recife, 69"));

        return list;
    }
}

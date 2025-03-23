package org.example.seance4;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    Date dateNaissance;
    LocalDate date;


    public static void main(String[] args) {
        Person person = new Person();
        person.dateNaissance = new Date();
        person.date = LocalDate.now();
        System.out.println("La date est: " + person.dateNaissance);
        System.out.println("La date est: " + person.date);

    }

}

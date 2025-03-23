package org.example.seance4;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.dateNaissance = new Date();
        System.out.println("La date est: " + person.dateNaissance);
    }
}

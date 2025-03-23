package org.example.seance4;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.age = 2;
        animal1.nom = "Mishou";
        System.out.println(animal1.age);
        System.out.println(animal1.nom);
        animal1.manger();
    }
}

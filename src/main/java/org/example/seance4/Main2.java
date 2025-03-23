package org.example.seance4;

public class Main2 {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture();
        voiture1.modele = 2020;
        voiture1.hp = 24;
        voiture1.marque = "Mazda";
        System.out.println("la voiture " + voiture1.marque + ", modele " + voiture1.modele + ",avec " + voiture1.hp + "cheveaux");
    }
}

package org.example.seance4.constructor;

public class Voiture {
    String marque;
    int modele;

    public Voiture(String marque, int modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public static void main(String[] args) {
        Voiture voiture = new Voiture("Mazda", 2002);
        System.out.println(voiture.marque);
    }
}

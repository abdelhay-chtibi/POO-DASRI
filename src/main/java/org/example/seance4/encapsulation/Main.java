package org.example.seance4.encapsulation;

public class Main {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture(2020,"BMW");
        System.out.println("Le model de la voiture est: " + maVoiture.getModel() + ", de type " + maVoiture.getType());
    }

}

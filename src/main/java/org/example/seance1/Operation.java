package org.example.seance1;

public class Operation {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int sum;
        sum = x + y;
        System.out.println("Resultat de la somme est: "+sum);
        int sous;
        sous = x - y;
        System.out.println("Resultat de la soustratction: "+ sous);
        double div;
        div = (double) x / y;
        System.out.println("Resultat de la division: "+ div);

        // Round
        System.out.println(Math.round(4.5));  // Affiche 5
        System.out.println(Math.round(4.4));  // Affiche 4

    }
}

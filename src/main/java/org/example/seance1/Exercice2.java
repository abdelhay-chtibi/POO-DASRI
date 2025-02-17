package org.example.seance1;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le parametre a de l'equation: ");
        double a = scanner.nextDouble();

        System.out.print("Entrez le parametre b de l'equation: ");
        double b = scanner.nextDouble();

        System.out.print("Entrez le parametre c de l'equation: ");
        double c = scanner.nextDouble();


        if (a != 0) {
            double x = (c-b) / a;
            System.out.println("La solution est de est: " +x);
        }else if (b == c){
            System.out.println("La solution est R.");
        }else {
            System.out.println("Pas de solution.");
        }


        scanner.close();
    }
}

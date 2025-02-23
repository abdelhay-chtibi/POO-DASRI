package org.example.seance2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un jour de la semaine :");
        String jour = scanner.nextLine();
        switch (jour) {
            case "Lundi":
                System.out.printf("1%n");
                break;
            case "Mardi":
                System.out.printf("2%n");
                break;
            case "Mercredi":
                System.out.printf("3%n");
                break;
            case "Jeudi":
                System.out.printf("4%n");
                break;
            case "Vendredi":
                System.out.printf("5%n");
                break;
            case "Samedi":
                System.out.printf("6%n");
                break;
            case "Dimanche":
                System.out.printf("7%n");
                break;
            default:
                System.out.printf("Jour invalide%n");
        }
    }
}

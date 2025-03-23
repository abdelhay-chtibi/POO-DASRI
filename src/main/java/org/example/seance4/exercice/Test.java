package org.example.seance4.exercice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompteBancaire Moncompte = new CompteBancaire(6000);
        System.out.println("Votre solde est: " + Moncompte.getSolde() + " dhs");

        System.out.print("Tapez 1 pour deposer ou 2 pour retirer: ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.print("Veuilliez entre le montant a deposer: ");
                double montant = scanner.nextDouble();
                Moncompte.deposer(montant);
                System.out.println("Votre nouveau solde est: " + Moncompte.getSolde() + " dhs");
                break;
            case 2:
                System.out.print("Veuilliez entre le montant a retirer: ");
                double debit = scanner.nextDouble();
                Moncompte.retirer(debit);
                System.out.println("Votre nouveau solde est: " + Moncompte.getSolde() + " dhs");
                break;
            default:
                System.out.println("Mauvais choix!");
        }
        scanner.close();






    }
}

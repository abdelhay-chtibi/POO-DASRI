package org.example.seance4.encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CompteBancaire compteBancaire = new CompteBancaire(5000);
        System.out.println("Votre solde est: " + compteBancaire.getSolde() + " dhs.");

        System.out.print("Tapez 1 pour deposer, tapez 2 pour retrait: ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.print("Entrez le montant: ");
                double montant = scanner.nextDouble();
                compteBancaire.deposer(montant);
                System.out.println("Votre nouveau solde est: " + compteBancaire.getSolde() + " dhs.");
                break;
            case 2:
                System.out.print("Entrez le montant a retirer: ");
                double debit = scanner.nextDouble();
                compteBancaire.retirer(debit);
                System.out.println("Votre nouveau solde est: " + compteBancaire.getSolde() + " dhs.");
                break;
            default:
                System.out.println("Mauvais choix");
        }




    }
}

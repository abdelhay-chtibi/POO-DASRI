package org.example.seance1;

import java.util.Scanner;

public class Exercice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre :");
        int a = scanner.nextInt();

        System.out.print("Entrez le premier nombre :");
        int x = scanner.nextInt();

        System.out.print("Entrez le premier nombre :");
        int b = scanner.nextInt();

        int result = a * x + b;

        System.out.print("Entrez la reponse de :" + a + " x " + b + " + " + b + " :");
        int res = scanner.nextInt();
        if (res == result) {
            System.out.println("Votre reponse est corecte.");
        }else {
            System.out.println("Votre reponse est fause. ");
        }


        scanner.close();
    }
}

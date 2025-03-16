package org.example.seance3;

import java.util.Scanner;

public class TP3 {
    public int Multiplication(int a, int b){
    return a * b;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier: ");
        int premierNombre = scanner.nextInt();

        System.out.print("Entrez le nombre: ");
        int deuxiemeNombre = scanner.nextInt();

        TP3 Object = new TP3();
        int resultat = Object.Multiplication(premierNombre, deuxiemeNombre);
        System.out.println("La resultat de la multiplication de " + premierNombre + " et " + deuxiemeNombre + " est: " + resultat);
        scanner.close();
    }
}

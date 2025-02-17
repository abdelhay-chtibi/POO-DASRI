package org.example.seance1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre :");

        int nombre = scanner.nextInt();
        if (nombre < 10) {
            System.out.println(nombre + " est inferieur a 10");
        } else if (nombre < 10) {
            System.out.println(nombre + " est superieur a 10");
        }else {
            System.out.println(nombre + " egale a 10");
        }

        scanner.close();
    }

}

package org.example.seance2;

import java.util.Scanner;

public class WihileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int num = scanner.nextInt();
        int i = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                System.out.println(i + " impaire");
            } else {
                System.out.println(i + " paire");
            }
            i++;
        }
    }
}

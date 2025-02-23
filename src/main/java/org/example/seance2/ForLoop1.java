package org.example.seance2;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int num = scanner.nextInt();
        for(int i = 0; i <= num; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}

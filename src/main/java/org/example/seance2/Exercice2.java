package org.example.seance2;

public class Exercice2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 60) {
            if (i % 6 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("M3");
            } else if (i % 2 == 0) {
                System.out.println("Paire");
            }else {
                System.out.println(i);
            }
            i++;
        }

    }
}

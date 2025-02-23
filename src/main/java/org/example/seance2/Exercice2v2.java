package org.example.seance2;

public class Exercice2v2 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 60) {
            switch (0) { // On utilise 0 comme valeur de référence
                case 0 -> {
                    if (i % 6 == 0) {
                        System.out.println("Fizz");
                        break;
                    }
                    if (i % 3 == 0) {
                        System.out.println("M3");
                        break;
                    }
                    if (i % 2 == 0) {
                        System.out.println("Paire");
                        break;
                    }
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}

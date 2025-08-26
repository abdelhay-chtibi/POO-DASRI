package org.example.seance4.exercice;

public class DebugExample {
    public static void main(String[] args) {
        int number;
        number = 10;
        int result = multiplyByTwo(number);
        System.out.println("Résultat final : " + result);
    }

    public static int multiplyByTwo(int value) {
        int intermediate = value * 2;
        System.out.println("Valeur intermédiaire : " + intermediate);
        return intermediate;
    }
}

package org.example.seance1;

public class Prefix {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a; // a devient 6, puis b reçoit la valeur de a, donc b vaut aussi 6
        System.out.println("a : " + a + ", b : " + b); // Affiche a : 6, b : 6
    }
}

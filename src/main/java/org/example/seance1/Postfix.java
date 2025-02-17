package org.example.seance1;

public class Postfix {
    public static void main(String[] args) {
        int a = 5;
        int b = a++; // b reçoit la valeur de a, donc b vaut 5, puis a est incrémenté à 6
        System.out.println("a : " + a + ", b : " + b); // Affiche a : 6, b : 5



        int x = 0;
        System.out.println(x++);// 0 afficher apres incrementer
        System.out.println(x); // 1
        System.out.println(++x);// 2 incrementer apres afficher
    }
}

package org.example.seance2;

public class Incrementation {
    public static void main(String[] args) {
        int a = 5, b= 10, c = 0;
        c = a++ +b;
        System.out.println(c);
        c = ++a +b;
        System.out.println(c);
    }
}

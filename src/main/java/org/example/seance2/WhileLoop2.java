package org.example.seance2;

public class WhileLoop2 {
    public static void main(String[] args) {
        double x = 30;
        double y = 0.0001;
        int i = 0;
        while (x >= y) {
            x = x / 2;
            ++i;
        }
        System.out.println(i);
        System.out.println(x);

    }
}

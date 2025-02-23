package org.example.seance2;

public class Comparaissant2 {
    public static void main(String[] args) {
        int x = 5, y = 8;
        System.out.printf("La valeur de x est %d et la valeur de y est %d%n", x, y);

        System.out.printf("La valeur de x est %d %% et la valeur de y est %d%n", x, y);



        boolean res1 = (x < y) && (++x == y);
        System.out.println(res1);// false

        boolean res2 = (x == y) || (y++ > x);
        System.out.println(res2); // true

    }
}

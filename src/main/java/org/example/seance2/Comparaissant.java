package org.example.seance2;

public class Comparaissant {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = 7 < 6; // false
        boolean z =! y; // true

        System.out.println(y);
        System.out.println(z);

        System.out.println(x = !false); // true
        System.out.println(x && y); //false
        System.out.println(x || y); // true
        System.out.println(!y); // true
        System.out.println(x && (y || z)); // true
        System.out.println((x && y) || z); // false || true == true
        System.out.println((!x || !y) && (!z)); // true && false == false
        System.out.println(!((x && y) || z)); // !(false || true) == ! true == false

    }
}

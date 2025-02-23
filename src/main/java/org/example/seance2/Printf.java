package org.example.seance2;

public class Printf {
    public static void main(String[] args) {
        int age = 25;

        // %d : Affiche un entier (decimal)
        System.out.printf("J'ai %d ans.%n", age);
        // Sortie : J'ai 25 ans.
        // %n est utilisé pour insérer une nouvelle ligne.

        // %d : Affiche un entier directement
        System.out.printf("%d%n", 42);
        // Sortie : 42

        // %.2f : Affiche un nombre à virgule flottante avec 2 chiffres après la virgule
        System.out.printf("%.2f%n", 3.14159);
        // Sortie : 3.14 (arrondi à 2 chiffres après la virgule)

        // %s : Affiche une chaîne de caractères
        System.out.printf("%s%n", "Java");
        // Sortie : Java

        // %c : Affiche un caractère unique
        System.out.printf("%c%n", 'A');
        // Sortie : A

        // "Hello%nWorld" : Affiche "Hello", puis passe à la ligne et affiche "World"
        System.out.printf("Hello%nWorld%n");
        // Sortie :
        // Hello
        // World
    }
}

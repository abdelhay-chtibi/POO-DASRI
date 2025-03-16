package org.example.seance3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre des étudiants: ");
        int a = scanner.nextInt();

        double[] notes = new double[a];

        for (int i = 0; i < a; i++ ){
            System.out.print("Entrez la note de étudiant numero " + ( i + 1 ) + " : ");
            notes[i] = scanner.nextDouble();
        }

        double sum = 0;
        for(double n : notes) {
            sum = sum + n;
        }

        // La somme de tableau
        //System.out.println(sum);
        double avg = sum / a;
        System.out.println("La moyenne est: " + avg);
        System.out.println(Arrays.toString(notes));

       if (avg < 10){
           System.out.println("Class pourrie .");
       } else if (avg < 12) {
           System.out.println("Class passable .");
       } else if (avg < 15) {
           System.out.println("Class moyenne");
       }else {
           System.out.println("Trés bon class");
       }
        scanner.close();
    }
}

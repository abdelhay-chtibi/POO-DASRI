package org.example.seance3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre des étudiants: ");
        int numStudent = scanner.nextInt();

        double[] notes = new double[numStudent];

        for (int i = 0; i < numStudent; i++ ){
            System.out.print("Entrez la note de étudiant numero " + ( i + 1 ) + " : ");
            notes[i] = scanner.nextDouble();
        }


        for(double n : notes) {
            sum = sum + n;
        }

        // La somme de tableau
        //System.out.println(sum);
        double avg = sum / numStudent;
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

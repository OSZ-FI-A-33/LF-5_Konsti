package org.example;

import java.util.Scanner;

public class A341_Rechteck {
    public static void main(String[] args) {
        /*
        Variablen vergeben
         */
        int seiteA;
        int seiteB;
        int umfang;
        int fleache;

        Scanner input = new Scanner(System.in); // Tastatureingaben erfassen
        System.out.print("SeiteA (in cm): "); //Ausgabe
        seiteA = input.nextInt(); // Tastatureingabe erfassen
        System.out.print("SeiteB (in cm): "); //Ausgabe
        seiteB = input.nextInt(); // Tastatureingabe erfassen

        umfang = 2*seiteA + 2*seiteB; //Umfang ausrechnen

        fleache = seiteA*seiteB; //Fläche ausrechnen

        System.out.println("Umfang: " + umfang + " cm"); // Ausagbe
        System.out.println("Flaeche: " + fleache + " cm^2"); // Ausgabe

    }

}

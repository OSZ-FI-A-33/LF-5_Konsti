package org.example;

import java.util.Scanner;

public class A342_Spielbank {
    public static void main() {
        /*
        Variablen vergeben
         */
        int fünf;
        int zehn;
        int zwanzig;
        int fünfzig;
        int hundert;


        Scanner input = new Scanner(System.in); // Tastatureingaben erfassen


        /*
        Ausgaben; eingaben erfassen
         */
        System.out.print("Anzahl an 5 Euro Chips: ");
        fünf = input.nextInt();
        System.out.print("Anzahl an 10 Euro Chips: ");
        zehn = input.nextInt();
        System.out.print("Anzahl an 20 Euro Chips: ");
        zwanzig = input.nextInt();
        System.out.print("Anzahl an 50 Euro Chips: ");
        fünfzig = input.nextInt();
        System.out.print("Anzahl an 100 Euro Chips: ");
        hundert = input.nextInt();

        /*
        errechnen der beträge
         */
        int chip5 = fünf * 5;
        int chip10 = zehn * 10;
        int chip20 = zwanzig * 20;
        int chip50 = fünfzig * 50;
        int chip100 = hundert * 100;

        int ergebnis = chip5 + chip10 + chip20 + chip50 + chip100; // Gesamtanzahl berechnen

        System.out.println("Ihr Auszahlungsbetrag beträgt: " + ergebnis); // Ergebnis ausgeben

    }

}

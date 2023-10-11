package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Leere Integer variablen festlegen
        int zahl1;
        int zahl2;
        int ergebnis;
        int ergebnis2;
        int ergebnis3;
        int ergebnis4;
        // Tastatureinagbe erfassen mit Scanner
        Scanner tastatur = new Scanner(System.in);
        // Eingaben abfragen und in die Variablen geben
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        zahl1 = tastatur.nextInt();
        System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");
        zahl2 = tastatur.nextInt();
        // Zahlen zusammenrechnen
        ergebnis = zahl1 + zahl2;
        ergebnis2 = zahl1 * zahl2;
        ergebnis3 = zahl1 / zahl2;
        ergebnis4 = zahl1 - zahl2;
        System.out.println();
        // Summe der Zahlen ausgeben
        System.out.println("Summe: " + ergebnis);
        System.out.println("Produkt:" + ergebnis2);
        System.out.println("Quozient:" + ergebnis3);
        System.out.println("Differenz:" + ergebnis4);
        // Rest
        double rest = zahl1 - (zahl2 * (zahl1/zahl2));
        System.out.println("Der rest beträgt: " + rest);
        // Programme beenden
        tastatur.close();
    }
}
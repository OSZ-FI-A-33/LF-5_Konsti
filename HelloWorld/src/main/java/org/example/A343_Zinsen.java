package org.example;

import java.util.Scanner;

public class A343_Zinsen {
    public static void main(String[] args) {
        /*
        Variablen vergeben
         */

        double kapital;
        double zinssatz;
        double jahre;
        double verzinst;
        double zinseszinz;
        double zins;
        double k_1;

        Scanner input = new Scanner(System.in); // Tastatureingaben erfassen

        /*
        Ausgaben; Eingaben erfassen
         */
        System.out.print("Einzahlung in Euro: ");
        kapital = input.nextDouble();
        System.out.print("Zinsen in Prozent: ");
        zinssatz = input.nextDouble();
        System.out.print("Jahre: ");
        jahre = input.nextDouble();


        /*
        Zins, Neues Kapital und Zinseszins ausrechnen
         */
        zins = kapital * jahre * (zinssatz/100);
        k_1 = kapital + zins;
        zinseszinz = kapital * Math.pow(1+zinssatz/100, jahre);


        /*
        Ausgabe
         */
        System.out.println("Der Investor hat insgesamt " + k_1 + " Euro erhalten.");
        System.out.println("Der Investor hat insgesamt " + zinseszinz + " Euro erhalten (mit Zinseszins)");

    }
}

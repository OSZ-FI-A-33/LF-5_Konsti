package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user;
        Scanner input = new Scanner(System.in);
        System.out.print("Was möchtest du machen: \"Spielbank\", \"Zinsen\", \"Rechteck\"?: ");
        user = input.next();
        if (user.equals("Spielbank")){
            A342_Spielbank.main();

        } else if (user.equals("Zinsen")) {
            A343_Zinsen.main();

        } else if (user.equals("Rechteck")) {
            A341_Rechteck.main();

        }else{

            System.out.print("Du hast eine Falsche eingabe eingeben. \nBitte überprüfe deine Rechtschreibung");

        }
    }
}
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user;
        Scanner input = new Scanner(System.in);
        System.out.print("Was möchtest du machen: \"Spielbank\", \"Zinsen\", \"Rechteck\"?: ");
        user = input.next();
        switch (user) {
            case "Spielbank" -> A342_Spielbank.main();
            case "Zinsen" -> A343_Zinsen.main();
            case "Rechteck" -> A341_Rechteck.main();
            default ->
                    System.out.print("Du hast eine Falsche eingabe eingeben. \nBitte überprüfe deine Rechtschreibung");
        }
    }
}
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        activate();
    }

    public static void activate(){
        String user;
        Scanner input = new Scanner(System.in);
        System.out.print("Was möchtest du machen: \"Spielbank\", \"Zinsen\", \"Rechteck\" oder \"Beenden\"?: ");
        user = input.next();
        switch (user) {
            case "Spielbank" -> A342_Spielbank.main();
            case "Zinsen" -> A343_Zinsen.main();
            case "Rechteck" -> A341_Rechteck.main();
            case "Beenden" -> System.exit(0);
            default ->
                    System.out.print("Du hast eine Falsche eingabe eingeben. \nBitte überprüfe deine Rechtschreibung");
        }

    }
}
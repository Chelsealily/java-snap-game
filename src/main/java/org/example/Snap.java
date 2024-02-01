package org.example;

import java.util.Scanner;

public class Snap extends CardGame{
    private static final Scanner scanner = new Scanner(System.in);
    public Snap() {
        super();
    }

    public static void playSnap() {

        Card previousCard = null;

        System.out.println("> Welcome to Snap!");
        System.out.println("Rules: Press Enter to draw a card, if it matches- SNAP");

        while ((!getDeck().isEmpty())) {

            System.out.println("~ Press Enter to take your turn...");
            scanner.nextLine();
            shuffleDeck();
            Card currentCard = dealCard();

            if ((previousCard !=null ) && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("SNAP! You win!");
                return;
        }

            previousCard = currentCard;
    }

        System.out.println("No more cards in the deck. Game over!");


    }


    public static void main(String[] args) {
        Snap snapGame = new Snap();
        playSnap();
    }

}

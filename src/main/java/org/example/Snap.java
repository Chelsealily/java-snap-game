package org.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame{
    private static final Scanner scanner = new Scanner(System.in);

    // 2 seconds timer constant
    private static final int SNAP_TIMER_DELAY = 2000;

    // snapOppurtunity is false by default then true when snap has occurred
    private static boolean snapOpportunity;

    // ensures that when a snap game begins snapOppurtunity is false and deck is shuffled
    public Snap() {
        super();
        snapOpportunity=false;
        shuffleDeck();

    }

    public static void playSnap() {
        Card previousCard = null;
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        boolean player1Turn = true;

        System.out.println("> Welcome to Snap!");
        System.out.println("Rules: Press Enter to draw a card, if it matches-");
        System.out.println("you have 2 seconds to type [SNAP] to win! \n");

        Timer timer = new Timer();

        while ((!getDeck().isEmpty())) {
            //change players
            Player currentPlayer = player1Turn ? player1 : player2;
            System.out.println("~ " + currentPlayer.getPlayerName()+"'s turn");
            System.out.println("Press Enter to take your turn...");
            scanner.nextLine();

            Card currentCard = dealCard();

            if ((previousCard !=null ) && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                snapOpportunity=true;
                System.out.println("> * type [SNAP] in 2 seconds to win! * <");

                // Start the timer
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        timer.cancel();
                        System.out.println("Times up. BAD LUCK- WHOMP WHOMP - try again o_O \n \n");
                    }
                },SNAP_TIMER_DELAY);

                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("snap")) {
                    timer.cancel();
                    System.out.println("> CONGRATS!! "+ currentPlayer.getPlayerName() +" wins! <");
                    return;
                }
            }

            previousCard = currentCard;
            player1Turn = !player1Turn; // toggle
        }

        System.out.println("No more cards in the deck. Game over!");
    }


    public static void main(String[] args) {
        Snap snapGame = new Snap();
        playSnap();
    }

}

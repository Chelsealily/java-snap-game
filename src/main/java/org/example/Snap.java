package org.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame{
    // 2 seconds timer constant
    private static final int SNAP_TIMER_DELAY = 2000;
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean timerExpired;

    // ensures that when a snap game begins deck is shuffled
    public Snap() {
        super();
        shuffleDeck();
    }

    public static void playSnap() {
        Card previousCard = null;
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        boolean player1Turn = true;
        timerExpired = false;

        System.out.println("> Welcome to Snap!");
        System.out.println("Rules: Press Enter to draw a card, if it matches-");
        System.out.println("you have 2 seconds to type [SNAP] to win! \n");

        Timer timer = new Timer();
        TimerTask timerTask = null;

        while ((!getDeck().isEmpty())) {

            //change players
            Player currentPlayer = player1Turn ? player1 : player2;
            System.out.println("~ " + currentPlayer.getPlayerName()+"'s turn");
            System.out.println("Press Enter to take your turn...");
            scanner.nextLine();

            Card currentCard = dealCard();

            if ((previousCard !=null ) && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("> * type [SNAP] in 2 seconds to win! * <");

                // Start or restart the timer
                if (timerTask != null) {
                    timerTask.cancel();
                }
                timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        timerExpired = true;
                        System.out.println("Times up. BAD LUCK- WHOMP WHOMP - try again o_O \n \n");
                        timerExpired=false;
                    }
                }; timer.schedule(timerTask, SNAP_TIMER_DELAY);

                String userInput = scanner.nextLine();
                if (!timerExpired && userInput.equalsIgnoreCase("snap")) {
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
        Snap snap = new Snap();
        playSnap();
    }

}

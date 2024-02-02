package org.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame{
    private static final Scanner scanner = new Scanner(System.in);

    // 2 seconds timer constant
    private static final int SNAP_TIMER_DELAY = 2000;
    // accesses the Timer class from the java util package
    private static Timer snapTimer;

    // snapOppurtunity is false by default then true when snap has occurred
    private static boolean snapOpportunity;

    // ensures that when a snap game begins snapOppurtunity is false and desk is shuffled
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

        while ((!getDeck().isEmpty())) {
            Player currentPlayer = player1Turn ? player1 : player2;
            System.out.println("~ " + currentPlayer.getPlayerName()+"'s turn");
            System.out.println("Press Enter to take your turn...");
            scanner.nextLine();

            Card currentCard = dealCard();

            if ((previousCard !=null ) && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("> * SNAP! " + currentPlayer.getPlayerName() + " wins! - CONGRATS");
                return;
            }

            previousCard = currentCard;
            player1Turn = !player1Turn;
        }

        System.out.println("No more cards in the deck. Game over!");

    }


    /* if snap and player wins, timer is cancelled and exited.
    private static void handleSnap(Player player) {
        //snapTimer.cancel();
        if (snapOpportunity) {
            System.out.println("SNAP! " + player.getPlayerName() + " wins!");
        }
        //System.exit(0);
    }

    // timerTask
    private static class SnapTimerTask extends TimerTask {

        @Override
        public void run() {
            snapOpportunity= true;

        }
    }*/

    public static void main(String[] args) {
        Snap snapGame = new Snap();
        playSnap();
    }

}

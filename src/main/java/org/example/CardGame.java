package org.example;

import java.util.ArrayList;

public class CardGame {

    private final String[] suit = new String[] {"\u2665", "\u2660", "\u2663", "\u2666"};
    private final String[] symbol = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q" , "K", "A"};
    private final int[] value = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    // deckOfCards array contains all 52 cards when the game is constructed
    private ArrayList<Card> deckOfCards =  new ArrayList<>();

    // getDeck Lists out the cards in the deck
    public ArrayList<Card> getDeck(){
        return deckOfCards;
    }

}

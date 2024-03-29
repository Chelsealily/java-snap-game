package org.example;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.CharSequence.compare;

public class CardGame {

    private final static String[] suit = new String[]{"\u2665", "\u2660", "\u2663", "\u2666"};
    private final static String[] symbol = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final static int[] value = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    // deckOfCards array contains all 52 cards when the game is constructed
    private static final ArrayList<Card> deckOfCards = new ArrayList<>();

    // iterates over the suits and symbols to create the 52 cards with symbols
    public CardGame() {
        for (int suitIndex = 0; suitIndex < suit.length; suitIndex++) {
            for (int symbolIndex = 0; symbolIndex < symbol.length; symbolIndex++) {
                Card card = new Card(suit[suitIndex], symbol[symbolIndex], value[symbolIndex]);
                deckOfCards.add(card);
            }
        }
    }

    // getDeck Lists out the cards in the deck
    public static ArrayList<Card> getDeck() {
        return deckOfCards;
    }


    // dealCard takes the first card from the deck and returns it
    public static Card dealCard() {
        Card dealtCard = deckOfCards.remove(0);
        System.out.println(" > " + dealtCard+ " < \n");
        return dealtCard;
    }

    //sort the deck in number order (e.g. 2222233334444) and return it
    public ArrayList<Card> sortDeckInNumberOrder() {
        deckOfCards.sort((a, b) -> compare(a.getSymbol(), b.getSymbol()));
        return deckOfCards;
    }

    // sort the deck into suit order
    public ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort((a, b) -> compare(a.getSuit(), b.getSuit()));
        return deckOfCards;
    }

    // shuffleDeck shuffles and randomizes the order of the cards
    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

}



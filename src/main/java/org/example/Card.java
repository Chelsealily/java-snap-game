package org.example;

public class Card {

    // String suit. Uses the uni-codes for {heart, club, diamond, spade}
    private final String suit;

    // String symbol {2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A }
    private final String symbol;

    // int value {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}
    private final int value;

    // constructor
    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    // getters
    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    // a toString method to describe the class
    public String toString() {
        return "[" + this.symbol + " " + this.suit + "]";
    }

}

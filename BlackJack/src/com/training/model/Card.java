package com.training.model;

public class Card {
	private Suit suit;
    private Value value;
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    public Suit getSuit() {
        return suit;
    }
    public Value getValue() {
        return value;
    }
    public char getSuitCode() {
        return suit.symbol;
    }
    public int getValueCode() {
        return value.value;
    }
    public String toString() {
        return value + " of " + suit;
    }
}

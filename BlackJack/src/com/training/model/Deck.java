package com.training.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Deck {
	private Stack<Card> deck = new Stack<Card>();
    public Deck() {
        for(Suit suit : Suit.values()) {
            for(Value value :Value.values()) {
                deck.add(new Card(suit,value));
            }
        }
        shuffle();
    }
    
    
    public Stack<Card> getDeck() {
		return deck;
	}


	public void setDeck(Stack<Card> deck) {
		this.deck = deck;
	}


	public void shuffle() {
		List<Card> deckShuffle = new ArrayList<>(deck);
        Collections.shuffle(deckShuffle);
    }
    public int cardsLeft() {
     
        return deck.size();
    }
    /*public Card dealCard() {
          // Deals one card from the deck and returns it.
        if (deck.size() == 52) {
           shuffle();
        }
        Card temp;
        temp = deck.get(0);
        remove(0);
        return temp;
    }*/
    public Card getCard(int i) {
    	Card card = null;
    	int count = 0;
        Iterator<Card> iterator = deck.iterator(); 
        while (iterator.hasNext()) {
        	count++;
           System.out.println("Value: "+iterator.next() + " "); 
           card=iterator.next();
           deck.remove(card);
           if(count==i) {
        	   break;
           }
        }
        
        return card;
    }
   /* public Card remove(int i) {
        Card c = deck.get(i);
        deck.remove(i);
        return c;
    }*/


	@Override
	public String toString() {
		return "Deck [deck=" + deck + "]";
	}   
    
    

}

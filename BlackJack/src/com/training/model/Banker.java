/*package com.training.model;

import java.util.ArrayList;
import java.util.List;

public class Banker {
	
	static Deck deck;
    static List<Card> deckOfCard;
	public Banker() {
		deck = new Deck();
		deckOfCard=deck.getDeck();
	}
	
	public void shuffle() {
		deck.shuffle();
	}
	public List<Card> getCards(int num) throws Exception {
		System.out.println(deckOfCard);
		List<Card> getCard = new ArrayList<Card>();
		for(int i=0; i<num; i++) {
		getCard.add(deck.remove(i));
		System.out.println(i);
        
		}
		return getCard;
		
	}
	 public int cardsLeft() {
	     
	    return deckOfCard.size();
	    }
}


*/
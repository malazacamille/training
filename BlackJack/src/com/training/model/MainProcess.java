package com.training.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class MainProcess {
	public static void main(String [] args) throws Exception {
		/*
		Deck deck = new Deck();
		System.out.println(deck.cardsLeft());
		System.out.println(deck.getDeck());
		deck.getCard(36);
		System.out.println(deck.getDeck());
		System.out.println(deck.cardsLeft());*/
		
		Stack<Integer> cards = new Stack<Integer>();
		for(int i =0; i < 53; i++)
        {
			cards.push(i);
        }
		
		System.out.println(Arrays.toString(cards.toArray()));
		
		for(int i =0; i < 30; i++)
        {
			  cards.pop();
	        // System.out.println(y);
        }
		
		System.out.println(Arrays.toString(cards.toArray()));
		
}
}
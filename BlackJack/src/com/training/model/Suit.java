package com.training.model;

public enum Suit {
	 CLUBS('C'),
     SPADES('S'),
     DIAMONDS('D'),
     HEARTS('H');
     public final char symbol;
     
     Suit(char c) {
         symbol = c;
     }
}

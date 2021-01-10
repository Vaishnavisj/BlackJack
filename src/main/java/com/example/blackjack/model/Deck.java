package com.example.blackjack.model;

import java.util.Random;

import com.example.blackjack.exception.InvalidCardSuitException;
import com.example.blackjack.exception.InvalidCardValueException;
import com.example.blackjack.exception.InvalidDeckPositionException;

public class Deck {
	Card[] deck = new Card[52];
	int nextCardIndex = 0;

	public Deck() throws InvalidCardValueException, InvalidCardSuitException{

		int count = 0;
		
		for (int i = 1; i <= 13; i++) {
			deck[count++] = new Card('H', i);
		}
		for (int i = 1; i <= 13; i++) {
			deck[count++] = new Card('S', i);
		}
		for (int i = 1; i <= 13; i++) {
			deck[count++] = new Card('C', i);
		}
		for (int i = 1; i <= 13; i++) {
			deck[count++] = new Card('D', i);
		}	
			
		
		
	}
	public void shuffle() throws InvalidDeckPositionException {
		Random random = new Random(); 
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < deck.length; j++) {
				swapCards(i, random.nextInt(52));
			}
		}
		nextCardIndex = 0;
		
	}
	private void swapCards(int index1, int index2) throws InvalidDeckPositionException {
		Card hold;

		isIndexValid(index1);
		isIndexValid(index2);
		hold = deck[index1];
		deck[index1] = deck[index2];
		deck[index2] = hold;		
	}
	
	private void isIndexValid(int index) throws InvalidDeckPositionException {
		if (index < 0 || index > 51) {
			throw new InvalidDeckPositionException(index);
		}
	}

}

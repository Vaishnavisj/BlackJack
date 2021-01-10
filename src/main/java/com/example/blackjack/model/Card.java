package com.example.blackjack.model;

import com.example.blackjack.exception.InvalidCardSuitException;
import com.example.blackjack.exception.InvalidCardValueException;

public class Card {
	private char suit;
	private int value;

	public Card(char newSuit, int newValue) throws InvalidCardValueException, InvalidCardSuitException {
		if (newValue < 1 || newValue > 13) {
			throw new InvalidCardValueException(newValue);
		} else {
			
			this.value = newValue;
		}
		if (newSuit != 'H' && newSuit != 'S' && newSuit != 'D' && newSuit != 'C') {
			throw new InvalidCardSuitException(newSuit);
		} else {
			this.suit = newSuit;
		}
		
		}
}

package com.example.blackjack.exception;

public class InvalidCardSuitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCardSuitException(char newSuit) {
		System.out.println("Suit is not valid");
	}

}

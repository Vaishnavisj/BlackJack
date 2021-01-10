package com.example.blackjack.exception;

public class InvalidDeckPositionException extends Exception {

	public InvalidDeckPositionException(int index) {
		System.out.println("InvalidDeckPosition");
	}

}

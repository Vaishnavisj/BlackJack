package com.example.blackjack.exception;

public class InvalidCardValueException extends Exception{

	public InvalidCardValueException(int newValue) {
		System.out.println("card number "+newValue+" is invalid");
	}

}

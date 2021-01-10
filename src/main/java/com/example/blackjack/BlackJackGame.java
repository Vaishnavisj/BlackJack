package com.example.blackjack;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.blackjack.exception.InvalidDeckPositionException;
import com.example.blackjack.model.Dealer;
import com.example.blackjack.model.Deck;
import com.example.blackjack.model.Player;

public class BlackJackGame {
	
	private Player player;
	private Deck deck;
	
	@Autowired
	private Dealer dealer;
	
	public void startGame()
	{
		//shuffle cards
		//ask player and dealer to select cards
		System.out.println("Welcome to Blackjack!");
		System.out.println("");
		System.out.println("  BLACKJACK RULES: ");
		System.out.println("	-Player is dealt 2 cards. The dealer is dealt 2 cards with one face-up and one face-down.");
		System.out.println("	-Cards are equal to their value with face cards being 10 and an Ace being 1 or 11.");
		System.out.println("	-The players cards are added up for their total.");
		System.out.println("	-Players “Hit” to gain another card from the deck. Players “Stay” to keep their current card total.");
		System.out.println("	-Dealer “Hits” until they equal or exceed 17.");
		System.out.println("	-The goal is to have a higher card total than the dealer without going over 21.");
		System.out.println("	-If the player total equals the dealer total, it is a “Push” and the hand ends."); 
		
	}
	public void shuffle() throws InvalidDeckPositionException {
		try {
			deck.shuffle();
		} catch (InvalidDeckPositionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

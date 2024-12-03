package net.duriel.cardgame;

import java.util.*;

/**
 * @version 0.0.1
 * @since 0.0.2
 * @author Duriel
 *
 */
public class Deck {
	//Class attributes
	private CardValues deck[];
	private int next;
	private int cardNumber = 45 * Board.getPlayerNumber();
	
	public Deck(boolean startShuffle) { //card number will be depending on players number, but minimum 45 + 15 * another 2 player
		deck = new CardValues[cardNumber+1]; //Add +1 to start at index 1 instead of 0
		
		//Fill deck with card with every 15 value ranks
		for (int rank = 1 ; rank <= 15 ; rank++) {
			deck[rank] = new CardValues(1, rank, rank);
			deck[rank+15] = new CardValues(2, rank, rank);
			deck[rank+30] = new CardValues(3, rank, rank);
		}
		
		next = 1; //Index of the first card is 1 so initialize next to 1
		
		if (startShuffle == true) shuffleGame();
		
	}
	
	public void shuffleGame () {
		//Need a random number
		Random randomNumber = new Random();
		
		for (int card = 1 ; card <= cardNumber ; card++) {
			//Random place in the deck depending on the number of cards
			int random = randomNumber.nextInt(cardNumber) + 1;
			
			//Card swapping
			CardValues temp = deck[card];
			deck[card] = deck[random];
			deck[random] = temp;
		}
		
		//Reset next each shuffle
		next = 1;
	}
	
	public CardValues deal() {
		if (next > (cardNumber + 1)) shuffleGame();
		
		CardValues card = deck[next];
		next++;
		
		return card;
	}

}

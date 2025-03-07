package net.duriel.cardgame;

import java.util.ArrayList;

/**
 * <p>Description :
 * This class is the hand class and will be used to retain player cards in hand.
 * It will also contain player armies before they are displayed on the board.</p>
 * @version 0.0.1
 * @since 0.0.2
 * @author Duriel
 *
 */
public class Hand {
	//Attributes
	private ArrayList cards;
	
	//Default constructor
	public Hand() {
		cards = new ArrayList();
	}
	
	//Methods
	public void addCard(CardValues card) {
		cards.add(card);
	}

}

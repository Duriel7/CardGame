package net.duriel.cardgame;

/**
 * @version 0.0.1
 * @since 0.0.2
 * @author Duriel
 *
 */
public class Player {
	//Class attributes
	private Hand hand;
	private String name;
	
	//Constructor
	public Player(String name) {
		hand = new Hand();
		this.name = name;
	}
	
	

}

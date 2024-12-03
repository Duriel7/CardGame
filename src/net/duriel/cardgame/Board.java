package net.duriel.cardgame;

/**
 * <p>Description :
 * This class is the board class used to draw and discard cards.
 * As such, it is also used to display armies of each player.</p>
 * @version 0.0.1
 * @since 0.0.2
 * @author Duriel
 *
 */
public class Board {
	//Class attributes
	private static int playerNumber;
	
	//Constructors
	
	
	//Setters
	public void setPlayNumber(int playerNumber) {
		Board.playerNumber = playerNumber;
	}
	
	//Getters
	//use getter to modify players number
	public static int getPlayerNumber() {
		//Ask for players number and return it
		int askNumber = 0;//scanner for player input
		
		playerNumber = askNumber;
		return playerNumber;
	}
	
	//Methods
	

}

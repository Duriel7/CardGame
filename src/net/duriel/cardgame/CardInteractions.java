package net.duriel.cardgame;

/**
 * 
 * <p>Description :
 * This class is used to alter card power values since soldier cards gain power when Figures are on the board.
 * Ace gain power depending on Royal Figures, and soldiers gain +1 power value for each Figures on the board.</p>
 * 
 * @since 0.0.1
 * @version 0.0.1
 * @author Duriel
 */
public class CardInteractions {
	
	private int finalValue;
	private boolean king = false;
	
	private static CardValues card = new CardValues();
	
	public int getFinalValue() {
		return finalValue;
	}
	
	public void setFinalValue(int finalValue) {
		this.finalValue = finalValue;
	}
	
	public static int powerCalculation(int power, int value) {
		if (card.getCard().contains("Ace")) {
			
		}
		return 0;
	}
    
}

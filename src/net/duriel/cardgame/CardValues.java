package net.duriel.cardgame;

/**
 * <p>Description :
 * This class is used to calculate card values depending on factions, values and power and combine those into a string to display the real name of the card.</p>
 * <p>Rules of the game :</p>
 * <p>There is factions of colors that players will use to construct armies of soldiers
 * There is a draw pile, and a discard pile where players can draw instead of taking cards from the draw pile</p>
 * <p>Depending on the number of players, there is :
 * - A maximum number of turns during which players will draw and discard cards
 * - A maximum number of turns during which players will construct their armies
 * - Possibly more than one turn of battle</p>
 * <p>Players can construct their armies into more than one battalions of how many soldiers they want
 * Cards have the power of their respective value : 2 for 2, 3 for 3... but Ace have 1 only if no royal figures are present in the deck
 * If a King, a Queen or a Butler of the same color is present, Ace have 14, 15 or 16 power depending on the figure it is under
 * Figures, Royal (King, Queen, Butler) or Military (Knight, General), give +1 power to all cards, for a total + 5 if all are present
 * Ace are different : they gain the value of the Royal Figure they are under, but do not gain the normal +1, but they gain the +1 from other Figures</p>
 * <p>Battles are an event during which power of the cards cancel each other :
 * - If one card has a too low value to attack another card, it will die, and the value of the enemy will lower to its value - the value of the attacker
 * - If the value of the attacker is higher, then its value will be reduced to its original value - the value of the enemy
 * - Cards can attack in a group and another enemy group too</p>
 * @author Duriel
 * @since 0.0.1
 * @version 0.0.2
 */
public class CardValues {
    
    private int faction;        // 1 = red ; 2 = blue ; 3 = green
    private int value;          // 1 to 15 ; 1 = Ace ; 11 = Knight ; 12 = General ; 13 = Butler ; 14 = Queen ; 15 = King
    private int power;			// power of the card after interactions with Figures
    private String card;        // name of card = value + faction

    public CardValues () {      // default constructor to Red Ace with a power of 1
        this.faction = 1;
        this.value = 1;
        this.power = 1;
    }
    
    /**
     * 
     * @param faction the color of the card
     * @param value the numeric value if the card
     * @param power the combat power of the card
     */
    public CardValues(int faction, int value, int power) { // Constructor
        this.faction = faction;
        this.value = value;
        this.power = power;
    }

    /**
     * <p>getter for faction</p>
     * @return the color of the card
     */
    public int getFaction() {
        return faction;
    }

    /**
     * <p>getter for value</p>
     * @return the numeric value of the card
     */
    public int getValue() {
        return value;
    }
    
    /**
     * <p>getter for power</p>
     * @return the combat power of the card
     */
    public int getPower() {
    	return power;
    }
    
    /**
     * <p>getter for card</p>
     * @return the name of the card
     */
    public String getCard() {
    	return card;
    }

    /**
     * <p>setter for faction</p>
     * @param faction the faction of the card
     */
    public void setFaction(int faction) {
        this.faction = faction;
    }

    /**
     * <p>setter for value</p>
     * @param value the numeric value of the card
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    /**
     * <p>setter for power</p>
     * @param power the combat power of the card
     */
    public void setPower(int power) {
    	this.power = power;
    }
    
    /**
     * <p>setter for card</p>
     * @param power the name of the card
     */
    public void setCard(String card) {
    	this.card = card;
    }
    
    /**
     * 
     * @return the card with all the parameters in its name
     */
    public String getCard(String card) {
        card = "";
        
        // faction int determines the faction color
        if (faction == 1) {
            card = "Red ";
        }
        else if (faction == 2) {
            card = "Blue ";
        }
        else if (faction == 3) {
            card = "Green ";
        }
        
        // value determines the value of the card and concatenates to faction
        if (value == 1) {
            card += "Ace";
        }     
        else if (value == 11) {
            card += "Knight";
        }
        else if (value == 12) {
            card += "General";
        }
        else if (value == 13) {
            card += "Butler";
        }
        else if (value == 14) {
            card += "Queen";
        }
        else if (value == 15) {
            card += "King";
        }
        else {
            card += Integer.toString(value);
        }
        //for Ace power, will add a function to modify its power depending on presence of Royal Figure
        //for other cards power, will add a function to modify each card value by +1 per Figure
        power = value;
        card += " (" + power + ")" ;
        
        return card;
    }
    
    // toString to get card name
    public String toString() {
        
        return getCard();
    }
}

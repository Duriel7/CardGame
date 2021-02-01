package net.duriel.cardgame;

/**
 * @author Viv.MURGUET
 */
public class CardValues {
    
    private int faction;        // 1 = red ; 2 = blue ; 3 = green
    private int value;          // 1 to 15 ; 1 = Ace ; 11 = Knight ; 12 = General ; 13 = Butler ; 14 = Queen ; 15 = King
    /*private String card;        // name of card = value + faction*/
    private boolean play;       // possibility to play or not

    public CardValues () {      // default constructor to Red Ace
        this.faction = 1;
        this.value = 1;
    }
    
    public CardValues(int faction, int value) { // Constructor
        this.faction = faction;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getFaction() {
        return faction;
    }

    public void setFaction(int faction) {
        this.faction = faction;
    }
    
    /*public int upCard(int value, int faction) {
        
        
    }*/
    
    public String getCard() {
        String card = "";
        
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
            card += " Ace";
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
        
        return card;
    }
    
    
    public String toString() {
        
        return getCard();
    }
}

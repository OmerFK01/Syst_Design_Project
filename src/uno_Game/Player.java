


package uno_Game;

import java.util.ArrayList;

/**
 *
 * @author Omer Khan
 */
public class Player {
    
    ArrayList<Uno_Card> cardsAssigned = new ArrayList<>();
    //private void playersCards;
    //int playerNumber;
    
    public Player(){
        //this.cardsAssigned = null;       
        
    }
    public void setPlayer(ArrayList<Uno_Card> ul){
        this.cardsAssigned = ul;
    }
    
    public void setPlayer(Uno_Card uc1){
        this.cardsAssigned.add(uc1);
    }
    
    public ArrayList<Uno_Card> getPlayer(){
        return this.cardsAssigned;
    }
}

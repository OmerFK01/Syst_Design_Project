
package uno_Game;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 *
 * @author Omer Khan
 * Setting the playability of the game. 
 * This class deals with calling the players
 * It keeps track of the deck 
 * and gives a player a card when it was requested.
 * Sorts deck
 * check if player won
 */
public class SettingCards {

    public static void distributeCards(int numPlayers){
        
        //ArrayList<Uno_Card> playersCards; 
        Player[] players = new Player[numPlayers];
        while(numPlayers > 0){
        
            int numInitialCards = 7;
            Player p1 = new Player(); 
            //System.out.println("\nPlayer number " + numPlayers + ": ");
            while(numInitialCards > 0){
                Uno_Card uc1;
                uc1 = Uno_Main.mainDeck.remove(0);
                //System.out.println(uc1.getUno_Card());
                
                p1.setPlayer(uc1);
                //p1.cardsAssigned.add(uc1);
                numInitialCards--;
            }
            
            players[numPlayers - 1] = p1;            
            numPlayers--;
        }
        showCards(players);
        
    }
    
    private static void showCards (Player[] players){
        for(int i = 0; i < players.length; i++){
            
            System.out.println("\nPlayer " + (i+1) + " Cards: ");
            
            //Getting Player cards to display. For each player
            ArrayList<Uno_Card> cards = players[i].getPlayer();
            int index = 0;         
            while (cards.size() > index)
            {
                System.out.println(cards.get(index++).getUno_Card());
            }
            //}
        }
    }
        
        
    
}

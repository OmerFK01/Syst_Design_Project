


package uno_Game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Omer Khan
 */
public class Uno_Main {

    public static ArrayList<Uno_Card> mainDeck = new ArrayList<>(100);
    
    public static void main(String[] args) throws Exception{
        
        
        
        
        int numPlayers;
        boolean check;
        check = true;
        while(check){
        
            System.out.println("******************************");
            System.out.println("+++Welcome to the Uno Game++++");
            System.out.println("******************************");

            System.out.print("Please enter the number of players (2 - 4): ");
            Scanner players = new Scanner (System.in);
            String input = players.nextLine();
            if (isNumOrNot(input) && (Integer.parseInt(input))<5 && (Integer.parseInt(input)>1)){
                check = false;
                numPlayers = Integer.parseInt(input);
                System.out.println("Setting up game for " + numPlayers + " players.");
                
                //Setting up a new game & storing the shuffled cards in the mainDeck
                UnoDeck_Generate game1 = new UnoDeck_Generate();
                mainDeck = game1.Generate();
                
                //Distributing the cards to the players.
                SettingCards.distributeCards(numPlayers);
                
                
                
                
                   

            }
            else{
                System.out.println("Please enter a valid input for number of players, and try again!");
                check = true;
            }
           
                }
    }
    
    static boolean isNumOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}

package uno_Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Omer Khan
 */
public class UnoDeck_Generate {

    public ArrayList<Uno_Card> Generate(){
        int deck = 0;
        ArrayList<Uno_Card> deckCards = new ArrayList<>();
        //Random rand1 = new Random();
        
        while(deck < 2){
            
            //for(int num_iteration = 0;num_iteration < 10; num_iteration++ ){
                //for(int i = 0; i < 4; i ++){
                     
                     
                     Arrays.asList(UnoCard_Number.values()).forEach(UnoCard_Number -> {
                         
                         Arrays.asList(UnoCard_Color.values()).forEach(UnoCard_Color -> {
                           deckCards.add(new Uno_Card(UnoCard_Number, UnoCard_Color));
                             
                         });
                         
                         
                         
                     }); 
                    //for (UnoCard_Number : UnoCard_Number.values()) {
                    
                    //UnoCard_Number.Two;
                    //}
                    //}
            deck++;
            }
            /*for (Uno_Card i : deckCards) { 		      
                System.out.println(deckCards.);       
                deckCards[i].      
                    }*/
            
            int rem = 0;
            
            while(rem < 4){
                Uno_Card u1 = deckCards.get(deckCards.size() - 1);
                deckCards.remove(u1);
                rem++;
            }
            Collections.shuffle(deckCards);
            //shuffle(deckCards);
            /*int index = 0;         
            while (deckCards.size() > index)
            {
                System.out.println(deckCards.get(index++).getUno_Card());
            }
            */
            return deckCards;
        }
    
    /*public void shuffle(ArrayList<Uno_Card> deckCards){
        ArrayList<Uno_Card> deckShuffeld = new ArrayList<>(100);
        for(int i = 0; i < 100; i++){
            deckShuffeld.add(null);
        }
          Random rand1 = new Random();
          int location;
          
        int index = 0;         
        while (deckCards.size() > index)
        {
            location = rand1.nextInt(100);
            deckShuffeld.add(location,deckCards.get(index++));
        }
        index = 0;         
            while (deckShuffeld.size() > index)
            {
                System.out.println(deckShuffeld.get(index++).getUno_Card());
            }
    }*/
        

    }


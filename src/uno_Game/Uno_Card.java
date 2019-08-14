


package uno_Game;

/**
 *
 * @author Omer Khan
 */
public class Uno_Card {

    private UnoCard_Number number;
    private UnoCard_Color color;
    
    public Uno_Card(UnoCard_Number v, UnoCard_Color c)
    {
        this.number = v;
        this.color = c; 
    }
    
    
     
    public String getUno_Card(){
        return(this.number + ", " + this.color);
    }
}

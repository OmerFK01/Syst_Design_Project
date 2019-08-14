


package uno_Game;


/**
 *
 * @author Omer Khan
 * //WildCard, WildDrawFour, DrawTwo, SkipCard, ReverseCard,
 */
public enum UnoCard_Number {
   One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Skip, Reverse, Draw2, Zero;
   
    public static UnoCard_Number getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
   
   
}

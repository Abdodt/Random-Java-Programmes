import java.util.IllegalFormatConversionException;

/**
 * soldiersgame This is where the game runs.
 */
public class soldiersgame {

    public static void main(String[] args) 
    {
        Soldiers steve = new Soldiers("Steve",900,140,90);
        Soldiers redskull = new Soldiers("Redskull",900,80,90) ;
        battle.StartFight(steve, redskull);
    }
    
}
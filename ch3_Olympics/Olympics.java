import kareltherobot.*;

/**
   Creates a robot that competes in the olympics
   It uses the commands from the ironman to create a robot that competes in the olympics

   @author  Albert
   @version 1/18/17

   @author  Period 4
   @author  Assignment - ch3_Olympics

   @author  Sources Albert
 */
public class Olympics implements Directions
{
    
    
    /**
     * Does the directions
     * @param args
     */
    public static void main( String args[] )
    {
        Triathlete ironman = new Triathlete( 4, 3, East, 0 );

        ironman.runRace();
        ironman.turnOff();
    }

    static
    {
        World.reset();
        World.readWorld( "triathlon.wld" );
        World.setDelay( 10 );
        World.setVisible( true );
    }
}

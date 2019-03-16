import kareltherobot.*;





// This creates it



/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author Albert Su
 * @version Jan 20, 2016
 * @author Period:4
 * @author Assignment: ch3_8Carpeter
 *
 * @author Sources: Peck
 */

public class CarpeterTest implements Directions
{
    /**
     * This creates a carpeter and then runs the blueprint and then turns it
     * off, but the carpet is there
     * 
     * @param args arguements
     *  
     * 
     */

    public static void main( String args[] )
    {
        CarpetLayer carpeter = new CarpetLayer( 9, 2, South, infinity);
        
        carpeter.layCarpet();
        
        carpeter.turnOff();


    }





    static
    {
        World.reset();
        // creates world
        World.readWorld( "carpeter.wld" );
        World.setDelay( 1 );
        World.setVisible( true );

    }

}


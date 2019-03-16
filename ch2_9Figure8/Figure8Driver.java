import kareltherobot.*;

/**
 *  Driver for the Figure8 class
 *
 *  @author  George Peck
 *  @version 08/31/10
 *  @author Period: 1-7
 *  @author Assignment: Figure8
 *
 *  @author Sources: Dave Wittry
 */
public class Figure8Driver implements Directions
{
    /**
     * Driver to make Karel walk a figure-8 pattern.
     * 
     * @param args command-line arguments not used
     */
    public static void main( String args[] )
    {
        // TODO: declare a Figure8 named eight

        // TODO: invoke eights's doFigure8 method

        // eight.turnOff();
    }

    static
    {
        World.reset();
        World.readWorld( "ch2_9.wld" );
        World.setDelay( 10 );
        World.setVisible( true );
    }
}
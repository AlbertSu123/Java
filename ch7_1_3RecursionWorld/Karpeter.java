import kareltherobot.*;
import java.awt.Color;
/**
 * 
 *  BeeperMover.
 *  It is smartbot
 *
 *  @author  asu995
 *  @version Feb 13, 2017
 *  @author  Period: 4
 *  @author  Assignment: ch7_1_3RecursionWorld
 *
 *  @author  Sources: Peck
 */

public class Karpeter extends SmartBot
{
    public Karpeter( int st, int av, Direction dir, int beeps, Color badge )
    {
        super( st, av, dir, beeps, badge );
    }

/**
 * 
 * puts Beepers in Hallway
 * @return
 */
    /**
     * Puts beepers around any shape with 90 degree angles.
     */
    public int carpetHallway()
    {
        if ( nextToABeeper() )
        {
            return 0;
        }
        if ( frontIsClear() && !nextToABeeper() )
        {
            putBeeper();
            move();
        }
        else
        {
            putBeeper();
            turnRight();
            move();
        }
        return carpetHallway() + 1;
    }
}
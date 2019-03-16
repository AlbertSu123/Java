import kareltherobot.*;
import java.awt.Color;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author Albert Su
 * @version Feb 13, 2017
 * @author Period: 4
 * @author Assignment: ch7_1_3RecursionWorld
 *
 * @author Sources: Peck
 */
public class WestWallBeeperGetter extends SmartBot
{
    public WestWallBeeperGetter( int st, int av, Direction dir, int beeps, Color badge )
    {
        super( st, av, dir, beeps, badge );
    }


    /**
     * Goes to the farthest west wall and then picks up the beeper.
     */
    public void getBeeper()
    {
        faceWest();
        if ( !frontIsClear() )
        {
            pickBeeper();
            return;
        }
        move();
        getBeeper();
        if ( !facingEast() )
        {
            faceEast();
        }
        move();
    }
}

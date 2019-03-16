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
public class BeeperMover extends SmartBot
{
    public BeeperMover( int st, int av, Direction dir, int beeps, Color badge )
    {
        super( st, av, dir, 0, badge );
    }


    public void moveBeepersNorth()
    {
        findStart();
        pickAndTranslateSelfToTheNorth();
        turnLeft();
        move();
        dropRow();
    }


    /**
     * finds the first beeper and stop at the place of the beeper.
     */
    private void findStart()
    {
        if ( nextToABeeper() )
        {
            return;
        }
        move();
        findStart();
    }


    /**
     * Picks up the beepers, and then moven the number of beepers it picked up.
     */
    private void pickAndTranslateSelfToTheNorth()
    {
        if ( !nextToABeeper() )
        {
            turnLeft();
            return;
        }
        pickBeeper();
        move();
        pickAndTranslateSelfToTheNorth();
        move();

    }


    /**
     * Drops all the beepers that it picked up consecutively in the direction it
     * is facing.
     */
    private void dropRow()
    {
        if ( anyBeepersInBeeperBag() )
        {
            putBeeper();
            move();
            dropRow();
        }
        return;
    }
}


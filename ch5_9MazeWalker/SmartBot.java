import kareltherobot.*;


/**
 * 
 * this is the smartbot class and it extends robot
 *
 *  @author  asu995
 *  @version Jan 25, 2017
 *  @author  Period: TODO
 *  @author  Assignment: ch5_9MazeWalker
 *
 *  @author  Sources: TODO
 */

public class SmartBot extends Robot
{
    /**
     * Default Robot constructor.
     * 
     * @param st     initial street
     * @param av     initial avenue
     * @param dir    direction this robot is facing
     * @param numBeepers  number of beepers this robot has in its beeper bag
     */
    public SmartBot( int st, int av, Direction dir, int numBeepers )
    {
        super( st, av, dir, numBeepers );
    }


    /**
     * Check if the position to the right of the current postion is clear.
     * 
     * @return false if there is a wall to the right of the current position,
     *         true otherwise
     */
    public boolean rightIsClear()
    {
        turnRight();
        if (frontIsClear())
        {
            turnLeft();
            return true;
        }
        turnLeft();
        return false;
    }


    /**
     * Change this robot's postion 90 degrees to the right.
     */
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

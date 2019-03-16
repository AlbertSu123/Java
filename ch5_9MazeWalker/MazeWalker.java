import kareltherobot.*;


/**
 * mazewalkers creates a robot capable of walking mazes
 * this is the mazewalker
 *
 * @author Albert Su
 * @version Jan 25, 2017
 * @author Period: 4
 * @author Assignment: ch5_9MazeWalker
 *
 * @author Sources: Peck
 */

public class MazeWalker extends SmartBot
{
    /**
     * @param st
     *            street
     * @param av
     *            avenue
     * @param dir
     *            direction
     * @param numBeepers
     *            number of beepers
     */
    public MazeWalker( int st, int av, Direction dir, int numBeepers )
    {
        super( st, av, dir, numBeepers );
    }


    /**
     * 
     * @param st
     *            street
     * @param av
     *            avenue
     * @param dir
     *            direction
     * @param numbeeps
     *            beepers(number)
     */

    /**
     * creates a path for robot
     */

    /**
     * precondition: there is a wall directly to the right of this robot
     * postcondition: moves along the wall one step keeping its position so that
     * the wall remains on its right
     */

    public void followWallRight()
    {
        if ( rightIsClear() )
        {
            turnRight();
            move();
        }
        else if ( frontIsClear() )
        {
            move();
            if ( rightIsClear() )
            {
                turnRight();
                move();
                if ( rightIsClear() )
                {
                    turnRight();
                    move();
                }
            }
        }
        else
        {
            turnLeft();
        }
    }
}
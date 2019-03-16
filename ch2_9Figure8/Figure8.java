import kareltherobot.*;

/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  TODO Your Name
 *  @version TODO Assignment Date
 *  @author  Period: TODO Your Period
 *  @author  Assignment: KJR Chapter 2, Problem 9 - Figure8
 *
 *  @author  Sources: TODO list collaborators
 */
public class Figure8 extends UrRobot
{
    /**
     * Default constructor for an UrRobot
     * 
     * @param st    street
     * @param ave   avenue
     * @param dir   direction robot is facing
     * @param beeps number of beepers
     */
    public Figure8( int st, int ave, Direction dir, int beeps )
    {
        super( st, ave, dir, beeps );
    }

    /**
     * TODO Complete method comment
     */
    public void doFigure8()
    {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
    }
}

import kareltherobot.*;

/**
 *  Test the followWallRight ability of a MazeWalker Robot
 *
 *  @author  Albert Su
 *  @version 1/24/17
 *
 *  @author  Period - 4
 *  @author  Assignment - ch5_9MazeWalker
 *
 *  @author  Sources - Peck
 */
public class MazeWalkerTest implements Directions
{
    /**
     * Test method to 
     * check all four conditions of the followWallRight behavior
     * of a MazeWalker object.
     * @param args  command line arguments (not used)
     */
    
    public static void main( String args[] )
    {
        MazeWalker karel = null;

        karel = new MazeWalker( 2, 2, North, 0 );
        karel.followWallRight();

        karel = new MazeWalker( 2, 7, North, 0 );
        karel.followWallRight();

        karel = new MazeWalker( 7, 2, North, 0 );
        karel.followWallRight();

        karel = new MazeWalker( 7, 7, North, 0 );
        karel.followWallRight();

        karel.turnOff();
    }
/**
 * creates the world
 */
    static
    {
        World.reset();
        World.readWorld( "righttest.wld" );
        World.setDelay( 10 );
        World.setVisible( true );
    }
}

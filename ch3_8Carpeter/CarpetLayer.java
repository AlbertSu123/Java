import kareltherobot.*;



// TODO: this lays the carpets

/**
 *  TODO This creates a carpet
 *  which allows you to put a carpet between a wall
 *  @author  Albert Su
 *  @version Jan 20, 2016
 *  @author  Period: 4
 *  @author  Assignment: ch3_8Carpeter
 *
 *  @author  Sources:Peck
 */

public class CarpetLayer extends BetterTurner
{
    /**
     * 
     * @param st street
     * @param av avenue
     * @param dir direction
     * @param beeps beepers
     */

    public CarpetLayer( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );
    }



    /**
     * This is the skeleton of the whole class on what it is going to do.
     */

    public void layCarpet()
    {
        laycolumn();
        turnLeft();
        laycolumn();
        turnLeft();
        laycolumn();
        turnLeft();
        laycolumn();
        turnLeft();

    }

    

    /**
     * this puts a beeper and then moves forward.
     */

    private void moveBeeper()
    {
        putBeeper();
        move();
    }

    

    /**
     * this doubles the put beeper so I dont have to write it twice.
     */

    private void doubleMoveback()
    {
        moveBeeper();
        moveBeeper();
    }

    /**

     * this lays one column with the first one blank.

     */

    private void laycolumn()

    {

        move();
        doubleMoveback();
        doubleMoveback();
        doubleMoveback();
        putBeeper();

    }

    

}
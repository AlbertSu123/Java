import kareltherobot.*;

/**
   This creates a triatholon runner

   @author  Albert
   @version 1/18/17

   @author  Period 4
   @author  Assignment - ch3_Olympics

   @author  Sources - Albert
 */
public class Triathlete extends BetterTurner
{
    /**
     * @param st street
     * @param av avenue
     * @param dir direction
     * @param beeps beepers number
     */
    public Triathlete( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );
    }
    /**
     * builds a triathalon
     */
    public void runRace()
    {
        sprint();
        hurdle();
        move();
        move();
        climb();
        plantBeepers();
        goHome();
       
    }
    /**
     * runs the race
     */
    public void sprint()
    {
        pickBeeperandmove();
        pickBeeperandmove();
        pickBeeperandmove();
        pickBeeperandmove();
        pickBeeperandmove();
        pickBeeperandmove();
        pickBeeperandmove();
        
   
        
    }
    /**
     * makes the robot go home
     */
    public void goHome()
    {
        turnAround();
        moveMile();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        
    }
    /**
     * 
     * moves the robot one mile
     */
    public void moveMile()
    {
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        
    }
    /**
     * picks up a beeper and moves
     */
    public void pickBeeperandmove()
    {
        move();
        pickBeeper();
       
    }
    /**
     * plants 7 beepers in a row
     */
    public void plantBeepers()
    {
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
        
    }
    /**
     * Jumps over the hurdle
     */
    public void hurdle()
    {
        move();
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
        
    }
    /**
     * Climbs the stairs.
     */
    public void climb()
    {
        climbOnestep();
        climbOnestep();
        climbOnestep();
        climbOnestep();
        

        
    }
    /**
     * Climbs one step
     */
    public void climbOnestep()
    {
        
        turnLeft();
        move();
        turnRight();
        move();
        
        
    }
}
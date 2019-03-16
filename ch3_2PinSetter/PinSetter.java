import kareltherobot.*;

/**
 * Pinsetter extends better turner is the class
 */

public class PinSetter extends BetterTurner
{
/**
 * 
 * @param st street
 * @param av avenue
 * @param dir direction
 * @param beeps beepers
 */
    public PinSetter( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );
    }
/**
 * 
 * creates the project
 */
    public void setPins()
    {
        move();
        setTriangle();
        moveToPin6From3();
        setTriangle();
        moveToPin4From10();
        setTriangle();
        moveToPin5From8();
        putBeeper();
        moveBackHome();
        
    }
/**
 * 
 * sets triangle
 */
    private void setTriangle()
    {
        this.putBeeper();
        this.move();
        this.turnLeft();
        this.move();
        this.putBeeper();
        this.turnAround();
        this.move();
        this.move();
        this.putBeeper();
        
        
    }
/**
 * sets move
 */
    private void moveToPin6From3()
    {
        turnLeft();
        move();
        turnRight();
        move();
        turnLeft();
       
    }
    
/**
 * moves pin
 */
    
    private void moveToPin4From10()
    {
        turnRight();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        move();
        turnRight();
        
    }
/**
 * moves pin
 */
    private void moveToPin5From8()
    {
        this.move();
        this.turnRight();
        this.move();
       
    }
/**
 * moves robot
 */
    private void moveBackHome()
    {
        move();
        move();
        move();
        turnAround();
        
    }
}
import kareltherobot.*;

/**
 *  A MountainClimber robot climbs a mountain and then plant a flag,
 *  represented by a beeper, on the summit; The robot then descends the
 *  other side of the mountain. The MountainClimber starts with the
 *  flag-beeper in the beeper-bag
 *
 *  @author   Albert Su
 *  @version  January 9 2016
 *  @author  Period: 4
 *  @author  Assignment: KJR Chapter 2, Problem 6 - MountainClimber
 *
 *  @author  Sources: Albert Su
 */
public class MountainClimber extends UrRobot
{
    public MountainClimber( int st, int ave, Direction dir, int beeps )
    {
       super( st, ave, dir, beeps );
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void climbMountain()
    {
      turnLeft();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      move();
      turnRight();
      move();
      putBeeper();
      move();
      turnRight();
      move();
      turnLeft();
      move();
      turnRight();
      move();
      move();
      turnLeft();
     
    }
}

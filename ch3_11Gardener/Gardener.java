import kareltherobot.*;

/**
    TODO Write a one-sentence summary of your class here.
    TODO Follow it with additional details about its purpose, what abstraction
    it represents, and how to use it.

    @author  TODO Your Name
    @version TODO Date

    @author  Period - TODO Your Period
    @author  Assignment - ch3_Olympics

    @author  Sources - TODO list collaborators
*/
public class Gardener extends BetterTurner
{
    public Gardener( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );       
    }
    
    public void plantGarden()
    {
        this.turnLeft();
        this.moveStraight();
        this.turnLeft();
        this.putBeeperandmoveonegarden();
        this.turnLeft();
        this.putBeeperandmoveonegarden();
        this.turnRight();
        this.putBeeperandmove();
        this.turnRight();
        this.putBeeperandmoveonegarden();
        this.turnLeft();
        this.putBeeperandmoveonegarden();
        this.turnRight();
        this.putBeeper();
        this.move();
        this.turnRight();
        this.putBeeperandmoveonegarden();
        this.turnLeft();
        this.putBeeperandmoveonegarden();
        this.turnRight();
        this.putBeeper();
        this.move();
        this.turnRight();
        this.putBeeperandmoveonegarden();
        this.turnLeft();
        this.putBeeperandmoveonegarden();
        this.turnRight();
        this.moveStraight();
        this.turnRight();
        
        
        
        
    }
    
    private void moveStraight()
    {
        this.move();
        this.move();
        this.move();
    }
    private void putBeeperandmoveonegarden()
    {
        this.putBeeperandmove();
        this.putBeeperandmove();
        this.putBeeperandmove();
    }
    private void putBeeperandmove()
    {
        this.putBeeper();
        this.move();
    }
    
}
    
    

    // TODO: complete methodss
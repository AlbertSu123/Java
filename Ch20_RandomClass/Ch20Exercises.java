import java.util.*;

/**
 * Chapter 20 - Random Class Exercises 3, 5, 7 & 8.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Ch20Exercises
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch20Exercises
{
    Scanner scan;
    Random rand = new Random();

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch20Exercises()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     * @param seed  seed to use for random number generator
     */
    public Ch20Exercises( String str, long seed )
    {
        scan = new Scanner( str );
        rand.setSeed( seed );
    }

    /**
     * TODO Description
     */
    public void furtherImprovedGuessingGame()
    {
        // begin with the simplest form and keep improving it??? but save the
        // other forms in case they are necessary
        int round = 1;
        int wins = 0;
        while ( round < 11 )
        {
            System.out.println( "\n" + "round: " + round + "\n" );
            int num = rand.nextInt( 10 ) + 1;
            System.out.println( "I am thinking of a number from 1 to 10." );
            System.out.println( "You must guess what it is in three tries." + "\n" + "Enter a guess:" );
            int guess = scan.nextInt();
            if ( guess != num )
            {
                if ( Math.abs( guess - num ) >= 3 )
                {
                    System.out.println( "cold" );

                }
                else if ( Math.abs( guess - num ) == 2 )
                {
                    System.out.println( "warm" );

                }
                else if ( Math.abs( guess - num ) == 1 )
                {
                    System.out.println( "hot" );
                }
                System.out.println( "Guess again:" );
                guess = scan.nextInt();

                if ( guess != num )
                {
                    if ( Math.abs( guess - num ) >= 3 )
                    {
                        System.out.println( "cold" );

                    }
                    else if ( Math.abs( guess - num ) == 2 )
                    {
                        System.out.println( "warm" );

                    }
                    else if ( Math.abs( guess - num ) == 1 )
                    {
                        System.out.println( "hot" );
                    }
                    System.out.println( "Guess again:" );
                    guess = scan.nextInt();
                    if ( guess != num )
                    {

                        System.out.println( "wrong." );
                        System.out.println( "The correct number was " + num + "\n" + "You have lost the game." );
                    }
                    else
                    {
                        System.out.println( "RIGHT!" + "\n" + "You have won the game." );
                        wins = wins + 1;
                    }

                }
                else
                {
                    System.out.println( "RIGHT!" + "\n" + "You have won the game." );
                    wins = wins + 1;
                }
            }
            else
            {
                System.out.println( "RIGHT!" + "\n" + "You have won the game." );
                wins = wins + 1;
            }
            System.out.println( "You have won " + wins + " out of " + round + " rounds." );
            round = round + 1;

        }

        if ( wins <= 7 )
        {
            System.out.println( "Your rating: amateur." );
        }
        else if ( wins == 8 )
        {
            System.out.println( "You rating: advanced." );
        }
        else if ( wins == 9 )
        {
            System.out.println( "You rating: professional." );
        }
        else
        {
            System.out.println( "You rating: hacker." );
        }
    }


    // Exercise 1
    /**
     * int num = rand.nextInt(10)+1; System.out.println(
     * "I am thinking of a number from 1 to 10."); System.out.println(
     * "You must guess what it is in three tries." + "\n" + "Enter a guess:");
     * int guess = scan.nextInt(); if (guess != num) {
     * System.out.println("wrong"); System.out.println("Guess again:"); guess =
     * scan.nextInt(); if (guess != num) { System.out.println("wrong");
     * System.out.println("Guess again:"); guess = scan.nextInt(); if (guess !=
     * num) { System.out.println("wrong"); System.out.println(
     * "The correct number was " + num + "\n" + "You have lost the game."); }
     * else { System.out.println("RIGHT!" + "\n" + "You have won the game."); }
     * } else { System.out.println("RIGHT!" + "\n" + "You have won the game.");
     * }
     * 
     * } else { System.out.println("RIGHT!" + "\n" + "You have won the game.");
     * } }
     * 
     * ex 2
     *
     * public void furtherImprovedGuessingGame() { // begin with the simplest
     * form and keep improving it??? but save the // other forms in case they
     * are necessary int num = rand.nextInt( 10 ) + 1; System.out.println(
     * "I am thinking of a number from 1 to 10." ); System.out.println(
     * "You must guess what it is in three tries." + "\n" + "Enter a guess:" );
     * int guess = scan.nextInt(); if ( guess != num ) { if ( Math.abs( guess -
     * num ) >= 3 ) { System.out.println( "cold" );
     * 
     * } else if ( Math.abs( guess - num ) == 2 ) { System.out.println( "warm"
     * );
     * 
     * } else if ( Math.abs( guess - num ) == 1 ) { System.out.println( "hot" );
     * } System.out.println( "Guess again:" ); guess = scan.nextInt();
     * 
     * if ( guess != num ) { if ( Math.abs( guess - num ) >= 3 ) {
     * System.out.println( "cold" );
     * 
     * } else if ( Math.abs( guess - num ) == 2 ) { System.out.println( "warm"
     * );
     * 
     * } else if ( Math.abs( guess - num ) == 1 ) { System.out.println( "hot" );
     * } System.out.println( "Guess again:" ); guess = scan.nextInt(); if (
     * guess != num ) {
     * 
     * System.out.println( "wrong." ); System.out.println(
     * "The correct number was " + num + "\n" + "You have lost the game." ); }
     * else { System.out.println( "RIGHT!" + "\n" + "You have won the game." );
     * }
     * 
     * } else { System.out.println( "RIGHT!" + "\n" + "You have won the game."
     * ); } } else { System.out.println( "RIGHT!" + "\n" +
     * "You have won the game." ); }
     * 
     * }


    /**
     * TODO Description
     */
    public void passwordCracker()
    {
        // TODO Your code goes here
    }

    /**
     * TODO Description
     */
    public void randomWalk2D()
    {
        // TODO Your code goes here
    }

    /**
     * TODO Description
     */
    public void squareRootGame()
    {
        // TODO Your code goes here
    }

    /**
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch20Exercises exercise = new Ch20Exercises();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (3) Further Improved Guessing Game" );
            System.out.println( "   (5) Password Cracker" );
            System.out.println( "   (7) 2D Random Walk" );
            System.out.println( "   (8) Suqare Root Game" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '3':
                        exercise.furtherImprovedGuessingGame();
                        break;
                    case '5':
                        exercise.passwordCracker();
                        break;
                    case '7':
                        exercise.randomWalk2D();
                        break;
                    case '8':
                        exercise.squareRootGame();
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        }
        while ( !done );

        System.out.println( "Goodbye!" );
    }
}

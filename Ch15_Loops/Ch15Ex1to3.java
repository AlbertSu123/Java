import java.util.*;

/**
 * Chapter 15 - Loops Exercises 1-3.
 * 
 * @author Albert  Su
 * @version 3/21/17
 * @author Period - 4
 * @author Assignment - Ch15Ex1to3
 * @author Sources - Peck
 */
public class Ch15Ex1to3
{
    /**
     * wow its a scanner
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch15Ex1to3()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch15Ex1to3( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * writes 2 numbers and all in between
     */
    public void inclusiveIntegers()
    {
        System.out.print( "Enter Start:" );
        int start = scan.nextInt();
        System.out.print( "Enter Finish:" );
        int finish = scan.nextInt();
        int x = start;
        while (x <= finish)
        {
            System.out.println(x);
            x = x + 1;
        }
    }

    /**
     * Repeats word as many times as letters
     */
    public void repeatWord()
    {
        System.out.print( "Enter A Word: " );
        String word = scan.nextLine();
        int times = word.length();
        int x = 0;
        while (x < times )
        {
            System.out.println( word );
            x = x + 1;
        }
    }

    /**
     * Two words
     */
    public void twoWords()
    {
        System.out.print( "Enter first word: " );
        String wordOne = scan.nextLine();
        int timesOne = wordOne.length();
        System.out.print("Enter second word:");
        String wordTwo = scan.nextLine();
        int timesTwo = wordTwo.length();
        int x = 0;
        System.out.print(wordOne);
        while ( timesTwo + timesOne + x < 30 )
        {
            System.out.print(".");
            x = x + 1;
        }
        System.out.print(wordTwo);
    }

    /**
     * Testing method: instantiates a Ch15Ex1to3 object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch15Ex1to3 exercise = new Ch15Ex1to3();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Inclusive Integers" );
            System.out.println( "   (2) Repeat Word" );
            System.out.println( "   (3) Two Words" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.inclusiveIntegers();
                        break;
                    case '2':
                        exercise.repeatWord();
                        break;
                    case '3':
                        exercise.twoWords();
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
        } while ( !done );
        
        System.out.println( "Goodbye!" );
    }
}

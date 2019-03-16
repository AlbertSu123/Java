import java.util.*;


/**
 * Chapter 16 - More About Counting Loops Exercises 1-3.
 * 
 * @author Albert
 * @version 3/23
 * 
 * @author Period - 4
 * @author Assignment - Ch16Ex1_3
 * 
 * @author Sources - peck
 */
public class Ch16Ex1to3
{
    /**
     * hi
     */
    Scanner scan;


    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch16Ex1to3()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public Ch16Ex1to3( String str )
    {
        scan = new Scanner( str );
    }


    /**
     * 
     * @return sum hi
     *            adds
     */

    public int addingUpInts()

    {

        int sum = 0;

        int numInt;

        int count = 1;

        int num;

        System.out.println( "How many integers will be added:" );

        numInt = scan.nextInt();

        while ( count <= numInt )

        {
            count = count + 1;

            System.out.println( "Enter an integer:" );

            num = scan.nextInt();

            sum = num + sum;

        }

        // System.out.println( "The sum is " + sum );

        return sum;

    }


    /**
     * @return invsum
     *            inv sum
     */
    public double inverseSum()

    {

        double invSum = 0.0;

        int n;

        int count = 1;

        double inv = 0;

        System.out.println( "Enter N" );

        n = scan.nextInt();

        while ( count <= n )

        {

            inv = 1.0 / count;

            count = count + 1;

            invSum = inv + invSum;

        }

        // System.out.println( "Sum is: " + invSum);

        return invSum;

    }


    /**
     * the hardest part
     * 
     * @return stdDev
     */
    public double stdDeviation()

    {

        double stdDev = 0.0;

        int n;

        int count = 1;

        double num;

        double avSq = 0.0;

        double av = 0.0;

        double avgSquare;

        double avg;

        System.out.println( "Enter N" );

        n = scan.nextInt();

        while ( count <= n )

        {

            count = count + 1;

            System.out.println( "Enter an integer:" );

            num = scan.nextDouble();

            avSq = num * num + avSq;

            av = av + num;

        }

        avg = ( av / n ) * ( av / n );

        avgSquare = avSq / n;

        stdDev = Math.sqrt( avgSquare - avg );

        // System.out.println( "The standard devation is" + stdDev );

        return stdDev;

    }


    /**
     * Testing method: instantiates a Ch16Ex1to3 object and then invokes each
     * method.
     * 
     * @param args
     *            command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch16Ex1to3 exercise = new Ch16Ex1to3();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Adding up Integers" );
            System.out.println( "   (2) Inverse Sum" );
            System.out.println( "   (3) Standard Deviation" );
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
                        int sumOfInts = exercise.addingUpInts();
                        System.out.println( "addingUpInts() = " + sumOfInts );
                        break;
                    case '2':
                        double invSum = exercise.inverseSum();
                        System.out.println( "inverseSum() = " + invSum );
                        break;
                    case '3':
                        double stdDev = exercise.stdDeviation();
                        System.out.println( "stdDeviation() = " + stdDev );
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

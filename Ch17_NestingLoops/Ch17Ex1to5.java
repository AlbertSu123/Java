import java.util.*;


/**
 * 
 * Chapter 17 - Nesting Loops and ifs Exercises 1-5
 * 
 * 
 * 
 * @author Albert Su
 * 
 * @version 3/23/17
 * 
 * 
 * 
 * @author Period - 4
 * 
 * @author Period Assignment - Ch17Ex1to5
 * 
 * 
 * 
 * @author Sources - None
 * 
 */

public class Ch17Ex1to5

{

    /**
     * 
     * Constructs a scanner to identify objects and elements for input values.
     * 
     */

    Scanner scan;


    /**
     * 
     * Constructs a Scanner for input from the console.
     * 
     */

    public Ch17Ex1to5()

    {

        scan = new Scanner( System.in );

    }


    /**
     * 
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * 
     * 
     * @param str
     * 
     *            input for the various methods
     * 
     */

    public Ch17Ex1to5( String str )

    {

        scan = new Scanner( str );

    }


    /**
     * 
     * The following program calculates the amount of time someone would take to
     * 
     * recover from jetlag according to their flight time and time difference
     * 
     * and other factors.
     * 
     * 
     * 
     * @return gives the number of days.
     * 
     */

    public double jetLagCalc()

    {

        double daysOfRecovery = 0.0;

        System.out.println( "Hours:" );

        int hours = scan.nextInt();

        System.out.println( "Zones:" );

        int zones = scan.nextInt();

        System.out.println( "Depart:" );

        int depart = scan.nextInt();

        System.out.println( "Arrive:" );

        int arrive = scan.nextInt();

        if ( 8 <= depart && depart < 12 )

        {

            depart = 0;

        }

        if ( 12 <= depart && depart < 18 )

        {

            depart = 1;

        }

        if ( 18 <= depart && depart < 22 )

        {

            depart = 3;

        }

        if ( 22 <= depart && depart < 1 )

        {

            depart = 4;

        }

        if ( 1 <= depart && depart < 8 )

        {

            depart = 5;

        }

        if ( 8 <= arrive && arrive < 12 )

        {

            arrive = 4;

        }

        if ( 12 <= arrive && arrive < 18 )

        {

            arrive = 2;

        }

        if ( 18 <= arrive && arrive < 22 )

        {

            arrive = 0;

        }

        if ( 22 <= arrive && arrive < 1 )

        {

            arrive = 1;

        }

        if ( 1 <= arrive && arrive < 8 )

        {

            arrive = 3;

        }

        daysOfRecovery = ( ( hours / 2.0 ) +

            ( zones - 3 ) + depart + arrive ) / 10.0;

        return daysOfRecovery;

    }


    /**
     * 
     * This adds up cubes
     * 
     * 
     * 
     * @return gives the sums of squares and cubes.
     * 
     */

    public long[] addUpSquaresAndCubes()

    {

        long sumSquares = 0;

        long sumCubes = 0;

        System.out.println( "Upper Limit:" );

        int n = scan.nextInt();

        sumSquares = ( n * ( n + 1 ) * ( 2 * n + 1 ) ) / 6;

        sumCubes = ( n * n * ( n + 1 ) * ( n + 1 ) ) / 4;

        return new long[] { sumSquares, sumCubes };

    }


    /**
     * 
     * The following program finds the power of an exponent of double x raised
     * 
     * to the int y
     * 
     * 
     * 
     * @return gives the power of a number.
     * 
     */

    public double powerOfANumber()

    {

        double pow = 1.0;

        System.out.println( "Enter X:" );

        double x = scan.nextDouble();

        System.out.println( "Enter Y:" );

        int y = scan.nextInt();

        if ( y == 0 )

        {

            pow = 1.0;

        }

        else if ( y > 0 )

        {

            while ( y != 0 )

            {

                pow = pow * x;

                y = y - 1;

            }

        }

        else

        {

            while ( y != 0 )

            {

                pow = pow * 1.0 / x;

                y = y + 1;

            }

        }

        System.out.println( x + " raised to the power " + y + " is: " + pow );

        return pow;

    }


    /**
     * 
     * This program creates a wedge of stars on the left side of the program in
     * 
     * descending order starting with a given value of stars.
     * 
     */

    public void wedgeOfStars()

    {

        System.out.println( "Initial number of stars:" );

        int inX = scan.nextInt();

        while ( inX > 0 )

        {

            for ( int i = 0; i < inX; i++ )

            {

                System.out.print( "*" );

            }

            System.out.println( "" );

            inX = inX - 1;

        }

    }


    /**
     * 
     * The program creates a tree made of *s with the inputed number of *s in
     * 
     * the end. It starts at one and goes down from that consecutively.
     * 
     */

    public void pineTree()

    {

        System.out.println( "Enter the height of the tree:" );

        int valHeight = scan.nextInt();

        int cVal = valHeight;

        String stars = "*";

        String spaces = "";

        int counter = 0;

        String newString = "";

        String starsOnBothSides = "";

        int newwVar = 0;

        String countingString = "*";

        int copyOfUserVal = valHeight;

        while ( copyOfUserVal - 1 != 0 )

        {

            countingString = "*" + countingString;

            newwVar = countingString.length();

            copyOfUserVal--;

        }

        String officialSpace = "";

        int newrVar = newwVar;

        while ( newwVar - 1 != 0 )

        {

            officialSpace = officialSpace + " ";

            newwVar--;

        }

        System.out.println( officialSpace + stars );

        while ( valHeight - 1 != 0 )

        {

            spaces = "";

            stars = "*" + stars;

            counter = 1;

            while ( newrVar - stars.length() - counter >= 0 )

            {

                spaces = spaces + " ";

                counter++;

            }

            starsOnBothSides = "*" + starsOnBothSides;

            newString = spaces + stars + starsOnBothSides;

            System.out.println( newString );

            valHeight--;

        }

        String endingSpaces = "";

        while ( cVal - 2 != 0 )

        {

            endingSpaces = endingSpaces + " ";

            cVal--;

        }

        System.out.println( endingSpaces + "***" );

        System.out.println( endingSpaces + "***" );

        System.out.println( endingSpaces + "***" );

    }


    /**
     * 
     * Testing method: instantiates a Ch17Ex1to4 object and then invokes each
     * 
     * method.
     * 
     * 
     * 
     * @param args
     * 
     *            command line parameters (not used)
     * 
     */

    public static void main( String[] args )

    {

        Scanner kbd = new Scanner( System.in );

        boolean done = false;

        Ch17Ex1to5 ex = new Ch17Ex1to5();

        do

        {

            System.out.println();

            System.out.println();

            System.out.println( "Make a selection" );

            System.out.println();

            System.out.println( "   (1) Jet Lag Calculator" );

            System.out.println( "   (2) Adding up Squares and Cubes" );

            System.out.println( "   (3) Power of a number" );

            System.out.println( "   (4) Wedge of Stars" );

            System.out.println( "   (5) Pine Tree" );

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

                        double daysOfRecovery = ex.jetLagCalc();

                        System.out.println( "Days of recovery: "

                            + daysOfRecovery );

                        break;

                    case '2':

                        long[] sums = ex.addUpSquaresAndCubes();

                        System.out.println( "Sum of squares: " + sums[0] );

                        System.out.println( "Sum of cubes : " + sums[1] );

                        break;

                    case '3':

                        double pow = ex.powerOfANumber();

                        System.out.println( "powerOfANumber() = " + pow );

                        break;

                    case '4':

                        ex.wedgeOfStars();

                        break;

                    case '5':

                        ex.pineTree();

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
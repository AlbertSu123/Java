import java.util.*;


/**
 * 
 * Chapter 12 - Decision Making Programming Exercises 1-9.
 * 
 * 
 * 
 * @author William Chung
 * 
 * @version 03/14/17
 * 
 * 
 * 
 * @author Period - 4
 * 
 * @author Assignment - Ch12Ex1to9
 * 
 * 
 * 
 * @author Sources - None
 * 
 */

public class Ch12Ex1to9

{

    /**
     * 
     * This is a scanner.
     * 
     */

    Scanner scan;


    /**
     * 
     * Constructs a Scanner for input from the console.
     * 
     */

    public Ch12Ex1to9()

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

    public Ch12Ex1to9( String str )

    {

        scan = new Scanner( str );

    }


    /**
     * 
     * A program that asks for the amount of purchases, then calculates the
     * 
     * discounted price. The purchase amount will be input in cents (as an
     * 
     * integer)
     * 
     */

    public void discountPrices()

    {

        double amount;

        System.out.println( "Enter amount of purchases:" );

        amount = scan.nextInt();

        int x = (int)amount;

        if ( amount > 1000 )

        {

            amount = ( amount - ( amount * 0.10 ) );

            x = (int)amount;

        }

        System.out.println( "Discounted price: " + x );

    }


    /**
     * 
     * This program checks if there are the correct
     * 
     * number of nuts bolts, and washers in the order.
     * 
     */

    public void orderChecker()

    {

        System.out.println( "Number of bolts: " );

        int numBolts = scan.nextInt();

        System.out.println( "Number of nuts: " );

        int numNuts = scan.nextInt();

        System.out.println( "Number of washers: " );

        int numWashers = scan.nextInt();

        if ( ( numWashers >= numBolts * 2 ) && ( numNuts >= numBolts ) )

        {

            System.out.println( "Order is OK." );

        }

        else

        {

            if ( numNuts < numBolts )

            {

                System.out.println( "Check the Order: too few nuts" );

            }

            if ( numWashers < numBolts * 2 )

            {

                System.out.println( "Check the Order: too few washers" );

            }

        }

        final int boltsPrice = ( 5 * numBolts );

        final int nutsPrice = ( 3 * numNuts );

        final int washersPrice = ( 1 * numWashers );

        System.out.println( "Total Cost: "

            + ( boltsPrice + nutsPrice + washersPrice ) );

    }


    /**
     * 
     * A program to help drivers decide if they need gas.
     * 
     */

    public void lastChanceGas()

    {

        System.out.println( "Tank capacity:" );

        int tank = scan.nextInt();

        System.out.println( "Gage reading:" );

        int gage = scan.nextInt();

        System.out.println( "Miles per gallon:" );

        int mpg = scan.nextInt();

        if ( ( ( tank * ( gage / 100.0 ) ) * mpg ) < 200 )

        {

            System.out.println( "Get Gas" );

        }

        else

        {

            System.out.println( "Safe to Proceed" );

        }

    }


    /**
     * 
     * The program calculates the cost
     * 
     * per pound of lean (non-fat) beef for each
     * 
     * package and writes out which is the best value.
     * 
     */

    public void groundBeefValueCalc()

    {

        System.out.println( "Price per pound package A:" );
        double priceA = scan.nextDouble();
        System.out.println( "Percent lean package A:" );
        double percentA = scan.nextDouble();
        System.out.println( "Price per pound package B:" );
        double priceB = scan.nextDouble();
        System.out.println( "Percent lean package B:" );
        double percentB = scan.nextDouble();
        double costA = ( (priceA / percentA) * 100 );
        double costB = ( (priceB / percentB) * 100 );
        System.out.println( "Package A cost per pound of lean:" + costA );
        System.out.println( "Package B cost per pound of lean:" + costB );
        String bestVal = "X";
        if ( costA > costB )
        {
            bestVal = "B";
        }
        else
        {
            bestVal = "A";
        }
        System.out.println( "Package " + bestVal + " is the best value" );
    }


    /**
     * 
     * a program that asks a user for their birth year encoded as two digits
     * 
     * (like "62") and for the current year, also encoded as two digits (like
     * 
     * "99"). The program is to correctly write out the users age in years.
     * 
     */

    public void y2KProblemDetector()

    {

        System.out.println( "Year of Birth: " );

        int birthYear = scan.nextInt();

        System.out.println( "Current year: " );

        int currentYear = scan.nextInt();

        int fullBirthYear;

        if ( currentYear - birthYear < 0 )

        {

            fullBirthYear = 1900 + birthYear;

        }

        else

        {

            fullBirthYear = 2000 + birthYear;

        }

        System.out.println( "Your age: "

            + ( ( currentYear + 2000 ) - fullBirthYear ) );

    }


    /**
     * 
     * Calculates the wind chill index given the
     * 
     * temps outside and the velocity of the wind.
     * 
     */

    public void windChillIndex()

    {

        System.out.println( "v:" );

        double v = scan.nextDouble();

        System.out.println( "t:" );

        double t = scan.nextDouble();

        double wCI = 0;

        if ( v <= 4.0 && v >= 0.0 )

        {

            wCI = t;

        }

        else

        {

            if ( v >= 45.0 )

            {

                wCI = ( 1.6 * t ) - 55;

            }

            else

            {

                wCI = ( 91.4 + ( ( 91.4 - t ) * ( ( 0.0203 * v )

                    - ( 0.304 * Math.sqrt( v ) ) - 0.474 ) ) );

            }

        }

        System.out.println( "WCI: " + wCI );

    }


    /**
     * 
     * Calculates someone's age to the seconds
     * 
     */

    public void yourAgeInSeconds()

    {

        System.out.println( "Years: " );

        int y = scan.nextInt();

        System.out.println( "Months: " );

        int m = scan.nextInt();

        System.out.println( "Days" );

        int d = scan.nextInt();

        int daysFromYears = y * 365;

        int daysFromMonths = 0;

        while ( m > 0 )

        {

            if ( m == 1 || m == 3 || m == 5 || m == 7 || m == 9 || m == 11 )

            {

                daysFromMonths = daysFromMonths + 31;

                m = m - 1;

            }

            if ( m == 2 || m == 4 || m == 6 || m == 8 || m == 10 || m == 12 )

            {

                if ( m == 2 )

                {

                    daysFromMonths = daysFromMonths + 28;

                    m = m - 1;

                }

                else

                {

                    daysFromMonths = daysFromMonths + 30;

                    m = m - 1;

                }

            }

        }

        int allDays = ( daysFromYears + daysFromMonths + d );

        int ageInSec = allDays * 24 * 60 * 60;

        System.out.println( "Age In Seconds: " + ageInSec );

    }


    /**
     * 
     * This gives the price for movie tickets
     * 
     */

    public void matineeMovieTickets()

    {

        {

            System.out.println( "Age:" );

            int age = scan.nextInt();

            System.out.println( "Time" );

            int time = scan.nextInt();

            double cost = 0;

            if ( time < 1700 )

            {

                if ( age > 13 )

                {

                    cost = 5.0;

                    System.out.println( "Cost: " + cost );

                }

                else

                {

                    cost = 2.0;

                    System.out.println( "Cost: " + cost );

                }

            }

            else

            {

                if ( age > 13 )

                {

                    cost = 8.0;

                    System.out.println( "Cost: " + cost );

                }

                else

                {

                    cost = 4.0;

                    System.out.println( "Cost: " + cost );

                }

            }

        }

    }


    /**
     * 
     * Cost
     * 
     */

    public void midnightMadness()

    {

        System.out.println( "Age:" );

        int age = scan.nextInt();

        System.out.println( "Time" );

        int time = scan.nextInt();

        double mCost;

        if ( time > 2200 )

        {

            if ( age < 13 )

            {

                System.out.println( "Too Young" );

            }

            else

            {

                mCost = 4.0;

                System.out.println( "Cost: " + mCost );

            }

        }

        else if ( time < 1700 )

        {

            if ( age > 13 )

            {

                mCost = 5.0;

                System.out.println( "Cost: " + mCost );

            }

            else

            {

                mCost = 2.0;

                System.out.println( "Cost: " + mCost );

            }

        }

        else

        {

            if ( age > 13 )

            {

                mCost = 8.0;

                System.out.println( "Cost: " + mCost );

            }

            else

            {

                mCost = 4.0;

                System.out.println( "Cost: " + mCost );

            }

        }

    }


    /**
     * 
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * 
     * each method.
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

        Ch12Ex1to9 exercise = new Ch12Ex1to9();

        do

        {

            System.out.println();

            System.out.println();

            System.out.println( "Make a selection" );

            System.out.println();

            System.out.println( "    (1) Discount Prices" );

            System.out.println( "    (2) Order Checker" );

            System.out.println( "    (3) Last Chance Gas" );

            System.out.println( "    (4) Ground Beef Value Calculator" );

            System.out.println( "    (5) Y2K Problem Detector" );

            System.out.println( "    (6) Wind Chill Index" );

            System.out.println( "    (7) Your Age in Seconds" );

            System.out.println( "    (8) Matinee Movie Tickets" );

            System.out.println( "    (9) Midnight Madness" );

            System.out.println( "    (Q) Quit" );

            System.out.println();

            System.out.print( "Enter a choice:  " );

            String response = kbd.nextLine();

            if ( response.length() > 0 )

            {

                System.out.println();

                switch ( response.charAt( 0 ) )

                {

                    case '1':

                        exercise.discountPrices();

                        break;

                    case '2':

                        exercise.orderChecker();

                        break;

                    case '3':

                        exercise.lastChanceGas();

                        break;

                    case '4':

                        exercise.groundBeefValueCalc();

                        break;

                    case '5':

                        exercise.y2KProblemDetector();

                        break;

                    case '6':

                        exercise.windChillIndex();

                        break;

                    case '7':

                        exercise.yourAgeInSeconds();

                        break;

                    case '8':

                        exercise.matineeMovieTickets();

                        break;

                    case '9':

                        exercise.midnightMadness();

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
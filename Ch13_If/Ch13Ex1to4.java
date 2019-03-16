import java.util.*;


/**
 * 
 * Chapter 13 - Single-branch if Statements Programming Exercises 1-4
 * 
 * 
 * 
 * @author Albert Su
 * 
 * @version 3/15/17
 * 
 * 
 * 
 * @author Period - 4
 * 
 * @author Assignment - Ch13Ex1to4
 * 
 * 
 * 
 * @author Sources - Peck
 * 
 */

public class Ch13Ex1to4

{

    /**
     * 
     * this is the scanner used to detect lines and data types.
     * 
     */

    Scanner scan;


    /**
     * 
     * Constructs a Scanner for input from the console.
     * 
     */

    public Ch13Ex1to4()

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

    public Ch13Ex1to4( String str )

    {

        scan = new Scanner( str );

    }


    /**
     * 
     * This program writes the cost of the internet order
     */

    public void internetDelicatessen()

    {

        System.out.println( "Enter the item: " );

        String item = scan.nextLine();

        System.out.println( "Enter the price: " );

        int price = scan.nextInt();

        System.out.println( "Overnight delivery (0==no, 1==yes): " );

        int yn = scan.nextInt();

        double ship;

        if ( 1000 <= price )

        {

            ship = 300;

        }

        else

        {

            ship = 200;

        }

        if ( yn == 1 )

        {

            ship = ship + 500;

        }

        System.out.println( "Invoice:" );

        System.out.println( '\t' + item + '\t' + price / 100.0 );

        System.out.println( '\t' + "shipping" + '\t' + ship / 100.0 );

        System.out.println( '\t' + "total" + '\t' + ( ship + price ) / 100.0 );

    }


    /**
     * 
     * a program that writes the best possible efficency
     * 
     */

    public void steamEngineEfficiency()

    {

        System.out.println( "Tair: " );

        int tair = scan.nextInt();

        System.out.println( "Tsteam:" );

        int steamTemp = scan.nextInt();

        double efficiency;

        if ( 373 > steamTemp )

        {

            efficiency = 0.0;

        }

        else

        {

            efficiency = 1 - ( ( tair + 0.0 ) / steamTemp );

        }

        System.out.println( "Steam Engine Efficiency: " + efficiency );

    }


    /**
     * 
     * a program that asks the user for the number of items and the single-item
     * 
     * heating time.
     * 
     */

    public void microwaveOven()

    {

        System.out.println( "Number of items: " );

        int numOfitems = scan.nextInt();

        System.out.println( "Heating time for one item: " );

        double heatTime = scan.nextInt();

        double totalTime = 0;

        if ( 1 == numOfitems )

        {

            totalTime = heatTime;

        }

        if ( 2 == numOfitems )

        {

            totalTime = heatTime * 1.5;

        }

        if ( 3 == numOfitems )

        {

            totalTime = heatTime * 2;

        }

        if ( 3 < numOfitems )

        {

            System.out.println( " Not recommended." );

        }

        else

        {

            System.out.println( "Recomended heat time: "

                + totalTime + " seconds" );

        }

    }


    /**
     * 
     * Writes out numbers (idk why this is a game)
     * 
     */

    public void fantasyGame()

    {

        System.out.println( "Enter the name of your character: " );

        String name = scan.nextLine();

        System.out.println( "Enter strength (1-10): " );

        int strength = scan.nextInt();

        System.out.println( "Enter health (1-10): " );

        int health = scan.nextInt();

        System.out.println( "Enter luck (1-10): " );

        int luck = scan.nextInt();

        int total = ( strength + health + luck );

        if ( total > 15 )

        {

            System.out.println( "You have given "

                + "your character too many points!" );

            System.out.println( "Default values have been assigned: " );

            strength = 5;

            health = 5;

            luck = 5;

            System.out.println( name + ", strength: " + strength + ", health: "

                + health + ", luck: " + luck );

        }

        else

        {

            System.out.println( name + ", strength: " + strength + ", health: "

                + health + ", luck: " + luck );

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

        Ch13Ex1to4 exercise = new Ch13Ex1to4();

        do

        {

            System.out.println();

            System.out.println();

            System.out.println( "Make a selection" );

            System.out.println();

            System.out.println( "   (1) Internet Delicatessen" );

            System.out.println( "   (2) Steam Engine Efficiency" );

            System.out.println( "   (3) Microwave Oven" );

            System.out.println( "   (4) Fantasy Game" );

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

                        exercise.internetDelicatessen();

                        break;

                    case '2':

                        exercise.steamEngineEfficiency();

                        break;

                    case '3':

                        exercise.microwaveOven();

                        break;

                    case '4':

                        exercise.fantasyGame();

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

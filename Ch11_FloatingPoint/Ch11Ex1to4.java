import java.util.Scanner;

/**
 
   @author  Anav C
   @version 3/8/17

   @author  Period - 4
   @author  Assignment - Ch11_FloatingPoint

   @author  Sources - none
 */
public class Ch11Ex1to4
{
    /**
     * This is the scanner that scans
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch11Ex1to4()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str input for the various methods
     */
    public Ch11Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * calculates annual cost
     */
    public void annualCost()
    {
        System.out.print("Enter cost per kilowatt-hour  in cents:" );
        double kilowattHour = scan.nextDouble();
        System.out.print("Enter kilowatt-hours used per year" );
        double perYear = scan.nextDouble();
        System.out.print("Annual cost:" + ( kilowattHour * perYear ) / 100 );
      
    }

    /**
     * Calculates speed of falling brick
     */
    public void fallingBrick()
    {
        System.out.print("Enter the number of seconds:" );
        double seconds = scan.nextDouble();
        double distance = (1.0 / 2) * 32.174 
                        * seconds * seconds;
        System.out.print("The brick fell " + distance +
            " feet in " + seconds + " seconds." );
        System.out.print("Enter the distance: " );
        double realDistance = scan.nextDouble();
        double time = Math.sqrt( (2 * realDistance ) 
            / 32.174);
        System.out.print("The brick fell " + distance +
            " feet in " + time + "seconds." );

    }

    /**
     * does the base 2 log
     */
    public void base2Log()
    {
        System.out.print( "Enter a number:" );
        double number = scan.nextDouble();
        double log2 = Math.log(number) / Math.log(2); 
        System.out.print( "Base 2 log of " + number + " is " + log2 );
    }

    /**
     * finds arithmetic and harmonic means
     */
    public void harmonicMean()
    {
        System.out.print( "Enter X:" );
        double x = scan.nextDouble();
        System.out.print( "Enter Y:" );
        double y = scan.nextDouble();
        System.out.print("Arithmetic Mean: " + ( x + y ) / 2);
        System.out.print("Harmonic Mean: " + 2 / ( 1 / x + 1 / y ));
        
        
    }

    /**
     * Testing method: instantiates a Ch11Ex1_4 object and then
     * invokes each method
     * 
     * @param args command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch11Ex1to4 exercise = new Ch11Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Annual Cost of Running an Appliance" );
            System.out.println( "    (2) Falling Brick" );
            System.out.println( "    (3) Base 2 Logarithm of a Number" );
            System.out.println( "    (4) Harmonic Mean" );
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
                        exercise.annualCost();
                        break;
                    case '2':
                        exercise.fallingBrick();
                        break;
                    case '3':
                        exercise.base2Log();
                        break;
                    case '4':
                        exercise.harmonicMean();
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

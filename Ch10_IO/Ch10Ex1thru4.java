import java.util.Scanner;

/**
    It lets you type numbers
    You can call it by importing
    
    @author  Anav
    @version 3/6/17
    
    @author   Period - 4
    @author   Assignment - Ch10_IO
    
    @author   Sources - none
 */
public class Ch10Ex1thru4
{
    /**
     * this is the scanner
     */
    Scanner scan;

    /**
     *  Constructs a Scanner for input from the console.
     */
    public Ch10Ex1thru4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * @param str input for the various method
     */
    public Ch10Ex1thru4( String str )
    {
        scan = new Scanner( str );
    }

    /**
      Calculates are of the circle from the radians
     */
    public void areaOfACircle()
    {
        System.out.print("Input the radius:");
        double radius = scan.nextInt();
        double area = Math.PI * radius * radius ;
        System.out.print("The radius is:" + radius + "The area is:" + area);
        
    }

    /**
      Converts Cents to Dollars
     */
    public void centsToDollars()
    {
        System.out.print("Input the cents:");
        int cents = scan.nextInt();
        int numberOfDollars = ( cents ) / 100;
        int remainder = cents % 100;
        System.out.println( "That is " + numberOfDollars +
             " dollars and " + remainder + " cents." );

        
       
    }

    /**
      When you give money we give you change in certain denominations
     */
    public void correctChange()
    {
        System.out.println( "Input number of cents: " );
        int cents = scan.nextInt();
        int numOfDollars = cents / 100;
        cents = cents % 100;
        int quarters = cents / 25;
        cents = cents % 25;
        int dimes = cents / 10;
        cents = cents % 10;
        int nickels = cents / 5;
        int pennies = cents % 5;
        System.out.println( "Your change is: " + numOfDollars + 
            " dollars, " + quarters + " quarters, " + dimes + " dimes, " +
                        nickels + " nickels, and " + 
                            pennies + " cents." );

    }

    /**
      Does Ohms law
     */
    public void ohmsLaw()
    {
        System.out.println( "Input the voltage:" );
        int volts = scan.nextInt();
        System.out.println( "Input the resistance:" );
        int resist = scan.nextInt();
        System.out.println( "Current: " + ( volts + 0.0 ) / resist );
    }

    /**
      Testing method: instantiates a Lesson10Exercises object and then invokes
      each method.

      @param args  command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner w = new Scanner( System.in );
        boolean done = false;

        Ch10Ex1thru4 exercise = new Ch10Ex1thru4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Area of a Circle" );
            System.out.println( "    (2) Cents to Dollars" );
            System.out.println( "    (3) Correct Change" );
            System.out.println( "    (4) Ohm's Law" );
            System.out.println( "    (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = w.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.areaOfACircle();
                        break;
                    case '2':
                        exercise.centsToDollars();
                        break;
                    case '3':
                        exercise.correctChange();
                        break;
                    case '4':
                        exercise.ohmsLaw();
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

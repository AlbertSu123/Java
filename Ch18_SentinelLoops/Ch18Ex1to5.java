import java.util.*;


/**
 * Chapter 18 - Sentinel Controlled Loops Exercises 1-5.
 * 
 * @author Albert
 * @version 3/30/17
 * 
 * @author Period - 4
 * @author Your Period
 * @author Assignment - Ch18Ex1to5
 * 
 * @author Sources - n
 */
public class Ch18Ex1to5
{
    /**
     * Scans
     */
    Scanner scan;


    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch18Ex1to5()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public Ch18Ex1to5( String str )
    {
        scan = new Scanner( str );
    }


    /**
     * Calculates miles per gallon
     */
    public void milesPerGallon()
    {
        System.out.println( "Initial miles: " );
        int initial = scan.nextInt();
        if ( initial < 0 )
        {
            System.out.println( "bye" );
        }
        System.out.println( "Final miles: " );
        int f = scan.nextInt();
        System.out.println( "Gallons: " );
        int gallons = scan.nextInt();
        if ( initial > 0 )
        {
            System.out.println(
                "Miles per Gallon: " + ( 1.0 * ( f - initial ) ) / gallons );
        }
    }


    /**
     * Adds range
     */
    public void inRangeAdder()
    {
        System.out.println( "Low end of range: " );
        int low = scan.nextInt();
        System.out.println( "High end of range: " );
        int high = scan.nextInt();
        System.out.println( "Enter data: " );
        int value = scan.nextInt();
        int inner = 0;
        int outter = 0;
        while ( value != 0 )
        {
            if ( value >= low && value <= high )
            {
                inner += value;
            }
            else
            {
                outter += value;
            }
            System.out.println( "Enter data: " );
            value = scan.nextInt();
        }
        System.out.println( "Sum of in range values: " + inner );
        System.out.println( "Sum of out of range values: " + outter );
    }


    /**
     * Calculates shipping fee
     */
    public void shippingCostCalc()
    {
        System.out.println( "Weight of Order: " );
        int weight = scan.nextInt();
        if ( weight == 0 )
        {
            System.out.println( "bye" );
        }
        while ( weight != 0 )
        {
            double cost = 3;
            if ( weight > 10 )
            {
                cost = .25 * ( weight - 10 ) + 3;
            }
            System.out.println( "Shipping cost: " + cost );
            System.out.println( "Weight of Order: " );
            weight = scan.nextInt();
        }
    }


    /**
     * Calculates area
     */
    public void areaOfRectangle()
    {
        System.out.println( "First corner X coordinate: " );
        int firstx = scan.nextInt();
        System.out.println( "First corner Y coordinate: " );
        int firsty = scan.nextInt();
        System.out.println( "Second corner X coordinate: " );
        int secondx = scan.nextInt();
        System.out.println( "Second corner Y coordinate: " );
        int secondy = scan.nextInt();
        int width = ( Math.abs( firstx - secondx ) );
        int height = ( Math.abs( firsty - secondy ) );
        int area = width * height;
        System.out.print( "Width: " + width );
        System.out.print( "Width: " + height );
        System.out.println( "Area: " + width * height );
        while ( area != 0 )
        {
            System.out.println( "First corner X coordinate: " );
            firstx = scan.nextInt();
            System.out.println( "First corner Y coordinate: " );
            firsty = scan.nextInt();
            System.out.println( "Second corner X coordinate: " );
            secondx = scan.nextInt();
            System.out.println( "Second corner Y coordinate: " );
            secondy = scan.nextInt();
            width = ( Math.abs( firstx - secondx ) );
            height = ( Math.abs( firsty - secondy ) );
            area = width * height;
            System.out.print( "Width: " + width );
            System.out.print( "Width: " + height );
            System.out.println( "Area: " + width * height );
        }
        System.out.println( "finished" );
    }


    /**
     * Simulates login
     */
    public void loginSimulator()
    {
        System.out.println( "User Name: " );
        String username = scan.nextLine();
        System.out.println( "Password: " );
        String password = scan.nextLine();
        if ( username.equals( "joy" ) )
        {
            if ( password.equals( "sun" ) )
            {
                System.out.println( "You have logged on with priority 4" );
            }
        }
        else
        {
            System.out.println( "Logon failed" );
        }
        if ( username.equals( "gates" ) )
        {
            if ( password.equals( "monopoly" ) )
            {
                System.out.println( "You have logged on with priority 1" );
            }
        }
        else
        {
            System.out.println( "Logon failed" );
        }
        if ( username.equals( "jobs" ) )
        {
            if ( password.equals( "apple" ) )
            {
                System.out.println( "You have logged on with priority 3" );
            }
        }
        else
        {
            System.out.println( "Logon failed" );
        }
        if ( username.equals( "root" ) )
        {
            if ( password.equals( "secret" ) )
            {
                System.out.println( "You have logged on with priority 5" );
            }
        }
        else
        {
            System.out.println( "Logon failed" );
        }
        while ( !username.equals( "quit" ) || !password.equals( "exit" ) )
        {
            System.out.println( "User Name: " );
            username = scan.nextLine();
            System.out.println( "Password: " );
            password = scan.nextLine();
            if ( username.equals( "joy" ) )
            {
                if ( password.equals( "sun" ) )
                {
                    System.out.println( "You have logged on with priority 4" );
                }
            }
            else
            {
                System.out.println( "Logon failed" );
            }
            if ( username.equals( "gates" ) )
            {
                if ( password.equals( "monopoly" ) )
                {
                    System.out.println( "You have logged on with priority 1" );
                }
            }
            else
            {
                System.out.println( "Logon failed" );
            }
            if ( username.equals( "jobs" ) )
            {
                if ( password.equals( "apple" ) )
                {
                    System.out.println( "You have logged on with priority 3" );
                }
            }
            else
            {
                System.out.println( "Logon failed" );
            }
            if ( username.equals( "root" ) )
            {
                if ( password.equals( "secret" ) )
                {
                    System.out.println( "You have logged on with priority 5" );
                }
            }
            else
            {
                System.out.println( "Logon failed" );
            }
        }
        if ( username.equals( "quit" ) )
        {
            if ( password.equals( "exit" ) )
            {
                System.out.println( "System shutting down." );
                System.out.println( "Bye." );
            }
        }
        else
        {
            System.out.println( "Logon failed" );
        }
    }


    /**
     * Testing method: instantiates a Ch18Ex1to5 object and then invokes each
     * method.
     * 
     * @param args
     *            command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch18Ex1to5 exercise = new Ch18Ex1to5();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Miles per Gallon" );
            System.out.println( "   (2) In-range Adder" );
            System.out.println( "   (3) Shipping Cost Calculator" );
            System.out.println( "   (4) Area of Rectangles" );
            System.out.println( "   (5) Login simulator" );
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
                        exercise.milesPerGallon();
                        break;
                    case '2':
                        exercise.inRangeAdder();
                        break;
                    case '3':
                        exercise.shippingCostCalc();
                        break;
                    case '4':
                        exercise.areaOfRectangle();
                        break;
                    case '5':
                        exercise.loginSimulator();
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
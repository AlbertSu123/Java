import java.util.*;

/**
 * Chapter 19 - Result-controlled Loops Exercises 1-4.
 * 
 * @author Albert Su
 * @version  3/29/17
 * 
 * @author Period - 4
 * @author Assignment - Ch19Ex1to4
 * 
 * @author Sources - None
 */
public class Ch19Ex1to4
{
    /**
     * scanner
     */
    Scanner scan; 
    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch19Ex1to4()
    {
        scan = new Scanner( System.in );
    }
 
 
    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public Ch19Ex1to4( String str )
    {
        scan = new Scanner( str );
    }
 
 
    /**
     * find amount needed to pay each month
     */
    public void creditCardBill()
    {
 
        System.out.println( "balance:" );
        double balance = scan.nextDouble();
 
        System.out.println( "rate" );
        double rate = scan.nextDouble();
        System.out.println( "monthly pay" );
        double monthlyPay = scan.nextDouble();
        double totalPay = 0;
        int month = 0;
 
        while ( balance > monthlyPay )
        {
            balance = balance * ( 1 + rate / 100 ) - 100;
            month++;
            totalPay = totalPay + monthlyPay;
            System.out.println( "Month: " + month + "       balance: "
                + balance + "     total payments: " + totalPay );
        }
 
        totalPay = totalPay + monthlyPay - 100;
        month = month + 1;
        totalPay = totalPay + balance;
        balance = balance - balance;
        System.out.println( "Month: " + month + "       balance: " + balance
            + "     total payments: " + totalPay );
    }
 
 
    /**
     * funny equation
     */
    public void drugPotency()
    {
        // month: 0 effectiveness: 100.0
        int month = 1;
        double effectiveness = 100.0;
        String discarded = "";
        while ( effectiveness >= 50.0 )
        {
            effectiveness = effectiveness - ( effectiveness * 0.04 );
            if ( effectiveness < 50.0 )
            {
                discarded = " DISCARDED";
            }
            System.out.println( "month: " + month + "        effectiveness: "
                + effectiveness + discarded );
            month++;
        }
 
    }
 
 
    /**
     * find e^x
     */
    public void eToX()
    {
        System.out.println( "Enter x:" );
        double x = scan.nextDouble();
        int n = 1;
        double sum = 1;
        double term = 1;
        while ( term > 1.0e-12 )
        {
            term = term * x / n;
            sum = sum + term;
 
            System.out.println( "n:" + n + "     term: " + term
                + "               sum: " + sum );
            n++;
 
        }
    }
 
 
    /**
     * calculate 1/x
     */
    public void newtons1overX()
    {
        System.out.println( "A:" );
        double a = scan.nextDouble();
        System.out.println( "B:" );
        double b = scan.nextDouble();
        double recipricol = 0.0;
        if ( b < 0.0 )
        {
            recipricol = -1e-8;
        }
        else
        {
            recipricol = 1e-8;
        }
        int times = 63;
        for ( int i = 0; i < times; i++ )
        {
            recipricol = recipricol * ( 2 - ( b * recipricol ) );
        }
        System.out.println( a * recipricol );
    }
 
 
    /**
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * each method.
     * 
     * @param args
     *            command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;
 
        Ch19Ex1to4 exercise = new Ch19Ex1to4();
 
        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Credit Card Bill" );
            System.out.println( "   (2) Drug Potency" );
            System.out.println( "   (3) e^x" );
            System.out.println( "   (4) 1/X by Newton's Method" );
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
                        exercise.creditCardBill();
                        break;
                    case '2':
                        exercise.drugPotency();
                        break;
                    case '3':
                        exercise.eToX();
                        break;
                    case '4':
                        exercise.newtons1overX();
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
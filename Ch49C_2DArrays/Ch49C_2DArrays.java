import java.util.*;
import java.io.*;

/**
   Chapter 49C - Two-Dimensional Arrays Exercises 1-8

   @author TODO Albert Su
   @version TODO 4/25/17

   @author Period - 4
   @author Assignment - Ch49C_2DArrays

   @author Sources - Peck
 */
public class Ch49C_2DArrays
{
    Scanner scan;

    public Ch49C_2DArrays()
    {
        scan = new Scanner( System.in );
    }

    /**
     * finds sum of all numbers
     */
    public int sumOfAllArrayElements( int[][] data )
    {
        // declare the sum
        int sum = 0;
 
        // compute the sum
        for ( int row = 0; row < data.length; row++ )
        {
            for ( int col = 0; col < data[row].length; col++ )
            {
                sum = sum + data[row][col];
 
            }
        }
 
        // write out the sum
        System.out.println( sum );
 
        return sum;
    }
 
 
    /**
     * finds sum of each row
     */
    public int[] sumOfEachRow( int[][] data )
    {
        // declare the row sum array
        int[] rowSums = new int[data.length];
 
        // compute the sums for each row
        for ( int row = 0; row < data.length; row++ )
        {
            // initialize the sum
            int sum = 0;
 
            // compute the sum for this row
            for ( int col = 0; col < data[row].length; col++ )
            {
                sum += data[row][col];
            }
 
            // write the sum for this row
            System.out.println( "row: " + row + "sum: " + sum );
            rowSums[row] = sum;
        }
 
        return rowSums;
    }
 
 
    /**
     * finds sum of each col
     */
    public int[] sumOfEachColumn( int[][] data )
    {
        // find the longest row
        int longestRow = 0;
 
        int[] colSums = { 0, 0, 0, 0, 0, 0 };
        int[] sums = new int[4];
        for ( int row = 0; row < data.length; row++ )
        {
            if ( data[row].length > longestRow )
            {
                longestRow = data[row].length;
 
            }
        }
        System.out.println( "Longest Row : " + longestRow );
 
        int newRow = 0;
        for ( int col = 0; col < longestRow; col++ )
        {
            int sum = 0;
            for ( int row = 0; row < data.length; row++ )
            {
                int number = 0;
                if ( col < data[row].length )
                {
                    System.out.println( data[row][col] );
                    number = data[row][col];
                }
                sum = sum + number;
 
            }
 
            System.out.println( "col: " + col + " sum: " + sum );
            colSums[col] = sum;
        }
        return colSums;
    }
 
 
    /**
     * finds max and min numbers
     */
    public int[] maxAndMinElements( int[][] data )
    {
        // declare the max and the min
        int max = data[0][0];
        int min = data[0][0];
 
        // compute the sum
        for ( int row = 0; row < data.length; row++ )
        {
            for ( int col = 0; col < data[row].length; col++ )
            {
                // System.out.println(data[row][col]);
                if ( data[row][col] > max )
                {
                    max = data[row][col];
                }
                if ( data[row][col] < min )
                {
                    min = data[row][col];
                }
            }
        }
 
        // write out the results
        System.out.println( max );
        System.out.println( min );
        int[] result = { max, min };
        return result;
    }
 
 
    /**
     * finds largest num
     */
    public int[] largestElements( int[][] data )
    {
        // declare the largest in row array
        int[] largestInRow = new int[data.length];
 
        for ( int row = 0; row < data.length; row++ )
        {
            int largestNum = data[0][0];
             
            // compute the sum for this row
            for ( int col = 0; col < data[row].length; col++ )
            {
                if ( data[row][col] > largestNum )
                {
                    largestNum = data[row][col];
                }
            }
            largestInRow[row] = largestNum;
            System.out.println( "row : " + row + "sum: " + largestNum );
 
        }
 
        return largestInRow;
    }
 
 
    /**
     * Reverses each element in row
     */
    public void reversalOfElementsInEachRow( int[][] data )
    {
        for ( int row = 0; row < data.length; row++ )
        {
            int array[] = new int[data[row].length];
            for ( int num = 0; num < data[row].length; num++ )
            {
                array[num] = data[row][num];
            }
            int x = 0;
             
            for ( int copy = array.length; copy > 0; copy = copy - 1 )
            {
                data[row][x] = array[copy - 1];
                x++;
            }
             
            for ( int num = 0; num < data[row].length; num++ )
            {
                System.out.println( "row " + row + ":" + data[row][num] );
            }
        }
 
    }
 
 
    /**
     * TODO Description
     */
    public int[][] imageSmootherEasy( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];
 
        // Compute the smoothed value for
        // non-edge locations in the image.
 
        int sum = 0;
        for ( int row = 1; row < image.length - 1; row++ )
        {
            int col;
            for ( col = 1; col < image[row].length - 1; col++ )
            {
                sum = sum + image[row -1][col -1];
                sum = sum + image[row][col -1];
                sum = sum + image[row + 1][col -1];
                sum = sum + image[row -1][col];
                sum = sum + image[row][col];
                sum = sum + image[row + 1][col];
                sum = sum + image[row  - 1][col  + 1];
                sum = sum + image[row][col + 1];
                sum = sum + image[row + 1][col + 1];
                System.out.println(sum);
                smooth[row][col] = sum / 9;
                sum = 0;
            }
             
             
        }
 
        // write out the input
        for ( int row = 0; row < image.length; row++ )
        {
            for ( int col = 0; col < image[row].length; col++ )
            {
                System.out.print(image[row][col]);
            }
            System.out.println("");
        }
 
        // write out the result
        System.out.println("RESULT");
        for ( int row = 0; row < smooth.length; row++ )
        {
            for ( int col = 0; col < smooth[row].length; col++ )
            {
                System.out.print(smooth[row][col]);
            }
            System.out.println("");
        }
 
        return smooth;
    }
 
 
    /**
     * TODO Description
     */
    public int[][] imageSmootherHard( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];
         
        for ( int row = 0; row < image.length; row++ )
        {
            int sum = 0; 
             
            for ( int col = 0; col < image[row].length; col++ )
            {
                 
                sum = 0;
                if ( check( image, row - 1, col - 1 ) )
                {
                    sum = sum + image[row - 1][col - 1];
                }
                if ( check( image, row - 1, col ) )
                {
                    sum = sum + image[row - 1][col];
                }
                if ( check( image, row - 1, col + 1 ) )
                {
                    sum = sum + image[row - 1][col + 1];
                }
                if ( check( image, row, col - 1 ) )
                {
                    sum = sum + image[row][col - 1];
                }
                if ( check( image, row, col ) )
                {
                    sum = sum + image[row][col];
                }
                if ( check( image, row, col + 1 ) )
                {
                    sum = sum + image[row][col + 1];
                }
                if ( check( image, row + 1, col - 1 ) )
                {
                    sum = sum + image[row + 1][col - 1];
                }
                if ( check( image, row + 1, col ) )
                {
                    sum = sum + image[row + 1][col];
                }
                if ( check( image, row + 1, col + 1 ) )
                {
                    sum = sum + image[row + 1][col + 1];
                }
                smooth[row][col] = sum / 9;
            }
        }
  
        for ( int row = 0; row < image.length; row++ )
        {
            for ( int col = 0; col < image[row].length; col++ )
            {
                System.out.print( image[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        for ( int row = 0; row < smooth.length; row++ )
        {
            for ( int col = 0; col < smooth[row].length; col++ )
            {
                System.out.print( smooth[row][col] + " "  );
            }
            System.out.println();
        }
        return smooth;
    }
     
    public boolean check( int[][] image, int row, int col )
    {
        return row >= 0 && row < image.length && col >= 0
            && col < image[row].length;
    }

    /**
      Testing method: instantiates a Lesson49C Exercises object and
      then invokes each method

      @param args command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch49C_2DArrays exercise = new Ch49C_2DArrays();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Sum of All Array Elements");
            System.out.println( "   (2) Sum of Each Row");
            System.out.println( "   (3) Sum of Each Column");
            System.out.println( "   (4) Maximum and Minimum Elements");
            System.out.println( "   (5) Largest Elements");
            System.out.println( "   (6) Reversal of Elements in Each Row");
            System.out.println( "   (7) Image Smoother (Easy)");
            System.out.println( "   (8) Image Smoother (Hard)");
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
                        int[][] dataEx1 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int sum = exercise.sumOfAllArrayElements(dataEx1);
                        break;
                    case '2':
                        int[][] dataEx2 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] rowSums = exercise.sumOfEachRow(dataEx2);
                        break;
                    case '3':
                        int[][] dataEx3 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] colSums = exercise.sumOfEachColumn( dataEx3 );
                        break;
                    case '4':
                        int[][] dataEx4 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] maxMin = exercise.maxAndMinElements( dataEx4 );
                        break;
                    case '5':
                        int[][] dataEx5 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] largestInRow = exercise.largestElements( dataEx5 );
                        break;
                    case '6':
                        int[][] dataEx6 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        exercise.reversalOfElementsInEachRow( dataEx6 );
                        break;
                    case '7':
                        int[][] imageEx7 = {
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
                        int[][] easySmooth =
                            exercise.imageSmootherEasy( imageEx7 );
                        break;
                    case '8':
                        int[][] imageEx8 = {
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
                        int[][] hardSmooth =
                            exercise.imageSmootherHard( imageEx8 );
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                            done = true;
                        else
                            System.out.print( "Invalid Choice" );
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
/**
 * The ASCIIArt program prints the name "George", the initials GKP and a some
 * fish to standard output using ascii characters to make a picture.
 * 
 * @author TODO enter your name
 * @version TODO enter the date Period:
 * @author TODO enter your period
 * 
 * @author Assignment:  ASCIIArt
 * 
 * @author Sources: TODO: list collaborators
 */
public class ASCIIArt
{
    public ASCIIArt()
    {
        System.out.println( "Albert's Ascii Art" );
        System.out.println();
    }

    public void firstName()
    {
        // print out George using letters
        System.out.println( "       A       l  b " );
        System.out.println( "      A A      l  b " );
        System.out.println( "     A   A     l  b      e e      rrrr     t"   );
        System.out.println( "    AAAAAAA    l  b b  e     e  rr       ttttt" );
        System.out.println( "   A       A   l  b  b eeeeeee  r          t" );
        System.out.println( "  A         A  l  b  b e        r          t" );
        System.out.println( " A           A l  b b   e e e   r          t " );
    }

    public void initials()
    {
        // System.out.print doesn't attach a trailing newline character. We can
        // do this on our own with \n. The \t's are used for inserting tabs
        System.out.print( "\n\t\tor...\n\n" );

        // print out GKP using "tiles"
        System.out.println( "    _/         _/_/_/_/ " );
        System.out.println( "   _/_/       _/       " );
        System.out.println( "  _/  _/     _/_/_/_/  " );
        System.out.println( " _/_/_/_/         _/    " );
        System.out.println( "_/      _/  _/_/_/_/    " );

        System.out.print( "\n\t\tor...\n" );
        // print out GKP using brackets
        System.out.println( "  _______________________" );
        // Java uses a double back slash (\\) to denote an actual backslash
        // character. The reason for this is because \ is an escape sequence for
        // special ascii characters
        System.out.println(" _____________________________"  );
        System.out.println( "|    []         [][][][]     |" );
        System.out.println( "|   [][]       []            |" );
        System.out.println( "|  []  []       []           | " );
        System.out.println( "|[][][][][]       [][][]     | " );
        System.out.println( "|[]      []            []    |" );
        System.out.println( "|[]      []           []     |" );
        System.out.println( "|[]______[]___[][][][]_______|" );
    }

    public void fish()
    {
        System.out.print( "\n\t\tor...\n" );
        // print out some ascii fish...just because
        System.out.println( "                          ,     " );
        System.out.println( "               ()   ()    _/{     " );
        System.out.println( "        ,_    ()     o  .'   './`>" );
        System.out.println( "        _}\\_ O       / a ((  =< " );
        System.out.println( "   <`\\.'    '. o     '.,__,.'\\_>" );
        System.out.println( "    >    )) e \\           \\)    " );
        System.out.println( "   <_/'.,___,.'          cute little fishes....       " );

        System.out.println();
    }

    public static void main( String[] args )
    {
        ASCIIArt asciiArtist = new ASCIIArt();
        asciiArtist.firstName();
        asciiArtist.initials();
        asciiArtist.fish();
    } // main
} // ASCIIArt

import java.util.*;

import javax.swing.*;



/**

   TODO Write a one-sentence summary of your class here.

   TODO Follow it with additional details about its purpose, what abstraction

   it represents, and how to use it.



   @author  TODO Albert Su

   @version TODO 5/2/16



   @author  Period - 4

   @author  Assignment - Ch54 ArrayList Phonebook



   @author  Sources - TODO list collaborators

 */

public class PhoneBook

{ 

    private ArrayList<PhoneEntry> phoneBook;



    /**

      Constructs a PhoneBook with a default set of PhoneEntry objects

      contained in a ArrayList

     */

    public PhoneBook()

    {

        phoneBook = new ArrayList<PhoneEntry>( 25 );



        phoneBook.add( new PhoneEntry( "Jenny", "Java", "(555)555-5555" ) );

        phoneBook.add( new PhoneEntry( "Bob", "Binary", "(101)010-1010" ) );

        phoneBook.add( new PhoneEntry( "Olive", "Oyl", "(555)123-4567" ) );

        phoneBook.add( new PhoneEntry( "Mycroft", "Holmes", "(555)123-4321" ) );

        phoneBook.add( new PhoneEntry( "Lynne", "Brook", "(408)366-7700" ) );

        phoneBook.add( new PhoneEntry( "Monty", "Vista", "(408)366-7600" ) );

        phoneBook.add( new PhoneEntry( "Cooper", "Tino", "(408)366-7300" ) );

        phoneBook.add( new PhoneEntry( "Sara", "Toga", "(408)867-3411 " ) );

        phoneBook.add( new PhoneEntry( "Bertha", "Binary", "(111)111-1111" ) );

        phoneBook.add( new PhoneEntry( "Betty", "Binary", "(011)100-0000" ) );



        Collections.sort( phoneBook );

    }



    /**

        Prints the contents of the PhoneBook. Uses an iterator to

        traverse the ArrayList

     */

    public void print()

    {

        Iterator<PhoneEntry> iter = phoneBook.iterator();

        while ( iter.hasNext() )

        {

            PhoneEntry pe = iter.next();

            System.out.println( pe );

        }

    }



    /** 

        Returns a copy of this phonebook

        @return a copy of this phonebook

     */

    public ArrayList<PhoneEntry> getPhoneBook()

    {

        return new ArrayList<PhoneEntry>( phoneBook );

    }



    /**

        Appends the specified element to the end of the phonebook.



        @param  pEntry  a PhoneEntry

     */

    public void add( PhoneEntry pEntry )

    {

        phoneBook.add(pEntry);



        Collections.sort( phoneBook );

    }



    /**

        Removes a single instance of the specified element from this list,

        if it is present 



        @param  pEntry  PhoneEntry to remove

        @return         the element that was removed from the list,

                        null otherwise

     */

    public PhoneEntry delete( PhoneEntry pEntry )

    {

        PhoneEntry delEntry = null;

        // phoneBook.remove( delEntry );

        if ( !phoneBook.isEmpty() )

        {

            Iterator<PhoneEntry> iter = phoneBook.iterator();

            while ( iter.hasNext() )

            {

                PhoneEntry pe = iter.next();

                String peFname = pe.getFirstName();

                String peLname = pe.getLastName();

 

                if ( peFname.toUpperCase().equals( pEntry.getFirstName()

                    .toUpperCase() )

                    && peLname.toUpperCase().equals( pEntry.getLastName()

                        .toUpperCase() ) )

                {

                    phoneBook.remove( pEntry );

                    delEntry = pEntry;

                    break;

                }

            }

        } 



    Collections.sort( phoneBook );



    return delEntry;

    }









    /**

        Searches for entries in the PhoneBook that match the given PhoneEnty.

        If the PhoneEntry contains just the last name, the method goes through

        the entire list, and adds every match to the list. If the PhoneEntry

        contains both first and last names, the method will add the first match

        to the list then stop.



        @param  pEntry  PhoneEntry to find

        @return         an ArrayList of elements found

     */

    public ArrayList<PhoneEntry> search( PhoneEntry pEntry )

    {

        System.out.println( "here" );

        ArrayList<PhoneEntry> result = new ArrayList<PhoneEntry>();

 

        if ( !phoneBook.isEmpty() )

        {

            Iterator<PhoneEntry> iter = phoneBook.iterator();

            while ( iter.hasNext() )

            {

                PhoneEntry pe = iter.next();

                String peFname = pe.getFirstName();

                String peLname = pe.getLastName();

                System.out.println( "peFname: " + peFname );

                System.out.println( "pEntry.getFirstName() : "

                    + pEntry.getFirstName() );

                if ( peFname.toUpperCase().equals( pEntry.getFirstName()

                    .toUpperCase() )

                    && peLname.toUpperCase().equals( pEntry.getLastName()

                        .toUpperCase() ) )

                {

                    result.clear();

                    ;

                    result.add( pe );

                    return result;

                }

                else

                {

                    if ( peFname.toUpperCase().equals( pEntry.getFirstName()

                        .toUpperCase() ) )

                    {

                        result.add( pe );

                        System.out.println( "Ffound match!" );

                    }

                    else if ( peLname.toUpperCase()

                        .equals( pEntry.getLastName().toUpperCase() )

                        && !( peFname.toUpperCase().equals( pEntry.getFirstName()

                            .toUpperCase() ) ) )

                    {

                        result.add( pe );

                        System.out.println( "Lfound match!" );

                    }

                }

            }

        }

        else

        {

            System.out.println( "Name not found" );

        }

        // result.add( pEntry );

        // TODO your code here

 

        return result;

    }

}
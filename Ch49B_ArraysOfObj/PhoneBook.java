/**

   TODO Write a one-sentence summary of your class here.

   TODO Follow it with additional details about its purpose, what abstraction

   it represents, and how to use it.



   @author  Albert Su

   @version 4/19/17



   @author  Period - 4
   @author  Assignment - Ch49B_PhoneBook



   @author  Sources - None

 */

public class PhoneBook

{ 

    private PhoneEntry[] phoneBook;

    private int nextEntry;



    /**

     * Constructs a phonebook with a capacity of 25 entries and initializes

     * the first 10 entries.

     */

    public PhoneBook() // constructor

    {

        phoneBook = new PhoneEntry[25];



        phoneBook[0] = new PhoneEntry( "Jenny", "Java", "(555)555-5555" );

        phoneBook[1] = new PhoneEntry( "Bob", "Binary", "(101)010-1010" );

        phoneBook[2] = new PhoneEntry( "Olive", "Oyl", "(555)123-4567" );

        phoneBook[3] = new PhoneEntry( "Mycroft", "Holmes", "(555)123-4321" );

        phoneBook[4] = new PhoneEntry( "Lynne", "Brook", "(408)366-7700" );

        phoneBook[5] = new PhoneEntry( "Monty", "Vista", "(408)366-7600" );

        phoneBook[6] = new PhoneEntry( "Cooper", "Tino", "(408)366-7300" );

        phoneBook[7] = new PhoneEntry( "Bertha", "Binary", "(111)111-1111" );

        phoneBook[8] = new PhoneEntry( "Betty", "Binary", "(011)100-0000" );

        phoneBook[9] = new PhoneEntry( "Sara", "Toga", "(408)867-3411 " );



        nextEntry = 10;

    }



    /**

     * TODO Write your method description here.

     */

    public void print()

    {

        if ( nextEntry <= 0 )

        {

            System.out.println( "Phonebook empty!!" );

        }

        else

        {

            for ( int i = 0; i < nextEntry; i++ )

            {

                System.out.println(phoneBook[i].firstName + " " +

                    phoneBook[i].lastName + " " +

                    phoneBook[i].phoneNum);

            }

        }

    }



    /**

     * Adds any name you would like with your phone number.

     * 

     * @param pEntry

     * @return give pEntry

     */

    public PhoneEntry add( PhoneEntry pEntry )

    {

    String fname = pEntry.firstName;

    String lname = pEntry.lastName;

    String num = pEntry.phoneNum;

     

     

    PhoneEntry nEntry = null;

    nEntry = new PhoneEntry( fname, lname, num );

    if(nextEntry < phoneBook.length)

    {     

        phoneBook[nextEntry] = nEntry;

        nextEntry++;

    }

    return nEntry;

    }

     

     



    /**

     * TODO Deletes any contact in phone book you like

     * 

     * @param pEntry

     * @return deleted item

     */

    public PhoneEntry delete( PhoneEntry pEntry )

    {

        PhoneEntry returnEntry = null;

        String fname = pEntry.firstName;

        String lname = pEntry.lastName;

        String num = pEntry.phoneNum;

         

         

        for ( int x = 0; x < nextEntry; x++ )

        {

            if ( lname.toUpperCase().equals( phoneBook[x].lastName.toUpperCase() )

                && fname.toUpperCase()

                    .equals( phoneBook[x].firstName.toUpperCase() ) )

            {

                returnEntry = new PhoneEntry( phoneBook[x].firstName,

                    phoneBook[x].lastName,

                    phoneBook[x].phoneNum );

                 

                phoneBook[x] = phoneBook[nextEntry - 1];

                 

                phoneBook[nextEntry - 1] = null;

                nextEntry--;

                 

                x = nextEntry;

            }

        }

  

        return returnEntry;

           }



    /**

     * TODO Searches the phone book for a person

     * 

     * @param pEntry

     * @return pEntry

     */

    public PhoneEntry[] search( PhoneEntry pEntry )

    {

        

        String fname = pEntry.firstName;

        String lname = pEntry.lastName;

         

        int y = 0;

        PhoneEntry[] result = new PhoneEntry[nextEntry];

         

        for(int x = 0; x < nextEntry; x++)

        {

            String fsname = phoneBook[x].firstName;       

            String lsname = phoneBook[x].lastName;  

             

            if(fname.toUpperCase().equals(fsname.toUpperCase()))

            {           

                result[y] = new PhoneEntry(phoneBook[x].firstName, phoneBook[x].lastName, phoneBook[x].phoneNum);

                y++;

            }

            else 

            

            {

                if(lname.toUpperCase().equals(lsname.toUpperCase())){

             

                result[y] = new PhoneEntry(phoneBook[x].firstName, phoneBook[x].lastName, phoneBook[x].phoneNum);

                y++;

             

                }       

        }

        }

        return result;

    }

    

    //////////////////////////////////////////

    // Methods used for testing purposes only

    

    /**

     * For testing only

     * 

     * @return the PhoneEntry[] that represents this phoneBook

     */

    public PhoneEntry[] getPhoneBook()

    {

        return phoneBook;

    }

    

    /**

     * For testing only

     * @return the next entry field

     */

    public int getNextEntry()

    {

        return nextEntry;

    }

}
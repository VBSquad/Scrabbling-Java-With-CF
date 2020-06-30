/* 
hashCode() method in List Interface is used to generate hashCode for a given list.
This method has no parameter.
It returns an integer value i.e the hashCode of a list
*/

import java.util.*;

public class hashCodefunc {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //n is the number of elements in the list
        int n = sc.nextInt ();

        //creating an empty arraylist
        ArrayList < Integer > list = new ArrayList < Integer > ();

        //adding elements to the list entered by user
        for ( int i = 0; i<n ; i++ ) {
            list.add( sc.nextInt() );
        }

        //printing the list after adding elements
        System.out.println ( " The list is " + list );

        //printing the hashCode of giving list using hashCode() method
        System.out.println ( "HashCode of list: " + list.hashCode() );

        sc.close();
    }
}

/*
Sample Test Case

Input:
3
1 2 3
Output:
The list is [1, 2, 3]
HashCode of list: 30817

*/


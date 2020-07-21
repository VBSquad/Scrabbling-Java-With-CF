/*
isEmpty() method checks whether the arraylist is empty or not.
It returns true if ArrayList is empty otherwise false.
*/

import java.util.*;

public class isEmpty {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating an empty arraylist
        ArrayList < Integer > a = new ArrayList <> ();

        System.out.println ("Is ArrayList empty? " + a.isEmpty () );

        //e is the element to be added in the list
        int e = sc.nextInt ();
         
        //adding e to the list
        a.add ( e );

        System.out.println ("ArrayList after adding an element ? " + a.isEmpty () );

        sc.close();
    }
}

/*
Sample Test Case

Input:
5

Output:
Is ArrayList empty? true
ArrayList after adding an element ? false

*/



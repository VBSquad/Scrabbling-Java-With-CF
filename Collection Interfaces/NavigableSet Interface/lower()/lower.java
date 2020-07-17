/*
lower(e) method of NavigableSet Interface returns the greatest element in the set 
which is less than the passed parameter e or NULL if there is no such element.
*/

import java.util.*;
public class lower {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //n is the size of set
        int n = sc.nextInt ();

        //Creating an empty NavigableSet
        NavigableSet < Integer > ns = new TreeSet <> (); 

        //adding elements to the set
        for ( int i = 0 ; i < n ; i++ ) {
            ns.add( sc.nextInt() );

        }

        //printing the set
        System.out.println ( "NavigableSet: " + ns );

        //e is the parameter passed to lower() method
        int e = sc.nextInt ();

        //performing lower() operation
        System.out.println ( "lower of " + e + " = "+ ns.lower( e ) );

        sc.close ();

    
    }
}

/*
Sample Test Case

Input:
5
3 9 1 4 7
3

Output:
NavigableSet: [1, 3, 4, 7, 9]
lower of 3 = 1

*/


/*
floor(e) method of NavigableSet Interface returns the greatest element in this set which is less than or equal to given element e .
Otherwise it returns NULL if there is no such element.
*/

import java.util.*;
public class floor {
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

        //e is the parameter passed
        int e = sc.nextInt ();

        //prinitng the floor value with respect to element e
        System.out.println ( "floor() value of element " + e + ": "+ ns.floor( e ) );

        sc.close ();
    }
}

/*
Sample Test Case

Input:
4
2 8 6 9
1

Output:
NavigableSet: [2, 6, 8, 9]
floor() value of element 1: null

*/


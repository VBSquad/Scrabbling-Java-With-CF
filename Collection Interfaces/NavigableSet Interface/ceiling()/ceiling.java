/*
ceiling(e) method of NavigableSet Interface returns the least element in this set which is greater than or equal to given element e.
It returns NULL if there is no such element.
*/

import java.util.*;
public class ceiling {
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

        //displaying the set
        System.out.println ( "NavigableSet: " + ns );

        int e = sc.nextInt ();

        //printing the ceiling value of e
        System.out.println ( "ceiling() of " + e + ": " + ns.ceiling ( e ) );

        sc.close ();
    }
}

/*
Sample Test Case

Input:
5
2 9 4 8 7
5

Output:
NavigableSet: [2, 4, 7, 8, 9]
ceiling() of 5: 7

*/


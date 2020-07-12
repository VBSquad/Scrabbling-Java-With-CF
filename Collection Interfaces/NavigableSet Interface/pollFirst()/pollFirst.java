/*
pollFirst() method of NavigableSet Interface retrieve and remove the first least element. 
It returns null if there is no such element.
*/

import java.util.*;
public class pollFirst {
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

        //performing pollFirst() operation
        System.out.println ( "pollFirst() of NavigableSet: " + ns.pollFirst() );

        //prinitng set after removal of first least element
        System.out.println ( "NavigableSet after pollFirst(): " + ns );
    }
}

/*
Sample Test Case

Input:
5
3 8 4 1 5

Output:
NavigableSet: [1, 3, 4, 5, 8]
pollFirst() of NavigableSet: 1
NavigableSet after pollFirst(): [3, 4, 5, 8]

*/


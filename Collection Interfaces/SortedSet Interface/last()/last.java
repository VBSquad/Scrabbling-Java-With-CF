/*
last() method in SortedSet Interface in Java returns the last element of the Set. 
*/

import java.util.*;
public class last {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System .in );

        //creating an empty SortedSet
        SortedSet set = new TreeSet ();

        //n is number of elements in the set
        int n = sc.nextInt ();

        //adding elements to the set
        for ( int i = 0 ; i < n ; i++ ) {
            set.add( sc.next() );
        }

        //displaying the set
        System.out.println ( "SortedSet: " + set );

        //printing the last element of the set using last() method
        System.out.println ( "The last element of SortedSet is: " + set.last () );

        sc.close();
    }
}

/*
Sample Test Case

Input:
6
a e g h p v

Output:
SortedSet: [a, e, g, h, p, v]
The last element of SortedSet is: v

*/


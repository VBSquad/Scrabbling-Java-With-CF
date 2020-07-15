/*
The headSet(element) method of SortedSet interface in Java is used to return a view of the portion of the set
whose elements are strictly less than the parameter element.
*/

import java.util.*;
public class headSet {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating an empty sortedset
        SortedSet < Integer > sortedSet = new TreeSet < Integer > ();

        //n is the size of sortedset
        int n = sc.nextInt ();

        //adding elements to the sortedset
        for ( int i = 0 ; i < n ; i++ ) {
            sortedSet.add ( sc.nextInt() ) ;
        }
        //printing the sortedset
        System.out.println ( "SortedSet: " + sortedSet );

        //a is the parameter element
        int a = sc.nextInt ();

        //printing the portion of sortedset in which elements are strictly less than the passed parameter
        System.out.println ( "Elements strictly less than " + a +": " + sortedSet.headSet( a ) );

        sc.close ();
    }
}

/*
Sample Test Case:

Input
5
1 4 9 11 16
10

Output
SortedSet: [1, 4, 9, 11, 16]
Elements strictly less than 10: [1, 4, 9]

*/


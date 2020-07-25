/*
The set(int index,E element) method is used to replace the element at the specified position in the Vector with the specified element.
*/

import java.util.*;

public class set {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating default vector
        Vector v = new Vector <> ();

        //n is number of elements in the vector
        int n = sc.nextInt ();

        //adding elements to the vector
        for ( int i = 0 ; i < n ; i++ ) {
            v.add ( sc.nextInt() );
        }

        //printing the vector
        System.out.println ( "Initial Vector : " + v );

        //index is the position at which the element present is to be replaced
        int index = sc.nextInt ();

        //element is the new value
        int element = sc.nextInt ();

        //replacing element at specified index
        v.set ( index, element );

        //printing final vector
        System.out.println ( "Final Vector: " + v );

        sc.close ();

    }
}

/*

Sample Test Case

Input:
5
1 2 3 4 5
1 10

Output:
Initial Vector : [1, 2, 3, 4, 5]
Final Vector: [1, 10, 3, 4, 5]

*/


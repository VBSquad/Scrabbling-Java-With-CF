/*
void removeAllElements() method in Vector Class removes all the elements from the given vector.
It does not delete the vector but makes the vector empty.
*/

import java.util.*;

public class removeAllElements {
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

        //performing removeAllElements operation
        v.removeAllElements();

        //printing the final vector
        System.out.println( "Final Vector: " + v );

        sc.close ();

    }
}

/*

Sample Test Case

Input:
5
1 2 3 4 5

Output:
Initial Vector : [1, 2, 3, 4, 5]
Final Vector: []

*/


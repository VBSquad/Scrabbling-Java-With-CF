/*
boolean removeElement(Object obj) method in Vector class removes the particular element from the given Vector.
It returns true when a particular element is removed successfully, otherwise it returns false.
*/

import java.util.*;

public class removeElement {
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

        int e = sc.nextInt ();

        System.out.println ( "Is " + e + " removed from the given vector? " + v.removeElement ( e ) );

        //printing element at position index
        System.out.println ( "Final Vector : " + v );

        sc.close ();

    }
}

/*

Sample Test Case

Input:
5
1 2 3 4 5
4

Output:
Initial Vector : [1, 2, 3, 4, 5]
Is 4 removed from the given vector? true
Final Vector : [1, 2, 3, 5]

*/


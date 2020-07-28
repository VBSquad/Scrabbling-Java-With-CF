/*
toString() method in Vector Class is used to convert all the elements of Vector into String.
*/

import java.util.*;

public class toString {
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
        System.out.println ( "Vector : " + v );

        //displaying the string representation of vector
        System.out.println ( "String representation of Vector : " + v.toString () );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5

Output:
Vector : [1, 2, 3, 4, 5]
String representation of Vector : [1, 2, 3, 4, 5]

*/


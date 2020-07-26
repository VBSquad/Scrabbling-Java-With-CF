/*
The setElementAt() method of Java Vector is used to set the specified object at the specified index of the vector,discarding the previous object.
The index must be a value greater than or equal to 0 and less than the current size of the vector.
*/

import java.util.*;

public class setElementAt {
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

        //printing the initial vector
        System.out.println ( "Initial Vector : " + v );

        int index = sc.nextInt ();

        int obj = sc.nextInt ();

        //setting object obj at specified index
        v.setElementAt ( obj, index );

        //printing the final vector
        System.out.println( "Final Vector : " + v );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
4 6

Output:
Initial Vector : [1, 2, 3, 4, 5]
Final Vector : [1, 2, 3, 4, 6]

*/


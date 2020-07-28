/*
The trimToSize() method of Vector in Java trims the capacity of an Vector instance to the number of elements it contains.
*/

import java.util.*;

public class trimToSize {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating default vector
        Vector v = new Vector <> ( 10 );

        //n is number of elements in the vector
        int n = sc.nextInt ();

        //adding elements to the vector
        for ( int i = 0 ; i < n ; i++ ) {
            v.add ( sc.nextInt() );
        }

        //printing the vector
        System.out.println ( "Vector : " + v );

        //displaying the number of elements present in the vector
        System.out.println ( "Number of elements present in the vector : " + v.size() );

        v.trimToSize ();

        //printing the size of vector after trimToSize operation
        System.out.println ( "Size after trimToSize operation : " + v.size() );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
4
3 2 1 0

Output:
Vector : [3, 2, 1, 0]
Number of elements present in the vector : 4
Size after trimToSize operation : 4

*/


/*
setSize() is a method of Vector class which is used to set the new size of vector.
If new size of vector is greater than the current size then null elements are added to the vector 
and if new size is less than current size then all higher order elements are deleted.
*/

import java.util.*;

public class setSize {
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

        //printing the Initial vector
        System.out.println ( "Initial Vector of size " + n + " : " + v );

        int size = sc.nextInt ();

        //changing the size of vector
        v.setSize ( size );

        //printing element at final vector
        System.out.println( "Final Vector of size " + size + " : " + v );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
7

Output:
Initial Vector of size 5 : [1, 2, 3, 4, 5]
Final Vector of size 7 : [1, 2, 3, 4, 5, null, null]

Input:
5
1 2 3 4 5
3

Output:
Initial Vector of size 5 : [1, 2, 3, 4, 5]
Final Vector of size 3 : [1, 2, 3]

*/


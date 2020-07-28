/*
int indexOf(Object elem) method returns the index of the first occurrence of the specified element in the vector,
or -1 if the element is not present in the vector.
*/

import java.util.*;

public class indexOf {
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
        
        //e is the element whose index is to be found
        int e = sc.nextInt ();

        //printing the index of element e
        System.out.println( "Index of element " + e + " in the vector is : " + v.indexOf( e ) );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
3

Output:
Vector : [1, 2, 3, 4, 5]
Index of element 3 in the vector is : 2

*/


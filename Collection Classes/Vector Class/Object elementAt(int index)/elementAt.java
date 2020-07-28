/*
Object elementAt(int index) method returns the element from the vector at specified index.
*/

import java.util.*;

public class elementAt {
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

        int index = sc.nextInt ();

        //printing element at position index
        System.out.println( "Element at index " + index + " in the vector : " + v.elementAt ( index ) );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
3
1 2 3
1

Output:
Vector : [1, 2, 3]
Element at index 1 in the vector : 2

*/


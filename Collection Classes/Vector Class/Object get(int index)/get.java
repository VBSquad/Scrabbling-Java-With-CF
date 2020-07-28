/*
Object get(int index) method returns the element at the specified position in the Vector.
It returns IndexOutOfBoundsException if the index is out of range.
*/

import java.util.*;

public class get {
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
        System.out.println( "Element at index " + index + " in the vector : " + v.get ( index ) );

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


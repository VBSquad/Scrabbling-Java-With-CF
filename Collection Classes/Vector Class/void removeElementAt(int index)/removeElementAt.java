/*
removeElementAt(int index) method in Vector Class removes the element at specified index.
All the elements at index greater than the specified index are shifted to have index one smaller than they had before.
*/

import java.util.*;

public class removeElementAt {
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

        //index is the position from where the element is to be removed
        int index = sc.nextInt ();

        //removing element at position index
        v.removeElementAt( index );

        //printing the final vector
        System.out.println( "Final Vector after removing element at index " + index + " : " + v );

        sc.close ();

    }
}

/*

Sample Test Case

Input:
5
1 2 3 4 5
0

Output:
Initial Vector : [1, 2, 3, 4, 5]
Final Vector after removing element at index 0 : [2, 3, 4, 5]

*/


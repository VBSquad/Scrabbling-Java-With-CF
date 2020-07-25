/*
retainAll(Collection c) method is used to retain only the elements in the Vector that are contained in the specified Collection c. 
In other words, this method removes all the elements from the vector that are not contained in the specified Collection.
*/

import java.util.*;

public class retainAll {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating default vector
        Vector v1 = new Vector <> ();

        //n is number of elements in the vector
        int n = sc.nextInt ();

        //adding elements to the vector
        for ( int i = 0 ; i < n ; i++ ) {
            v1.add ( sc.nextInt() );
        }

        //printing the vector
        System.out.println ( "First Vector : " + v1 );

        //creating default vector
        Vector v2 = new Vector <> ();

        //n is number of elements in the vector
        int m = sc.nextInt ();

        //adding elements to the vector
        for ( int i = 0 ; i < m ; i++ ) {
            v2.add ( sc.nextInt() );
        }


        //printing the vector
        System.out.println ( "Second Vector : " + v2 );

        v1.retainAll ( v2 );

        //printing element at position index
        System.out.println ( "Vector 1 after retainAll operation : " + v1 );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
2
2 5

Output:
First Vector : [1, 2, 3, 4, 5]
Second Vector : [2, 5]
Vector 1 after retainAll operation : [2, 5]

*/


/*
The iterator() method is used to return an iterator of the elements of the ArrayDeque.
*/

import java.util.*;
public class iterator {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating an empty deque
        Deque < Integer > d = new ArrayDeque < Integer > ();

        //n is the number of elements in deque
        int n = sc.nextInt ();

        //adding elements in deque
        for ( int i = 0 ; i < n ; i++) {

            d.add ( sc.nextInt() );

        }

        //displaying deque
        System.out.println ( "Deque : " + d );

        // Creating an iterator 
        Iterator values = d.iterator();

        // Displaying the values after iterating through the Deque
        System.out.println ( "The iterator values are: " ); 
        while ( values.hasNext () ) {
            System.out.println ( values.next() );
        }

        sc.close ();
    }
}

/*
Sample TestCase

Input:
5
1 2 3 4 5

Output:
Deque : [1, 2, 3, 4, 5]
The iterator values are: 
1
2
3
4
5

*/



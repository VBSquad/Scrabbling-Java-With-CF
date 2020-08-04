/*
The offerLast(E element) method in Java is used to add a specific element at the end of the Deque.
*/

import java.util.*;
public class offerLast {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating an empty deque
        Deque < Integer > d = new ArrayDeque < Integer > ();

        //n is the number of elements in deque initially
        int n = sc.nextInt ();

        //adding elements in deque
        for ( int i = 0 ; i < n ; i++) {

            d.add ( sc.nextInt() );

        }

        //printing the initial deque
        System.out.println ( "Initial Deque: " + d );

        int e = sc.nextInt ();

        // Using offerLast() to add element e
        d.offerLast ( e );

        //printing the final deque
        System.out.println ( "Final Deque : " + d );

        sc.close ();
    }
}

/*
Sample TestCase

Input:
4
1 2 3 4
5

Output:
Initial Deque: [1, 2, 3, 4]
Final Deque : [1, 2, 3, 4, 5]

*/



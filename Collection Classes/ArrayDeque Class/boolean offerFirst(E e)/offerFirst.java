/*
The offerFirst(E element) method in Java is used to add a specific element at the front of the Deque.
*/

import java.util.*;
public class offerFirst {
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

        //Using offerFirst() to add element
        int e = sc.nextInt ();
        d.offerFirst ( e );

        //printing the final deque
        System.out.println ( "Final deque : " + d );

        sc.close ();
    }
}

/*
Sample TestCase

Input:
4
2 3 4 5
1

Output:
Initial Deque: [2, 3, 4, 5]
Final deque : [1, 2, 3, 4, 5]

*/


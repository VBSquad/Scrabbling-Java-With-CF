/*
The offer(E e) method in Java is used to add a specific element e at the end of the Deque.
*/

import java.util.*;
public class offer {
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
        //displaying the initial deque
        System.out.println ( "Initial Deque: " + d );

        //e is the element to be added at the end of deque
        int e = sc.nextInt ();

        d.offer ( e );


        //displaying the final deque
        System.out.println( "Final Deque : " + d );

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



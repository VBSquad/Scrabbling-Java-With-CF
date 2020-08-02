/*
The addLast(element e) method in Java is used to insert a specific element e at the end of the deque.
This method is similar to the add() method in Java. 
*/

import java.util.*;
public class addLast {
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
        System.out.println( "Initial Deque: " + d );

        //e is the element to be added in the end of deque
        int e = sc.nextInt ();
        d.addLast( e );

        //printing the final deque
        System.out.println( "Deque after adding " + e + " at last : " + d );

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
Deque after adding 5 at last : [1, 2, 3, 4, 5]

*/



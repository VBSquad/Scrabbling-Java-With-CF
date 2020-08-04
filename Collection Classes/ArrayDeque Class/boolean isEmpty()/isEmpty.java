/*
The isEmpty() method in Java is used to check if an ArrayDeque is empty or not. 
It returns True if the Deque is empty else it returns False.
*/

import java.util.*;
public class isEmpty {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating an empty deque
        Deque < Integer > d = new ArrayDeque < Integer > ();

        //printing the initial deque
        System.out.println ( "Initial Deque: " + d );

        //displaying if deque is empty or not
        System.out.println ( "Is Deque empty ? " + d.isEmpty() );

        //n is the number of elements user wants to enter in deque
        int n = sc.nextInt ();

        //adding elements in deque
        for ( int i = 0 ; i < n ; i++) {

            d.add ( sc.nextInt() );

        }

         //printing the final deque after adding elements in it
         System.out.println ( "Final Deque: " + d );

         //displaying if deque is empty or not
         System.out.println( "Is Deque empty now ? " + d.isEmpty() );

        sc.close ();
    }
}

/*
Sample TestCase

Input:
5
1 2 3 4 5

Output:
Initial Deque: []
Is Deque empty ? true
Final Deque: [1, 2, 3, 4, 5]
Is Deque empty now ? false

*/



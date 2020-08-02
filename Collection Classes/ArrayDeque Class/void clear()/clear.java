/*
The clear() method in Java is used to remove all of the elements from the Deque. 
Using the clear() method only clears all the element from the deque and does not delete the deque. 
*/

import java.util.*;
public class clear {
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

        //printing the initial deque
        System.out.println( "Initial Deque: " + d );

        //clearing elements from deque
        d.clear ();

        //printing the final deque
        System.out.println( "Final Deque after clear() operation : " + d );

        sc.close ();
    }
}

/*
Sample TestCase

Input:
5
1 2 3 4 5

Output:
Initial Deque: [1, 2, 3, 4, 5]
Final Deque after clear() operation : []

*/



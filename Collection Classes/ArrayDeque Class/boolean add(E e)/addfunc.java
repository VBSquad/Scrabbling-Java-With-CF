/*
The add(element e) method in Java is used to add a specific element  e at the end of the Deque. 
*/

import java.util.*;
public class addfunc {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating an empty deque
        Deque < Integer > d = new ArrayDeque < Integer > ();

        //printing the initial deque
        System.out.println( "Initial Deque: " + d );

        //n is the number of elements user wants to enter in deque
        int n = sc.nextInt ();

        //adding elements in deque
        for ( int i = 0 ; i < n ; i++) {

            d.add ( sc.nextInt() );

        }

        //printing the final deque
        System.out.println( "Deque after adding elements : " + d );

        sc.close ();
    }
}

/*
Sample TestCase

Input:
4
1 2 3 4

Output:
Initial Deque: []
Deque after adding elements : [1, 2, 3, 4]

*/



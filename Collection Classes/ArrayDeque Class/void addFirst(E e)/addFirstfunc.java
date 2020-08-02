/*
The addFirst(element e) method in Java is used to insert a specific element e at the front of the deque. 
*/

import java.util.*;
public class addFirstfunc {
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

        //e is the element to be added in front of deque
        int e = sc.nextInt ();
        d.addFirst ( e );

        //printing the final deque
        System.out.println ( "Deque after adding "+ e + " in front of deque : " + d );

        sc.close ();
    }
}

/*
Sample TestCase

Input:
3
2 3 4
1

Output:
Initial Deque: [2, 3, 4]
Deque after adding 1 in front of deque : [1, 2, 3, 4]

*/



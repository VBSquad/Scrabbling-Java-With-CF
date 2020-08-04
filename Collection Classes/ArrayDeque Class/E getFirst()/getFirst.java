/*
The getFirst() method in Java is used to retrieve or fetch the first element of the ArrayDeque. 
The method does not delete the element from the deque instead it just returns the first element of the deque.
*/

import java.util.*;
public class getFirst {
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
        //printing the deque
        System.out.println ( "Deque: " + d );

        //printing the first element of deque
        System.out.println ( "The first element of deque is : " + d.getFirst() );

        sc.close ();
    }
}

/*
Sample TestCase

Input:
5
1 2 3 4 5

Output:
Deque: [1, 2, 3, 4, 5]
The first element of deque is : 1

*/



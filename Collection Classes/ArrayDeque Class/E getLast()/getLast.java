/*
The getLast() method in Java is used to retrieve or fetch the last element of the ArrayDeque. 
This method does not delete the element from the deque instead it just returns the last element of the deque.
*/

import java.util.*;
public class getLast {
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
         System.out.println ( "Deque: " + d );


        //displaying the last element of deque
        System.out.println( "Last element of deque : " + d.getLast() );

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
Last element of deque : 5

*/



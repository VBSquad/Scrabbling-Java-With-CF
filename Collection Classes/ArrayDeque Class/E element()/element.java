/*
The element() method in Java is used to retrieve or fetch the head of the ArrayDeque. 
This method does not delete the element from the deque instead it just returns the element.
*/

import java.util.*;
public class element {
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
        System.out.println( "Deque: " + d );

        //printing the head element
        System.out.println( "The head element of deque is : " + d.element() );

        sc.close ();
    }
}

/*
Sample TestCase

Input:
5
2 4 6 8 10

Output:
Deque: [2, 4, 6, 8, 10]
The head element of deque is : 2

*/



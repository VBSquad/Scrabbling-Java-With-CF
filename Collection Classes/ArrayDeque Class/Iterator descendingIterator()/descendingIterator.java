/*
The descendingIterator() method is used to return an iterator of the same elements as the ArrayDeque but in the reverse order. 
*/

import java.util.*;
public class descendingIterator {
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

        System.out.println ( "The iterator values are :" );

        //creating a descending iterator
        Iterator values = d.descendingIterator ();

        //Displaying the values after iterating through the Deque in reverse order 
        while ( values.hasNext() ) {
            System.out.println ( values.next() );
        }

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
The iterator values are :
5
4
3
2
1

*/



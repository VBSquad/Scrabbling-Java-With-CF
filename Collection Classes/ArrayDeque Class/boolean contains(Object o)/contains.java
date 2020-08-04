/*
The contains(Object o) method in Java is used to check whether a specific element is present in the Deque or not.
*/

import java.util.*;
public class contains {
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

        //o is the element to be checked in deque
        int o = sc.nextInt ();
        
        //diplaying if deque contains o or not
        System.out.println ( "Is " + o + " present in deque ? " + d.contains ( o ));

        sc.close ();
    }
}

/*
Sample TestCase

Input:
5
1 2 3 4 5
6

Output:
Deque: [1, 2, 3, 4, 5]
Is 6 present in deque ? false

*/



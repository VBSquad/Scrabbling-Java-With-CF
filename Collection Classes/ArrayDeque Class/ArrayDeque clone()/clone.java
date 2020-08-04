/*
The clone() method in java is used to return a shallow copy of this deque. 
It just creates a copy of the deque. 
*/

import java.util.*;

public class clone {
   public static void main(String[] args) {

    Scanner sc = new Scanner ( System.in );
      
    // creating an empty deque
    ArrayDeque < Integer > deque1 = new ArrayDeque < Integer > ( 8 );

    //n is number of elements in deque
    int n = sc.nextInt ();

    //adding elements in deque
    for ( int i =0 ; i < n ; i++ ) {
        deque1.add( sc.nextInt () );
    }

    System.out.println ( "Deque : " + deque1 );
         
    // clone the first deque
    Deque < Integer > deque2 = deque1.clone();

    //printing the cloned deque
    System.out.println ( "Cloned Deque : " + deque2 );

    sc.close ();

      
   }
}

/*
Sample TestCase

Input:
3
6 7 8

Output:
Deque : [6, 7, 8]
Cloned Deque : [6, 7, 8]

*/



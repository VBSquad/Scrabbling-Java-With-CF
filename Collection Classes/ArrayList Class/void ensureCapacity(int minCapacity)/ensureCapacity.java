/*
The ensureCapacity() method is used to increase the capacity of the ArrayList instance, if necessary, 
to ensure that it can hold at least the number of elements which is not smaller than the specified size. 
*/

import java.util.*;
public class ensureCapacity {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating arraylist of size 3
        ArrayList < Integer > a = new ArrayList <> (3);

        //adding elements to Arraylist
        for( int i = 0 ; i < 3 ; i++ ) {
            a.add ( sc.nextInt() );
        }

        //displaying the Arraylist
        System.out.println ( "Initial ArrayList: " + a );

        a.ensureCapacity( 5 );

        //e is the element to be added
        int e = sc.nextInt ();

        a.add( e );

        //displaying the final list
        System.out.println ( "Final list after adding new element: " + a );

        sc.close();
    }
}

/*
Sample Test Case

Input:
1 2 3
4

Output:
Initial ArrayList: [1, 2, 3]
Final list after adding new element: [1, 2, 3, 4]

*/


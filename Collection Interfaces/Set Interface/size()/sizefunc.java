/*
size() method of Set Interface returns the number of elements in the set.
This method does not take any parameter.
*/

import java.util.*;
public class sizefunc {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //Creating an empty set
        Set < Integer > set = new HashSet < Integer > ();

        //Adding elements to the set
        set.add( 1 );
        set.add( 2 );
        set.add( 3 );
        set.add( 4 );
     
        //displaying the set
        System.out.println ( "Set: " + set );

        //displaying the size of the set
        System.out.println ( "size of Set: " + set.size() );

        sc.close();


    }
}

/*

Output:
Set: [1, 2, 3, 4]
size of Set: 4

*/


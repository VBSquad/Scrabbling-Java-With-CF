/*
clear() method in Set Interface is used to remove all the elements from a Set.
It clears all the elements of the Set and not deletes the set.
*/

import java.util.*;

public class clearfunc {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating an empty set first of type Integer
        Set < Integer > set = new HashSet < Integer > (); 

        //n is the size of the set
        int n = sc.nextInt ();

        //adding elements to the set
        for ( int i = 0 ; i < n ; i++ ) {
            set.add( sc.nextInt() );
        }
        //printing the initial set
        System.out.println ( "Set: " + set );

        //performing clear operation on the set
        set.clear();

        //printing the final set
        System.out.println ( "Set after clear() operation: " + set );

        sc.close();
    }
}

/*
Sample Input Output

Input:
5
1 2 3 4 5

Output:
Set: [1, 2, 3, 4, 5]
Set after clear() operation: []

*/


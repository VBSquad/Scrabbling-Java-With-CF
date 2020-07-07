/*
The toArray() method of Set Interface in java is used to form an array of the same elements as that of the Set. 
Basically, it copies all the element from a Set to a new array.
*/

import java.util.*;

public class toArrayfunc {
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
        //Displaying the set
        System.out.println ( "Set: " + set );

        //performing toArray() operation on set
        Object [] array = set.toArray ();

        //displaying the resulting array
        System.out.print ( "Resulting Array: ");
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print ( array [i] + " " );
        }


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
Resulting Array: 1 2 3 4 5 

*/


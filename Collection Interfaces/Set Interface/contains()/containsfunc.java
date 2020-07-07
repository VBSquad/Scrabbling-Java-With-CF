/*
The contains() method is used to check whether a specific element is present in the Set or not. 
In other words it is used to check if a Set contains any particular element.
It returns true if the element is present otherwise false.
*/

import java.util.*;

public class containsfunc {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating an empty set 
        Set < Integer > set = new HashSet < Integer > (); 

        //n is the size of the set
        int n = sc.nextInt ();

        //adding elements to the set
        for ( int i = 0 ; i < n ; i++ ) {
            set.add( sc.nextInt() );
        }

        //displaying the set
        System.out.println ( "Set: " + set );

        
        int a = sc.nextInt ();

        //checking and printing if a is present in the set or not 
        System.out.println ( "Does the set contains " + a + ": " + set.contains( a ) );

        sc.close();
    }
}

/*
Sample Input Output

Input:
5
1 2 3 4 5
3

Output:
Set: [1, 2, 3, 4, 5]
Does the set contains 3: true

Input:
5
1 2 3 4 5
6

Output:
Set: [1, 2, 3, 4, 5]
Does the set contains 6: false

*/


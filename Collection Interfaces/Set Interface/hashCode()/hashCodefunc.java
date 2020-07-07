/*
The hashCode() method of Set in Java is used to get the hashCode value for this instance of the Set. 
It returns an integer value which is the hashCode value for this instance of the Set.
*/

import java.util.*;

public class hashCodefunc {
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
        //printing the initial set
        System.out.println ( "Set: " + set );

        //printing the hashCode of the set
        System.out.println ( "HashCode of the Set: " + set.hashCode() );

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
HashCode of the Set: 15

*/


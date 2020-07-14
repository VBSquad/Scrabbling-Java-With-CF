/*
containsAll(Collection C) method of Set Interface  is used to check whether two sets contain the same elements or not. 
It takes one set c as a parameter and returns True if all of the elements of this set is present in the other set.
*/

import java.util.*;

public class containsAllfunc {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating an empty set 1
        Set < Integer > set1 = new HashSet < Integer > (); 

        //n is the size of the set 1
        int n = sc.nextInt ();

        //adding elements to the set 1
        for ( int i = 0 ; i < n ; i++ ) {
            set1.add( sc.nextInt() );
        }
        //printing set 1
        System.out.println ( "Set 1: " + set1 );

        //creating an another empty set 2
        Set < Integer > set2 = new HashSet < Integer > (); 

        //m is the size of the set 2
        int m = sc.nextInt ();

        //adding elements to the set 2
        for ( int i = 0 ; i < m ; i++ ) {
            set2.add( sc.nextInt() );
        }
        //printing set 2
        System.out.println ( "Set 2: " + set2 );

        //checking and printing if set2 is present in set1 or not
        System.out.println ( "Is set2 present in set1? : " + set1.containsAll ( set2 ) );

        sc.close();
    }
}

/*
Sample Input Output

Input:
5
1 2 3 4 5
3
1 3 5

Output:
Set 1: [1, 2, 3, 4, 5]
Set 2: [1, 3, 5]
Is set2 present in set1? : true

Input:
5
1 2 3 4 5
3 
6 2 7

Output:
Set 1: [1, 2, 3, 4, 5]
Set 2: [2, 6, 7]
Is set2 present in set1? : false

*/


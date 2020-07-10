/*
containsKey(k) method in Map Interface in java returns true if the map contains k as a key, otherwise false.
*/

import java.util.*;

public class containsKey {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating Hashmap
        Map < Integer , String > map = new HashMap <> ();

        //n is the size of the map
        int n = sc.nextInt ();

        //entering key value pair in the map
        for ( int i = 0 ; i < n ; i++ ) {
            map.put( sc.nextInt() , sc.next() );
        }
        //displaying the map
        System.out.println ( "Map: " + map );

        //k is key to be checked
        int k = sc.nextInt ();

        //checking if k is key in map or not
        System.out.println ( "Does map contain " + k + " as a key? " +  map.containsKey ( k ) );

        sc.close();

    }
}

/*
Sample Test Case

Input:
3
1 a
2 b
3 c
4

Output:
Map: {1=a, 2=b, 3=c}
Does map contain 4 as a key? false

*/


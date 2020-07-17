/*
get(k) method in Map Interface in java returns the value associated with key k.
*/

import java.util.*;

public class get {
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

        //k is the key whose value is to be displayed
        int k = sc.nextInt ();

        //displaying the value associated with key k
        System.out.println ( "Value of key " + k + " = " + map.get ( k ) );

        sc.close();

    }
}

/*
Sample Test Case

Input:
4
1 aa
2 bb
3 cc
4 dd
2

Output:
Map: {1=aa, 2=bb, 3=cc, 4=dd}
Value of key 2 = bb

*/


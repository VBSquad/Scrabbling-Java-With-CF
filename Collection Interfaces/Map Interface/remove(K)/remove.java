/*
remove(k) method in Map Interface in java removes the entry whose key equals to k (where key is an integer value).
*/

import java.util.*;

public class remove {
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

        //k is the key to be removed
        int k = sc.nextInt ();
         
        //removing the entry with key k
        map.remove ( k );

        //displaying the final map after remove operation
        System.out.println ( "Map after removing entry with key " + k + " " + map );

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
2

Output:
Map: {1=a, 2=b, 3=c}
Map after removing entry with key 2 {1=a, 3=c}

*/

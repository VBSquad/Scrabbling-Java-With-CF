/*
put(K,V) puts an entry in the map , overwriting the previous value if key K already exists. 
*/

import java.util.*;

public class put {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating Hashmap
        Map < Integer , String > map = new HashMap <> ();

        //n is the size of the map
        int n = sc.nextInt ();

        //entering elements to the map
        for ( int i = 0 ; i < n ; i++ ) {
            map.put( sc.nextInt() , sc.next() );
        }

        //displaying the map
        System.out.println ( "Map: " + map );

        //k is the key 
        int k = sc.nextInt ();

        //v is the value
        String v = sc.next ();
         
        //putting k and v to the map
        map.put( k, v );

        //displaying the final map
        System.out.println ( "Map after putting the new entry: " + map );

        sc.close();

    }
}

/*
Sample Test Case

Input:
2
1 a
3 c
2 
b

Output:
Map: {1=a, 3=c}
Map after putting the new entry: {1=a, 2=b, 3=c}

*/


/*
putAll() method in Map Interface is used for copy operation i.e it copies all the elements from one map to another.
*/

import java.util.*;

public class putAll {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating Hashmap
        Map < Integer , String > map1 = new HashMap <> ();

        //n is the size of the map
        int n = sc.nextInt ();

        //entering elements in the map
        for ( int i = 0 ; i < n ; i++ ) {
            map1.put( sc.nextInt() , sc.next() );
        }

        //displaying the map
        System.out.println ( "Map 1: " + map1 );
        
        //creating another map 
        Map < Integer , String > map2 = new HashMap <> ();

        //displaying the initial map2
        System.out.println ( "Map 2: " + map2 );

        //copying elements of map1 to map2
        map2.putAll ( map1 );
        
        //displaying map 2 after putAll() operation
        System.out.println ( "Map 2 after putAll() operation: " + map2 ); 

        sc.close();

    }
}

/*
Sample Test Case

Input:
3
1 abhi
2 shrey
3 nipun

Output:
Map 1: {1=abhi, 2=shrey, 3=nipun}
Map 2: {}
Map 2 after putAll() operation: {1=abhi, 2=shrey, 3=nipun}

*/


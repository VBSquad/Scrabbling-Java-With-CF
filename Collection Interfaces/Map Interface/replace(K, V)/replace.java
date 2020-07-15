/*
replace(k ,v) method in Map Interface in java replaces the value of the key k with the new value v.
*/

import java.util.*;

public class replace {
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

        //k is the key whose value is to be changed
        int k = sc.nextInt ();

        //v is the value
        String v = sc.next ();
        
        //replacing the value of key k
        map.replace ( k, v );

        //displaying the final map after replace operation
        System.out.println ( "Final map:" + map );

        sc.close();

    }
}

/*
Sample Test Case

Input:
3
1 Ram
2 Sham
3 Gyam

3 Dhym

Output:
Map: {1=Ram, 2=Sham, 3=Gyam}
Final map: {1=Ram, 2=Sham, 3=Dhym}

*/
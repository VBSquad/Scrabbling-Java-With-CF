/*
The containsKey(Object key) method is used to check if the map contains a mapping for the specified key.
*/

import java.util.*;

public class containsKey {

    public static void main ( String[] args ) {

        //creating an empty HashMap initially
        HashMap < Integer , String > hmap = new HashMap < Integer , String > ();
        Scanner sc = new Scanner ( System.in );

        //n is the number of mappings in the map
        int n = sc.nextInt ();

        //adding key value pairs to the HashMap
        for (int i = 0 ; i < n ; i++) {

            Integer a = sc.nextInt ();
            String b = sc.next ();

            hmap.put ( a, b );

        }

        //displaying the map
        System.out.println ( "Hashmap elements : " + hmap );

        int key = sc.nextInt ();

        //displaying if specified key is present in map or not
        System.out.println ( "Does HashMap contains key " + key + " ? " + hmap.containsKey (key) );
    }
}

/*
Sample Test Case

Input:
3
1 xyz
2 abc
3 pqr
2

Output:
Hashmap elements : {1=xyz, 2=abc, 3=pqr}
Does HashMap contains key 2 ? true

*/


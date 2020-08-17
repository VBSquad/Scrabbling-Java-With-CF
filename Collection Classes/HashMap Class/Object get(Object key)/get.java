/*
The get(Object key) method is used to return the value to which the specified key is mapped.
It returns null if the map contains no mapping for the key.
*/

import java.util.*;

public class get {

    public static void main ( String[] args ) {

        //creating an empty HashMap initially
        HashMap < Integer , String > hmap = new HashMap < Integer , String > ();

        Scanner in = new Scanner ( System.in );

        //n is the number of mappings in the map
        int n = in.nextInt ();

        //adding key value pairs to the HashMap
        for (int i = 0 ; i < n ; i++) {

            Integer a = in.nextInt ();
            String b = in.next ();

            hmap.put ( a, b );

        }

        //displaying the Hashmap elements
        System.out.println ( "Hashmap elements : " + hmap );

        int k = in.nextInt ();

        //printing the value to which key k is mapped
        System.out.println ( "Key " + k + " is mapped to value: " + hmap.get ( k ) );
    }
}

/*
Sample Test Case

Input:
3
1 xyz
2 abc
3 uvw
2

Output:
Hashmap elements : {1=xyz, 2=abc, 3=uvw}
Key 2 is mapped to value: abc

*/


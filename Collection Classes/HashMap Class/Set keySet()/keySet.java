/*
The keySet() method in Java is used to create a set of the keys contained in the hash map.
*/

import java.util.*;

public class keySet {

    public static void main ( String[] args ) {

        //creating an empty HashMap initially
        HashMap < Integer , String > hmap = new HashMap < Integer , String > ();
        Scanner in = new Scanner ( System.in );

        //n is the number of mappings in the map
        int n = in.nextInt ();

        //adding key value pairs to the HashMap
        for (int i = 0 ; i < n ; i++) {

            Integer a = in.nextInt();
            String b = in.next();

            hmap.put ( a, b );

        }

        //displaying the map
        System.out.println ( "Hashmap : " + hmap );

        //displaying the key set
        System.out.println ( "The key Set is : " + hmap.keySet() );
    }
}

/*
Sample Test Case

Input:
2
1 xyz
2 abc

Output:
Hashmap : {1=xyz, 2=abc}
The key Set is : [1, 2]

*/


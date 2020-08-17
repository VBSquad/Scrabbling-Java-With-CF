/*
clear() method in HashMap class removes all of the mappings from the map.
The HashMap will be empty after this call returns.
*/

import java.util.*;

public class clear {

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

        //displaying the map initially
        System.out.println ( "Hashmap elements : " + hmap );

        //performing clear() operation on the HashMap
        hmap.clear();

        //printing the final HashMap
        System.out.println ( "Hashmap after clear operation : " + hmap );
    }
}

/*
Sample Test Case

Input:
2
1 xyz
2 abc

Output:
Hashmap elements : {1=xyz, 2=abc}
Hashmap after clear operation : {}

*/


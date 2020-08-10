/*
The clone() method is used to return a shallow copy of the mentioned hash map.
It just creates a copy of the map.
*/

import java.util.*;

public class clone {

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

        //displaying the Hashmap
        System.out.println ( "Hashmap : " + hmap );

        //displaying the cloned HashMap
        System.out.println ( "Cloned HashMap : " + hmap.clone () );
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
Cloned HashMap : {1=xyz, 2=abc}

*/


/*
The remove() method of HashMap class is used to remove the mapping of any particular key from the map.
*/

import java.util.*;

public class remove {

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

        //displaying the map initially
        System.out.println ( "Hashmap : " + hmap );

        int k = in.nextInt ();

        //removing the mapping of key k from the hashmap
        hmap.remove ( k );

        //printing the final HashMap
        System.out.println ( "Hashmap after removing mapping of key " + k + " : " + hmap );
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
Hashmap : {1=xyz, 2=abc, 3=uvw}
Hashmap after removing mapping of key 2 : {1=xyz, 3=uvw}

*/


/*
The entrySet() method in Java is used to create a set out of the same elements contained in the hash map.
It basically returns a set view of the hash map.
*/

import java.util.*;

public class entrySet {

    public static void main ( String[] args ) {

        //creating an empty HashMap initially
        HashMap < Integer , String > hmap = new HashMap < Integer , String > ();

        Scanner in = new Scanner ( System.in );

        //n is the number of mappings in the map
        int n = in.nextInt ();

        //adding key value pairs to the HashMap
        for ( int i = 0 ; i < n ; i++ ) {

            Integer a = in.nextInt ();
            String b = in.next ();

            hmap.put ( a, b );

        }

        //displaying the HashMap
        System.out.println ( "Hashmap : " + hmap );

        //displaying the set view of HashMap
        System.out.println ( "Set View : " + hmap.entrySet () );
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
Set View : [1=xyz, 2=abc]

*/


/*
The values() method of HashMap class in Java is used to create a collection out of the values of the map.
*/

import java.util.*;

public class values {

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

        //displaying the HashMap
        System.out.println ( "Hashmap  : " + hmap );

        //displaying the collection made out of values in HashMap
        System.out.println ( "Collection of HashMap's values : " + hmap.values() );
    }
}

/*
Sample Test Case

Input:
2
1 xyz
2 abc

Output:
Hashmap  : {1=xyz, 2=abc}
Collection of HashMap's values : [xyz, abc]

*/


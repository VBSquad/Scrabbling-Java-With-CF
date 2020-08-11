/*
The put() method of HashMap is used to insert a mapping into a map.
If an existing key is passed then the previous value gets replaced by the new value.
If a new pair is passed, then the pair gets inserted as a whole.
*/

import java.util.*;

public class put {

    public static void main ( String[] args ) {

        //creating an empty HashMap initially
        HashMap < Integer , String > hmap = new HashMap < Integer , String > ();
        Scanner in = new Scanner ( System.in );

        //n is the number of mappings in the map initially
        int n = in.nextInt ();

        //adding key value pairs to the HashMap
        for (int i = 0 ; i < n ; i++) {

            Integer a = in.nextInt ();
            String b = in.next ();

            hmap.put ( a, b );

        }

        //displaying the map initially
        System.out.println ( "Initial HashMap : " + hmap );

        int k = in.nextInt ();
        String v = in.next ();

        //inserting a mapping in the HashMap
        hmap.put ( k , v );

        //printing the final HashMap
        System.out.println ( "Final Hashmap : " + hmap );
    }
}

/*
Sample Test Case

Input:
2
1 xyz
2 abc
3 uvw

Output:
Initial HashMap : {1=xyz, 2=abc}
Final Hashmap : {1=xyz, 2=abc, 3=uvw}

*/


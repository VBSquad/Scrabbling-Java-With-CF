/*
boolean containsValue(Object value) method returns true if the specified value equals to the value within the map,
else return false.
*/

import java.util.*;

public class containsValue {

    public static void main ( String [] args ) {

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

        //displaying the map
        System.out.println ( "Hashmap elements : " + hmap );

        String value = in.next ();

        //printing whether the HashMap contains the given value or not
        System.out.println ( "Does HashMap contains value " + value + "? " + hmap.containsValue ( value ) );
    }
}

/*
Sample Test Case

Input:
2
1 xyz
2 abc
abc

Output:
Hashmap elements : {1=xyz, 2=abc}
Does HashMap contains value abc? true
*/


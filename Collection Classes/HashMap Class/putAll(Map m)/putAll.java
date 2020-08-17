/*
The putAll() is an inbuilt method of HashMap class that is used for the copy operation.
This method copies all of the elements i.e., the mappings, from one map into another.
*/

import java.util.*;

public class putAll {

    public static void main ( String[] args ) {

        //creating an empty HashMap initially
        HashMap < Integer , String > hmap1 = new HashMap < Integer , String > ();

        Scanner in = new Scanner ( System.in );

        //n is the number of mappings in the Hashmap1
        int n = in.nextInt ();

        //adding key value pairs to the HashMap1
        for (int i = 0 ; i < n ; i++) {

            Integer a = in.nextInt();
            String b = in.next();

            hmap1.put ( a, b );

        }

        //displaying the HashMap1
        System.out.println ( "Hashmap1 : " + hmap1 );

        //creating an empty HashMap2
        HashMap < Integer , String > hmap2 = new HashMap < Integer , String > ();

        //copying all elements from hashmap1 to hashmap2
        hmap2.putAll ( hmap1 );

        //printing the HashMap2
        System.out.println ( "Hashmap2 : " + hmap2 );
    }
}

/*
Sample Test Case

Input:
2
1 xyz
2 abc

Output:
Hashmap1 : {1=xyz, 2=abc}
Hashmap2 : {1=xyz, 2=abc}

*/


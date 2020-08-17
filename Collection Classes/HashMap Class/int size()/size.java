/*
The size() method of HashMap class is used to get the size of the map which refers to the number of the key-value pairs in the Map.
*/

import java.util.*;

public class size {

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

        //printing the size of HashMap
        System.out.println ( "Size of Hashmap : " + hmap.size() );
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
Size of Hashmap : 2

*/


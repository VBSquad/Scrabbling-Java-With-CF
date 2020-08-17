/*
The isEmpty() method of HashMap class is used to check whether the HashMap is empty or not.
The method returns True if no key-value pair or mapping is present in the map else it returns False.
*/

import java.util.*;

public class isEmpty {

    public static void main ( String[] args ) {

        //creating an empty HashMap initially
        HashMap < Integer , String > hmap = new HashMap < Integer , String > ();

        //displaying the initial HashMap
        System.out.println ( "Initial Hashmap : " + hmap );

        //displaying whether hashmap is empty or not
        System.out.println ( "Is HashMap empty? " + hmap.isEmpty() );

        Scanner in = new Scanner ( System.in );

        //n is the number of mappings in the map
        int n = in.nextInt ();

        //adding key value pairs to the HashMap
        for (int i = 0 ; i < n ; i++) {

            Integer a = in.nextInt();
            String b = in.next();

            hmap.put ( a, b );

        }

        //displaying the HashMap after adding elements
        System.out.println ( "Final Hashmap : " + hmap );

        //displaying whether hashmap is empty or not
        System.out.println ( "Is HashMap empty now? " + hmap.isEmpty() );

    }
}

/*
Sample Test Case

Input:
2
1 xyz
2 abc

Output:
Initial Hashmap : {}
Is HashMap empty? true
Final Hashmap : {1=xyz, 2=abc}
Is HashMap empty now? false

*/


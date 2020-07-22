/*
boolean add(Object o) method appends the specified element to the end of the vector.
It returns true if the specified element is added successfully to the vector, otherwise false.
*/

import java.util.*;

public class add {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating default vector
        Vector v = new Vector <> ();

        //printing the initial vector
        System.out.println ( "Initial Vector : " + v );

        int o = sc.nextInt ();

        //adding element o to the vector
        System.out.println( "Is " + o + " added successfully to the vector? " + v.add ( o ));

        //printing the final vector after adding o
        System.out.println ( "Final Vector after adding " + o + ": " + v );

        sc.close ();

    }
}

/*

Sample Test Case

Input:
5

Output:
Initial Vector : []
Is 5 added successfully to the vector? true
Final Vector after adding 5: [5]

*/


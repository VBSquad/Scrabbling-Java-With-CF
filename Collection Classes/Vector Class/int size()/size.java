/*
The size() method in Java is used to get the size of the Vector or the number of elements present in the Vector.
*/

import java.util.*;

public class size {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating default vector
        Vector v = new Vector <> ();

        //adding elements to the vector
        v.add ( "Ram" );
        v.add ( "Shyam" );
        v.add ( "Meena" );

        //printing the vector
        System.out.println ( "Vector : " + v );

        int n = v.size ();

        //printing the size of the vector
        System.out.println ( "Size of the Vector is : " + n );
        sc.close ();

    }
}

/*

Output:
Vector : [Ram, Shyam, Meena]
Size of the Vector is : 3

*/


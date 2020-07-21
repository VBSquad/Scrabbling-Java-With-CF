/*
indexOf(Object o) method returns the index value of specified object o in the ArrayList. 
*/

import java.util.*;
public class indexOf {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating arraylist
        ArrayList < Integer > a = new ArrayList <> ();

        //n is number of elements in Arraylist 
        int n = sc.nextInt ();

        //adding elements to Arraylist
        for( int i = 0 ; i < n ; i++ ) {
            a.add ( sc.nextInt() );
        }

        //displaying the Arraylist
        System.out.println ( "ArrayList: " + a );

        //e is the object in the arraylist
        int o = sc.nextInt ();

        //displaying the index of object o
        System.out.println ( "Index of element " + o + ": " + a.indexOf ( o ) );

        sc.close();
    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
2

Output:
ArrayList: [1, 2, 3, 4, 5]
Index of element 2: 1

*/



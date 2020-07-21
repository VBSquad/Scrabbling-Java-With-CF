/*
lastIndexOf(Object o) method returns the index of the last occurrence of object o in the ArrayList.
It returns -1 if the element does not exists.
*/

import java.util.*;
public class lastIndexOf {
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

        //o is the object whose last occurrence index is to be returned
        int o = sc.nextInt ();

        //displaying the last index of o
        System.out.println ( "Last Index of element " + o + ": " + a.lastIndexOf( o ) );

        sc.close();
    }
}

/*
Sample Test Case

Input:
5
1 2 1 2 1
1

Output:
ArrayList: [1, 2, 1, 2, 1]
Last Index of element 1: 4

*/


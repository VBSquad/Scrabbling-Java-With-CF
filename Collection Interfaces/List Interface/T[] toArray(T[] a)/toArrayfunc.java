/*
T[] toArray(T[] a) converts a list into an array arr[] and returns same. 
If arr[] is not big enough, then a new array of same type is allocated for this purpose.
*/

import java.util.*;
public class toArrayfunc {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //initialising the list which is to be converted in an array 
        ArrayList < Integer > list = new ArrayList < Integer > ();

        //n is the size of list
        int n = sc.nextInt ();

        for ( int i = 0 ; i < n ; i++ ) {
            list.add ( sc.nextInt() );
        }
        //printing the list
        System.out.println ( "List: " + list );

        //performing the toArray() operation on list
        Integer [] arr = new Integer [ list.size() ]; 
        arr = list.toArray ( arr ); 

        //printing the resultant array
        System.out.print ( "Resulting Array: " );
        for ( Integer x : arr ) 
            System.out.print ( x + " " ); 

        sc.close ();
    }
}

/*
Sample Test Case:

Input:
5
1 2 3 4 5

Output:
List: [1, 2, 3, 4, 5]
Resulting Array: 1 2 3 4 5 

*/


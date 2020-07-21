/*
get(int index) method returns the element present at the specific index in the ArrayList. 
*/

import java.util.*;
public class get {
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

        int index = sc.nextInt ();

        //displaying the element at position index
        System.out.println ( "Element at index " + index + ": " + a.get( index ) );

        sc.close();
    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
0

Output:
ArrayList: [1, 2, 3, 4, 5]
Element at index 0: 1

*/


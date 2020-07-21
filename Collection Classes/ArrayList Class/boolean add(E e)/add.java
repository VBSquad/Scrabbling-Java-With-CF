/*
add(E e) method in ArrayList is used to append the specified element e at the end of a list.
It returns a boolean value, true on successful addition otherwise false.
*/

import java.util.*;
public class add {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating arraylist
        ArrayList < Integer > a = new ArrayList <> ();

        //n is number of elements in list initially
        int n = sc.nextInt ();
        //adding elements to list
        for( int i = 0 ; i < n ; i++ ) {
            a.add ( sc.nextInt() );
        }

        //displaying initial list
        System.out.println ( "Initial ArrayList: " + a );

        //e is the elements that is to be added in the list
        int e = sc.nextInt ();

        //add() method returns true on successful addition
        System.out.println ( "Is element " + e + " added to arrayList? " + a.add ( e ) );

        //displaying final list after adding the element e
        System.out.println ( "Final ArrayList: " + a );

        sc.close();
    }
}

/*
Sample Test Case

Input:
3
1 6 4
3

Output:
Initial ArrayList: [1, 6, 4]
Is element 3 added to arrayList? true
Final ArrayList: [1, 6, 4, 3]

*/



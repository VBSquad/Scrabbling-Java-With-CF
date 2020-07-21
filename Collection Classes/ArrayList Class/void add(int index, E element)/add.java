/*
add(int index , Element e) method in ArrayList is used to add the element e at specified index of a list.
*/

import java.util.*;
public class add {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating arraylist
        ArrayList < Integer > a = new ArrayList < Integer > ();

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

        //in is the index at which element e is to be added
        int in = sc.nextInt ();

        a.add( in , e );

        //displaying final list after adding the element e
        System.out.println ( "Final ArrayList: " + a );

        sc.close();
    }
}

/*
Sample Test Case

Input:
4
1 2 4 5
3
2

Output:
Initial ArrayList: [1, 2, 4, 5]
Final ArrayList: [1, 2, 3, 4, 5]

*/



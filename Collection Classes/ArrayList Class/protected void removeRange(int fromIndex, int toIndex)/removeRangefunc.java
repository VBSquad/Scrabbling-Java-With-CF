/*
The removeRange(int fromIndex, int toIndex) method removes from the list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive. 
It shifts any succeeding elements to the left.
If toIndex equals to fromIndex, this operation has no effect.
*/


import java.util.*;
public class removeRangefunc extends ArrayList < Integer > {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating an empty arraylist
        removeRangefunc a = new removeRangefunc () ;

        //n is number of elements in list 
        int n = sc.nextInt ();

        //adding elements to list
        for( int i = 0 ; i < n ; i++ ) {
            a.add ( sc.nextInt () );
        }

        //displaying initial list
        System.out.println ( "Initial ArrayList: " + a );

        //fromIndex is the index from which elements are to be removed.
        int fromIndex = sc.nextInt ();
 
        //toIndex is the index upto which elements are to be removed
        int toIndex = sc.nextInt ();

        a.removeRange ( fromIndex , toIndex );

        //displaying final list after adding the element e
        System.out.println ( "Final ArrayList after removeRange operation: " + a );

        sc.close();
    }
}

/*

Sample Test Case

Input:
5
1 2 3 4 5
2 3

Output:
Initial ArrayList: [1, 2, 3, 4, 5]
Final ArrayList after removeRange operation: [1, 2, 4, 5]

*/



/*
The subList(int fromIndex,int toIndex) method is used to return a view of the portion of the vector
between fromIndex i to (specifiedindex - 1 ).
*/

import java.util.*;

public class subList {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating default vector
        Vector v = new Vector <> ();

        //n is number of elements in the vector
        int n = sc.nextInt ();

        //adding elements to the vector
        for ( int i = 0 ; i < n ; i++ ) {
            v.add ( sc.nextInt() );
        }

        //printing the vector
        System.out.println ( "Vector : " + v );

        //creating a list
        List list = new  ArrayList <> ();

        int fromIndex = sc.nextInt ();

        int toIndex = sc.nextInt ();

        //list is the sublist of the vector
        list = v.subList( fromIndex, toIndex );

        //printing the sublist 
        System.out.println ( "Sublist : " + list );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
2 4

Output:
Vector : [1, 2, 3, 4, 5]
Sublist : [3, 4]

*/


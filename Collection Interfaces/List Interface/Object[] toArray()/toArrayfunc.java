/*
The Object[] toArray() method of List Interface returns an array containing all of the elements in a list in proper sequence i.e from first to last element. 
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
        Object [] objects = list.toArray ();

        //printing the resultant array
        System.out.print ( "Resulting Array: " );
        for ( Object obj : objects ) {
            System.out.print ( obj + " " );
        }
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


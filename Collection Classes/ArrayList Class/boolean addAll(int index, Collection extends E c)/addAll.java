/*
addAll(int index, Collection c) method adds all the elements of collection c to the ArrayList at specified index .
It returns a boolean value i.e. true on successful addition otherwise false.
*/

import java.util.*;
 
public class addAll {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );
 
        //n is number of elements in ArrayList
        int n = sc.nextInt ();
 
        //creating an empty arraylist
        ArrayList < Integer > list = new ArrayList < Integer > ();
 
        //adding elements to the ArrayList 
        for ( int i = 0; i < n ; i++ ) {
            list.add ( sc.nextInt() );
        }
 
        //displaying the initial ArrayList 
        System.out.println ( "Initial ArrayList: " + list );

        //m is size of collection to be added to the ArrayList
        int m = sc.nextInt ();
 
        //creating collection c i.e an Arraylist
        ArrayList < Integer > list1 = new ArrayList < Integer > ();
 
        //adding elements to the collection
        for ( int i = 0; i < m ; i++ ) {
            list1.add ( sc.nextInt() );
        }

        System.out.println( "The collection c is: " + list1 );

        //index is the position where the collection is to be added in the ArrayList
        int index = sc.nextInt ();

        //adding all elements of collection c to the arraylist
        list.addAll ( index , list1 );

        //displaying the final ArrayList
        System.out.println( "ArrayList after addAll operation: " + list );
 
        sc.close();
    }
}

/*

Sample Test Case

Input:
3
5 7 4
2
5 3
1

Output:
Initial ArrayList: [5, 7, 4]
The collection c is: [5, 3]
ArrayList after addAll operation: [5, 5, 3, 7, 4]

*/


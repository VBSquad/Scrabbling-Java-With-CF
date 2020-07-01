/*
add(int index, Collection c) adds all the elements of c at the specified index of a list.
It returns a boolean value i.e. true on successful addition otherwise false.
*/

import java.util.*;
 
public class addAllfunc {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );
 
        //n is size of the list
        int n = sc.nextInt ();
 
        //creating an empty arraylist
        ArrayList < Integer > list = new ArrayList < Integer > ();
 
        //adding elements to the list 
        for ( int i = 0; i<n ; i++ ) {
            list.add( sc.nextInt() );
        }
 
        //printing the list 
        System.out.println ( " The list is " + list );

        //m is size of collection to be added to the list
        int m = sc.nextInt ();
 
        //creating collection c i.e an Arraylist
        ArrayList < Integer > list1 = new ArrayList < Integer > ();
 
        //adding elements to the collection
        for ( int i = 0; i<m ; i++ ) {
            list1.add( sc.nextInt() );
        }

        System.out.println( "The collection c is: " + list1 );

        //index is the position where the collection is to be added in the list
        int index = sc.nextInt();

        //performing the addAll operation on list
        list.addAll( index, list1 );

        //printing the final list
        System.out.println( "List after addAll operation: " + list );
 
        sc.close();
    }
}

/*
Sample Test Case

Input
5
1 4 5 6 7
2
2 3
1

Output:
The list is [1, 4, 5, 6, 7]
The collection c is: [2, 3]
List after addAll operation: [1, 2, 3, 4, 5, 6, 7]
*/


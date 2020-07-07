/* 
The containsAll( Collection c) method of List interface in Java is used to check if this List contains all of the elements in the specified Collection. 
So basically it is used to check if a List contains a set of elements or not.
Collection c is whose elements are needed to be checked if it is present in the List or not.
The method returns True if all elements in the collection c are present in the List otherwise it returns False.
*/

import java.util.*;
public class containsAllfunc {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating an empty list
        ArrayList < Integer > list1 = new ArrayList < Integer > ();

        //n is size of the list
        int n = sc.nextInt ();

        //adding elements to the list
        for ( int i = 0 ; i < n ; i++) {
            list1.add ( sc.nextInt() );
        }
        
        //creating a collection i.e an arraylist whose elements is to be checked
        ArrayList < Integer > list2 = new ArrayList < Integer > ();

        //m is size of the collection
        int m = sc.nextInt ();

        //adding elements to the collection
        for ( int i = 0 ; i < m ; i++) {
            list2.add ( sc.nextInt() );
        }

        //performing containsAll() operation on list1
        System.out.println ( list1.containsAll( list2 ) );

        sc.close ();


    }
}

/*
Sample Test Case 1

Input:
5
1 2 3 4 5
3
2 3 4

Output:
true

Sample Test Case 2

Input:
5
1 2 3 4 5
3
2 3 7

Output:
false

*/


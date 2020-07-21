/* 
addAll(Collection c) method appends all of the elements in the specified collection c to the end of the list.
*/

import java.util.*;
public class addAll {
    public static void main (String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //n is the number of elements in first list
        int n = sc.nextInt ();

        ArrayList < Integer > list1 = new ArrayList < Integer > ();

        //adding elements to list1
        for( int i = 0 ; i < n ; i++ ) {
            list1.add ( sc.nextInt() );
        }

        //m is the number of elements in collection c
        int m = sc.nextInt ();

        ArrayList < Integer > list2 = new ArrayList < Integer > ();

        //adding elements to list2
        for( int i = 0 ; i < m ; i++) {
            list2.add( sc.nextInt() );
        }

        //printing the initial list
        System.out.println( " Initial Arraylist " + list1 );

        //performing addAll() operation on list1
        list1.addAll(list2);

        //printing the final list
        System.out.println( " Final Arraylist " + list1 );

        sc.close();
    }
    
}

/*
Sample Test Case

Input:
3
11 7 9
2
2 10

Output:
Initial Arraylist [11, 7, 9]
Final Arraylist [11, 7, 9, 2, 10]

*/


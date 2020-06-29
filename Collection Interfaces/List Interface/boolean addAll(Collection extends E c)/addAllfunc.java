/* addAll(Collection c) methods appends all of the elements in the specified collection to the end of this list, 
in the order that they are returned by the specified collection’s Iterator ,
where the parameter c is the collection containing elements to be added to this list.
*/

import java.util.*;
public class addAllfunc {
    public static void main (String [] args ){
        Scanner sc = new Scanner( System.in );

        //n is the size of first list in which elements are to be appended
        int n = sc.nextInt();

        ArrayList < Integer > list1 = new ArrayList < Integer >();

        //getting elements of list1
        for( int i=0;i<n;i++){
            list1.add( sc.nextInt() );
        }

        //m is the size of collection containing elements to be added to above list
        int m = sc.nextInt();

        ArrayList < Integer > list2 = new ArrayList < Integer >();

        //getting elements of list2
        for( int i=0;i<m;i++){
            list2.add( sc.nextInt() );
        }

        //printing the initial list
        System.out.println( " Initial list " + list1 );

        //performing addAll() operation on list1
        list1.addAll(list2);

        //printing the final list
        System.out.println( " Final list " + list1 );

        sc.close();
    }
    
}

/*
Sample Test Case

Input:
5
1 2 3 4 5 
3 
6 7 8
Output:
Initial list [1, 2, 3, 4, 5]
Final list [1, 2, 3, 4, 5, 6, 7, 8]

*/
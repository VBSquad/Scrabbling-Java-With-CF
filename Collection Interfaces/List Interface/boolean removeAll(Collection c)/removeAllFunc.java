/*
The removeAll() method is used to remove from a given list all of its elements that are contained in the specified collection.
It takes collection c as a parameter containing elements to be removed from this list.
This method returns true if this list changed as a result of the call.
*/

import java.util.*;
public class removeAllFunc {
    public static void main( String [] args ){
        Scanner sc = new Scanner(System.in);

        //Creating an empty array list1
        ArrayList < Integer > list1 = new ArrayList < Integer > ();

        //n is the size of list1
        int n = sc.nextInt();

        //entering elements of list1
        for (int i=0;i<n;i++){
            list1.add( sc.nextInt() );
        }

        //printing the initial list
        System.out.println( " Initial list: " + list1 );
        
        //m is the size of list2
        int m  = sc.nextInt();

        ArrayList < Integer > list2 = new ArrayList < Integer > ();
        
        //entering elements of list2
        for (int i=0;i<m;i++){
            list2.add( sc.nextInt() );
        }


        //removeAll() method returns true if the list is changed.
        //removing elements of list2 from list1
        System.out.println( " is Removed : " + list1.removeAll( list2 ) );

        //printing the final list after removeAll() operation
		System.out.println( " List After Remove " + list1 );



    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
3
1 3 5

Output:
Initial list: [1, 2, 3, 4, 5]
is Removed : true
List After Remove [2, 4]
*/
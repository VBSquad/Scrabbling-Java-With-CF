/*
The retainAll(c) method of List Interface is used to remove all the list’s elements that are not contained in the specified collection c.
In other terms it retains all the elements in the current List that matches all elements from the Collection c passed as a parameter to the method.
*/
import java.util.*;
public class retainAllfunc {
    public static void main ( String [] args){
        Scanner sc = new Scanner ( System.in );

        //n is the size of current list
        int n = sc.nextInt();

        ArrayList < Integer > list1 = new ArrayList < Integer >();

        //adding elements to the list
        for(int i = 0;i < n;i++){
            list1.add( sc.nextInt() );
        }
        System.out.println( "List: " + list1 );
        //m is the size of collection c
        int m = sc.nextInt();

        ArrayList < Integer > list2 = new ArrayList < Integer >();
        //adding elements to the collection
        for(int i = 0;i < m;i++){
            list2.add( sc.nextInt() );
        }
        System.out.println( "Collection c: " + list2 );
        //performing retainAll() operation on the list
        list1.retainAll( list2 );

        //printing final list
        System.out.println( "List after performing retainAll operation: " + list1 );
        sc.close();
    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
5
7 6 5 4 3

Output:
List: [1, 2, 3, 4, 5]
Collection c: [7, 6, 5, 4, 3]
List after performing retainAll operation: [3, 4, 5]
*/


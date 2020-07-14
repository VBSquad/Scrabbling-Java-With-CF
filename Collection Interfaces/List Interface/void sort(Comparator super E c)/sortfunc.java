/*
The sort() method is used to sort a list according to the order induced by the specified Comparator.
All elements in this list must be mutually comparable using the specified comparator .
If the specified comparator is null then the elements' natural ordering should be used.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class sortfunc {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );

        //n is the size of the list on which sort() operation is to be performed
        int n = sc.nextInt ();

        ArrayList < Integer > list = new ArrayList < Integer > ();

        //adding user entered elements in the list
        for ( int i = 0 ; i < n ; i++ ){
            list.add ( sc.nextInt() );
        }
        //printing the initial list
        System.out.println ( "Initial list: " + list );

        //performing sort operation on list
        //passing the constructor of comparator class as an argument
        list.sort ( new comp() );

        //printing the final list
        System.out.println ( "Final list: " + list );

        sc.close();

    }
}

//defining the comparator class 
class comp implements Comparator < Integer > {
    public int compare ( Integer i1 , Integer i2 ) {
        if( i1 > i2) {
            return 1;
        }
        return -1;
    }
}

/*
Sample Test Case

Input:
5
7 3 5 2 8

Output:
Initial list: [7, 3, 5, 2, 8]
Final list: [2, 3, 5, 7, 8]

*/


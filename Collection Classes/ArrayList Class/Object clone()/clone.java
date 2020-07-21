/*
The clone() method is used to create a shallow copy of the mentioned array list.
It just creates a copy of the Arraylist.
*/

import java.util.*;
public class clone {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating arraylist
        ArrayList < Integer > a = new ArrayList <> ();

        //n is number of elements in Arraylist 
        int n = sc.nextInt ();

        //adding elements to Arraylist
        for( int i = 0 ; i < n ; i++ ) {
            a.add ( sc.nextInt() );
        }

        System.out.println ( "Arraylist : " + a );

        ArrayList < Integer > b = ( ArrayList< Integer > ) a.clone();

        //displaying the index of object o
        System.out.println ( "Cloned Arraylist : " + b );

        sc.close();
    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5

Output:
ArrayList: [1, 2, 3, 4, 5]
Cloned Arraylist : [1, 2, 3, 4, 5]

*/


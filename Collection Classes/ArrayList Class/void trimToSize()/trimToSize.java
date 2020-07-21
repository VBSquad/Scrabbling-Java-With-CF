/*
The trimToSize() method of ArrayList trims the capacity of an ArrayList instance to be the list’s current size. 
This method is used to trim an ArrayList instance to the number of elements it contains.
*/

import java.util.*;
public class trimToSize {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating arraylist of size 10
        ArrayList < Integer > a = new ArrayList <> ( 10 );

        //n is number of elements in Arraylist 
        int n = sc.nextInt ();

        //adding elements to Arraylist
        for ( int i = 0 ; i < n ; i++ ) {
            a.add ( sc.nextInt() );
        }

        //triming the array to number of elements present
        a.trimToSize();

        //printing the elements in the array

        System.out.println ( "Elements in ArrayList are: ");

        for ( int number : a ) {
            System.out.println ( number ); 
        }

        sc.close();
    }
}

/*

Sample Test Case

Input:
5
1 2 3 4 5

Output:
Elements in ArrayList are: 
1
2
3
4
5

*/



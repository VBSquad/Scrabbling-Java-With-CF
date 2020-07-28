/*
The toArray() method of Vector class in Java is used to form an array of the same elements as that of the Vector. 
Basically, it copies all the element from a Vector to a new array.
*/

import java.util.*;

public class toArray {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating default vector
        Vector v = new Vector <> ();

        //n is number of elements in the vector
        int n = sc.nextInt ();

        //adding elements to the vector
        for ( int i = 0 ; i < n ; i++ ) {
            v.add ( sc.nextInt() );
        }

        //printing the vector
        System.out.println ( "Vector : " + v );

        //creating an array of same elements as that in vector
        Object[] arr = v.toArray ();

        //printing the array
        System.out.println ( "Elements in array are : " );
        for ( int i = 0 ; i < arr.length ; i++ )
        {
            System.out.println ( arr[i] );
        }

        sc.close ();

    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5

Output:
Vector : [1, 2, 3, 4, 5]
Elements in array are : 
1
2
3
4
5

*/


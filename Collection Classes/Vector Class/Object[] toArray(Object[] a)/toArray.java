/*
The toArray(Object[]a) method of Vector class in Java is used to form an array of the same elements as that of the Vector.
The method accepts one parameter arr[] which is the array into which the elements of the Vector are to be stored.
*/

import java.util.*;

public class toArray {
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );
        // Creating an empty Vector 
        Vector < String > v = new Vector < String > (); 
  
        int n = sc.nextInt ();

        //adding elements to the vector
        for ( int i = 0 ; i < n ; i++ ) {
            v.add ( sc.next() );
        }
  
        // Displaying the Vector 
        System.out.println ( "Vector: " + v); 
  
        // Creating the array and using toArray() 
        String [] arr = new String [5]; 
        arr = v.toArray ( arr ); 
  
        // Displaying array 
        System.out.println ( "The array is: " ); 

        for ( int j = 0 ; j < arr.length ; j++ ) 
            System.out.println (arr [j] ); 

        
        sc.close ();

    } 
} 

/*
Sample Test Case

Input:
5
1 2 3 4 5

Output:
Vector: [1, 2, 3, 4, 5]
The array is: 
1
2
3
4
5

*/


/*
The replaceAll(UnaryOperator operator) method of the List interface accept an object of the UnaryOperator representing a particular operation, 
performs the specified operation on all the elements of the current list and replaces the existing values in the list with their respective results.
*/

import java.util.*;
import java.util.function.UnaryOperator;

public class replaceAllfunc {
    public static void main ( String [] args ){
        Scanner sc = new Scanner ( System.in );

        //creating an empty list 
        ArrayList < Integer > list = new ArrayList < Integer > ();

        //n is the size of the list interface
        int n = sc.nextInt ();

        //adding elements to list interface 
        for( int i = 0; i<n; i++){
            list.add( sc.nextInt());
        }

        //printing the initial list
        System.out.println ( "Initial list: " + list );

        //performing replaceAll() operation
        list.replaceAll( new addition() );

        //printing the final list
        System.out.println ( "Final list: " + list );

        sc.close();
    }
}

//defining the unary operation that has to be performed on the list interface
class addition implements UnaryOperator < Integer > {
    public Integer apply( Integer i) {
        return i+5;
     }
}

/*
Sample Test Case

Input:
3
5 10 15

Output:
Initial list: [5, 10, 15]
Final list: [10, 15, 20]

*/


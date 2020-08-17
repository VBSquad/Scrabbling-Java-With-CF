/**
 boolean add(E e) : returns True if the element is not present in the LinkedHashSet otherwise False if the element is already present in the LinkedHashSet.
 
 */
import java.util.*;

class LinkedHashSetAdd {

    public static void main(String args[]) {

      Scanner sc = new Scanner( System.in );

      //size of LinkedHashSet
      int nn = sc.nextInt();

        LinkedHashSet hs = new LinkedHashSet();  

        // Mapping string values to int keys
        for( int i = 0 ; i < nn ; i++ ){

            hs.add( sc.next() );

        }

        // Displaying the LinkedHashSet 
        System.out.println( "Initial List are: " + hs); 
        
   }    
}
/**
Input:
3
Student Code In
Output:
Initial List are: [Student, Code, In]
*/ 
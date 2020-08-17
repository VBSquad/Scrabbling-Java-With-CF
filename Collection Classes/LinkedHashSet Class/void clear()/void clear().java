/**
 void clear() : used to remove all of the elements from this set. The set will be empty after this call returns.
 
 */
import java.util.*;

class LinkedHashSetClear {

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
        
        hs.clear();
        
        // Displaying the LinkedHashSet 
        System.out.println( "Final List are: " + hs); 
   }    
}
/**
Input:
3
Student Code In
Output:
Initial List are: [Student, Code, In]
Final List are: []
*/ 
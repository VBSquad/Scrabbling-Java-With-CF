/**
 int size() :   returns the number of elements in the LinkedHashSet.
 
 */
import java.util.*;

class LinkedHashSetSize {

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
        
        //size of the set
        System.out.println( "Size of the set : " + hs.size() );
   }    
}
/**
Input:
3
Student Code Input
Output:
Initial List are: [Student, Code, Input]
Size of the set : 3
*/ 
/**
 boolean isEmpty() : returns true if LinkedHashSet contains no element, otherwise false.
 
 */
import java.util.*;

class LinkedHashSetIsEmpty {

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
        
        //isEmpty() 
        System.out.println( "Is the Set isEmpty : " + hs.isEmpty() );
   }    
}
/**
Input:
3
Student Code Input
Output:
Initial List are: [Student, Code, Input]
Is the Set isEmpty : false
*/ 
/**
 boolean remove(Object o) :  removes the specified element from the LinkedHashSet if it is present and return true , else returns false .
 */
import java.util.*;

class LinkedHashSetRemove {

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

        //remove an Element
        System.out.println( "remove 'Student : " + hs.remove( "Student" ) );
        
        // Displaying the LinkedHashSet 
        System.out.println( "Final List are: " + hs); 
   }    
}
/**
Input:
3
Student Code Input
Output:
Initial List are: [Student, Code, Input]
remove 'Student : true
Final List are: [Code, Input]
*/ 
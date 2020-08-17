/**
 boolean contains(Object o) : used to return true if this set contains the specified element otherwise false.
 
 */
import java.util.*;

class LinkedHashSetContains {

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
        
        // check the existence of element 
        // using method contains() 
        boolean e = hs.contains( "In" ); 
  
        // print the result 
        System.out.println( "Is the element" + " 'In' present: "
                               + e ); 
   }    
}
/**
Input:
3
Student Code In
Output:
Initial List are: [Student, Code, In]
Is the element 'In' present: true
*/ 
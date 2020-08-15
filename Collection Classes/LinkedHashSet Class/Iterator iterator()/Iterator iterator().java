/**
 Iterator iterator() :   returns an iterator over the elements in this LinkedHashSet. The elements are returned from iterator in no specific order.
 */
import java.util.*;

class LinkedHashSetIterator {

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
        
        //Iterate over values
        Iterator<String> itr = hs.iterator();
 
        while(itr.hasNext()) {
            
            String value = itr.next();
            System.out.println("Value: " + value);
            
        }
   }    
}
/**
Input:
3
Student Code Input
Output:
Initial List are: [Student, Code, Input]
Value: Student
Value: Code
Value: Input
*/ 
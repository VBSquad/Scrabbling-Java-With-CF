/**
 Object clone() :  method is used to return a shallow copy of the mentioned hash set. It just creates a copy of the set.

 */
import java.util.*;

class LinkedHashSetClone {
    
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
        
        // Creating a new cloned set 
        LinkedHashSet cloned_set = new LinkedHashSet(); 
  
        // Cloning the set using clone() method 
        cloned_set = (LinkedHashSet)hs.clone(); 
  
        // Displaying the new Set after Cloning; 
        System.out.println("The new set: " + cloned_set);
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial List are: [Student, Code, Input]
The new set: [Student, Code, Input]
*/
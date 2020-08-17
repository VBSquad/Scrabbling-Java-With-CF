/**
  Object clone() : method returns a shallow copy of this TreeMap.

 */
import java.util.*;

class TreeMapClone {
   public static void main(String args[]) {
      
      Scanner sc = new Scanner( System.in );
      
      //size of TreeSet
      int n = sc.nextInt();
      
        // Creating an empty TreeMap 
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(); 
  
        // Mapping string values to int keys
        for( int i = 0 ; i < n ; i++ ){
            
            tree_map.put( i , sc.next() );
        
        }
  
        // Displaying the TreeMap 
        System.out.println( "Initial Mappings are: " + tree_map); 
        
        
        // Displaying the cloned TreeMapusing clone() 
        System.out.println("The cloned map look like this: " +  
        tree_map.clone()); 
        
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
The cloned map look like this: {0=Student, 1=Code, 2=In}
*/
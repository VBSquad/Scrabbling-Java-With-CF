/**
  Object lastKey() : method returns the last (highest) key currently in this sorted map.
 */
import java.util.*;

class TreeMapLastKey {
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
        
        // Displaying the lastKey of the map 
        System.out.println("The last key is " + tree_map.lastKey()); 
        
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
The last key is 2
*/
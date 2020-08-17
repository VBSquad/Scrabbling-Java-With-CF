/**
  Collection values() : method returns a collection view of the values contained in this map.
 */
import java.util.*;

class TreeMapValue {
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
        System.out.println("Initial Mappings are: " + tree_map); 
        
        // Using values() to get the set view of values 
        System.out.println("The collection is: " + tree_map.values());
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
The collection is: [Student, Code, In]
*/
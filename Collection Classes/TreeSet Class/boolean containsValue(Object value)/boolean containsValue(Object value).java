/**
  containsValue(Object value) : method is used to return true if this map, maps one or more keys to the specified value.
 */
import java.util.*;

class SetContainsValue {
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
        
        //containsValue used
        System.out.println("'In' exists: "+ tree_map.containsValue("In"));
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
'In' exists: true
*/
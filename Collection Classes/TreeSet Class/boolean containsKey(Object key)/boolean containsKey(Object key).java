/**
  boolean containsKey(Object key) : method returns true if some key equal to the key exists within the map, else return false.
 */
import java.util.*;

class SetContainsKey {
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
        System.out.println("'0' exists: "+ tree_map.containsKey(0));
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
'0' exists: true
*/
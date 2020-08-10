/**
  SortedMap subMap(Object fromKey, Object toKey) : method returns a view of the portion of this Map whose keys range from fromKey, inclusive, to toKey, exclusive.
 */
import java.util.*;

class TreeMapSubMap {
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
        
        // Returning the key ranging 
        // between 2 and 5 
        System.out.print( "Elements in range from 2 to 3 in the map is : "
                         + tree_map.subMap(2, 3)); 
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
Elements in range from 2 to 3 in the map is : {2=In}
*/
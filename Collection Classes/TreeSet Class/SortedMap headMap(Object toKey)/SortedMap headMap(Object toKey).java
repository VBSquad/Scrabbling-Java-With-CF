/**
  SortedMap headMap(Object toKey) : method returns a view of the portion of the map strictly less than the parameter key_value.
 */
import java.util.*;

class TreeMapHeadMap {
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
        
        // Creating the sorted map for map head 
        SortedMap < Integer, String > map_head = new 
                       TreeMap < Integer, String > (); 
        map_head = tree_map.headMap(20); 
  
        // Getting the map head 
        System.out.println( "The headmap is: " + map_head); 
 
        
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
The headmap is: {0=Student, 1=Code, 2=In}
*/
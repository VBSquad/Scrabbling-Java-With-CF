/**
  SortedMap tailMap(Object fromKey) : method returns a view of the portion of this Map whose keys are greater than or equal to fromKey.
 */
import java.util.*;

class TreeMapTailMap {
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
        
        // Returning the key greater 
        // than or equal to 2 
        System.out.print( "Last Key in the map is : " + tree_map.tailMap(2) ); 
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
Last Key in the map is : {2=In}
*/
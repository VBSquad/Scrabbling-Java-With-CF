/**
  void putAll(Map map) : method copies all of the mappings from the specified map to this map.
 */
import java.util.*;

class TreeMapPutall {
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
        
        // Creating a new tree map and copying 
        TreeMap< Integer , String > new_tree_map =  
                        new TreeMap< Integer , String >(); 
                        
        new_tree_map.put( 3 , "Hello" );
                        
        new_tree_map.putAll(tree_map); 
  
        // Displaying the final TreeMap 
        System.out.println("The new map looks like this: "
                                            + new_tree_map);
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
The new map looks like this: {0=Student, 1=Code, 2=In, 3=Hello}
*/
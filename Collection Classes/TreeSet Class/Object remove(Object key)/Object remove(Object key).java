/**
  Object remove(Object key) : method removes the mapping for this key from this TreeMap if present.
 */
import java.util.*;

class TreeMapRemove {
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
        
        // Verifying the returned value 
        System.out.println( "Returned value at postion 2 is : " + 
                                        tree_map.remove(2) ); 
  
        // Displayin the new map 
        System.out.println( "New map is: " + tree_map );
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
Returned value at postion 2 is : In
New map is: {0=Student, 1=Code}
*/
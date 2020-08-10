/**
  Object firstKey() : method returns the first (lowest) key currently in this sorted map.
 */
import java.util.*;

class TreeMapFirstKey {
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
        
        // use of firstEntry() 
        System.out.println("Lowest entry is: " + tree_map.firstEntry());
        
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
Lowest entry is: 0=Student
*/
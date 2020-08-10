/**
  Object get(Object key) : method returns the value to which this map maps the specified key.
 */
import java.util.*;

class TreeMapGet {
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
        
        // Getting the value of 2
        System.out.println( "The Value at 2 is: " + tree_map.get(2)); 
  
        // Getting the value of 1
        System.out.println( "The Value at 1 is: " + tree_map.get(1)); 
        
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {0=Student, 1=Code, 2=In}
The Value at 2 is: In
The Value at 1 is: Code
*/
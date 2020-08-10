/**
 Comparator comparator() : method return the comparator used to order the keys in this map, or null if this map uses the natural ordering of its keys.

 */
import java.util.*;

class TreeMapComparator {
   public static void main(String args[]) {
      
      Scanner sc = new Scanner( System.in );
      
      //size of TreeSet
      int n = sc.nextInt();
      
        // Creating an empty TreeMap 
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>( Collections.reverseOrder() ); 
  
        // Mapping string values to int keys
        for( int i = 0 ; i < n ; i++ ){
            
            tree_map.put( i , sc.next() );
        
        }
  
        // Displaying the TreeMap 
        System.out.println( "Initial Mappings are: " + tree_map); 
        
        try{
            // getting used Comparator in the map 
            // using comparator() method 
            Comparator comp = tree_map.comparator(); 
  
            // pritnig the comparator value 
            System.out.println("Comparator value: "
                               + comp); 
        } 
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
        
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: {2=In, 1=Code, 0=Student}
Comparator value: java.util.Collections$ReverseComparator@330bedb4
*/
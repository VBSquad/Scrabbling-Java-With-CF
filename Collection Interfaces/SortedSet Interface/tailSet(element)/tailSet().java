/**
*tailSet(element) : Returns a view of the map whose keys are strictly less than the toKey.
*/
import java.util.*; 

class SortedSetTailSet {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the Set
        int n = sc.nextInt();
        
        // Creating SortedSet 
        SortedSet set = new TreeSet();
  
        for( int i = 0 ; i < n ; i++ ){
                
            set.add( sc.nextFloat() );
                
        }
  
        // print 
        System.out.println( "SortedSet : " + set );
        
        // tailSet()
        System.out.println( "The elements are given as: " + set.tailSet(54.3f) );
        
        sc.close();
   }  
} 
/**
Input: 
5
32.1
33.9
54.3
56.0
89.9

Output:
SortedSet : [32.1, 33.9, 54.3, 56.0, 89.9]
The elements are given as: [54.3, 56.0, 89.9]
*/
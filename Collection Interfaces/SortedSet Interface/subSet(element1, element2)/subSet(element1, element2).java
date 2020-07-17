/**
*subSet(element1, element2) : Returns a key-value mapping which is associated with the greatest key which is less than or equal to the given key. Also, returns null if the map is empty.
*/
import java.util.*; 

class SortedSetSubSet {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the Set
        int n = sc.nextInt();
        
        // Creating SortedSet 
        SortedSet set = new TreeSet();
  
        for( int i = 0 ; i < n ; i++ ){
                
            set.add( sc.nextInt() );
                
        }
  
        // print 
        System.out.println( "SortedSet : " + set );
        
        // subSet()
        System.out.println( "The element are given as: " + set.subSet(11, 44) );
        
        sc.close();
   }  
} 
/**
Input: 
5
11
22
33
44
55

Output:
SortedSet : [11, 22, 33, 44, 55]
The element are given as: [11, 22, 33]
*/
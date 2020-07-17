/**
*Set<Map.Entry> entrySet() : Returns the Set view of the entire map.
*/
import java.util.*; 

class MapEntrySet {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the map
        int n = sc.nextInt();
        
        // Creating LinkedHashMap 
        LinkedHashMap<String,Integer> m =  
                new LinkedHashMap<String, Integer>(); 
  
        for( int i = 0 ; i < n ; i++ ){
                
            m.put( sc.next() , sc.nextInt() );
                
        }
            
        // Using entrySet() to get the entry's of the map 
        Set < Map.Entry < String,Integer > > s = m.entrySet();
  
        // print 
        System.out.println( "Map ");
        
        for (Map.Entry < String , Integer > it : s) 
        { 
            
            // Using the getKey to get key of the it element 
            System.out.println( it.getKey() + "   " +  it.getValue() ); 
              
        } 
        sc.close();
   }  
} 
/**
Input: 
5
a 1
b 2
c 3
d 4
e 5

Output:
Map 
a   1
b   2
c   3
d   4
e   5
*/
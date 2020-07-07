/**
*keySet() - Returns a set of all the keys present in a map.
*/
import java.util.*; 

class MapKeySet {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the map
        int n = sc.nextInt();
        
        // Creating LinkedHashMap 
        Map<String, Integer> s = new HashMap<>();
  
        for( int i = 0 ; i < n ; i++ ){
                
            s.put( sc.next() , sc.nextInt() );
                
        }
  
        // print 
        System.out.println( "Map : " + s );
        
        // Access keys of the map
        System.out.println( "Keys : " + s.keySet() );
        
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
Map : {a=1, b=2, c=3, d=4, e=5}
Keys : [a, b, c, d, e]
*/
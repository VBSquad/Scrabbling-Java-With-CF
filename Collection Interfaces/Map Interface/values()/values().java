/**
*values() :	This method is used to create a collection out of the values of the map. It basically returns a Collection view of the values in the HashMap.
*/
import java.util.*; 

class MapValues {  
    
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
        
        // Access values of the map
        System.out.println( "Values: " + s.values() );
        
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
Values: [1, 2, 3, 4, 5]

*/

/**
*getOrDefault(K, defaultValue) : method of Map interface, implemented by HashMap class is used to get the value mapped with specified key. If no value is mapped with the provided key then the default value is returned.
*/
import java.util.*; 

class MapGetOrDefault {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the map
        int n = sc.nextInt();
        
        // Creating HashMap 
        Map<String, Integer> s = new HashMap<>();
  
        for( int i = 0 ; i < n ; i++ ){
                
            s.put( sc.next() , sc.nextInt() );
                
        }
        
        //input of key and default
        String key = sc.next();
        
        int def = sc.nextInt();
  
        // print 
        System.out.println( "Map : " + s );
        
        System.out.println( "value at key " + key + " : " + s.getOrDefault( key , def) );
        
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
b 9

Map : {a=1, b=2, c=3, d=4, e=5}
value at key b : 2


Input: 
5
a 1
b 2
c 3
d 4
e 5
z 9

Output:
Map : {a=1, b=2, c=3, d=4, e=5}
value at key z : 9
*/
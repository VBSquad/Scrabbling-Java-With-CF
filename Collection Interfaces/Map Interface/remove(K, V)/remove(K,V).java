/**
*remove(K, V) : Removes the entry from the map that has key K associated with value V. It return true for successfull removal.
*/
import java.util.*; 

class MapRemoveKV {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the map
        int n = sc.nextInt();
        
        // Creating HashMap 
        Map<String, Integer> s = new HashMap<>();
  
        for( int i = 0 ; i < n ; i++ ){
                
            s.put( sc.next() , sc.nextInt() );
                
        }
        
        //input of key and value
        String key = sc.next();
        
        int value = sc.nextInt();
  
        // print 
        System.out.println( "Map : " + s );
        
        System.out.println( "Remove of " + key + " and its value " +  value + " ? : " + s.remove(key , value ) );
        
        System.out.println( "Final Map : " + s );
        
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
b 2

Output:
Map : {a=1, b=2, c=3, d=4, e=5}
Remove of b and its value 2 ? : true
Final Map : {a=1, c=3, d=4, e=5}

Input: 
5
a 1
b 2
c 3
d 4
e 5
c 2

Output:
Map : {a=1, b=2, c=3, d=4, e=5}
Remove of b and its value 2 ? : false
Final Map : {a=1, b=2, c=3, d=4, e=5}
*/
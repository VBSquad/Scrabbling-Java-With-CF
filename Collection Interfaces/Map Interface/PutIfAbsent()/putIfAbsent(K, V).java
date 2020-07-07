/**
*putIfAbsent(K, V) : It inserts the specified value with the specified key in the map only if it is not already specified.
*/
import java.util.*; 

class MapPutIfAbsent {  
    
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
        
        s.putIfAbsent( key , value );
        
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
f 6

Output: 
Map : {a=1, b=2, c=3, d=4, e=5}
Final Map : {a=1, b=2, c=3, d=4, e=5, f=6}


Input: 
5
a 1
b 2
c 3
d 4
e 5
a 6

Output:
Map : {a=1, b=2, c=3, d=4, e=5}
Final Map : {a=1, b=2, c=3, d=4, e=5}
*/
/**
*replace(K key, V oldValue, V newValue) : method of Map interface, implemented by HashMap class is used to replace the old value of the specified key only if the key is previously mapped with the specified old value.
*/
import java.util.*; 

class MapReplace {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the map
        int n = sc.nextInt();
        
        // Creating HashMap 
        Map<String, Integer> s = new HashMap<>();
  
        for( int i = 0 ; i < n ; i++ ){
                
            s.put( sc.next() , sc.nextInt() );
                
        }
        
        //input of key and value and new value
        String key = sc.next();
        
        int value = sc.nextInt();
        
        int newVal = sc.nextInt();
  
        // print 
        System.out.println( "Map : " + s );
        
        System.out.println( "Replace of " + key + " from value " +  value + " to " + newVal + " ? : " + s.replace(key , value , newVal ) );
        
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
b 2 7

Output:
Map : {a=1, b=2, c=3, d=4, e=5}
Replace of b from value 2 to 7 ? : true
Final Map : {a=1, b=7, c=3, d=4, e=5}

Input: 
5
a 1
b 2
c 3
d 4
e 5
c 2 7

Output:
Map : {a=1, b=2, c=3, d=4, e=5}
Replace of c from value 2 to 7 ? : false
Final Map : {a=1, b=2, c=3, d=4, e=5}
*/
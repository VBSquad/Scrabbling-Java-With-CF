/**
*containsValue() : method is used to check whether a particular value is being mapped by a single or more than one key in the Map. It takes the value as a parameter and returns True if that value is mapped by any of the key in the map.
*/
import java.util.*; 

class MapContainsValue {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the map
        int n = sc.nextInt();
        
        // Creating HashMap 
        Map<String, Integer> s = new HashMap<>();
  
        for( int i = 0 ; i < n ; i++ ){
                
            s.put( sc.next() , sc.nextInt() );
                
        }
        
        //input of value
        int value = sc.nextInt();
  
        // print 
        System.out.println( "Map : " + s );
        
        System.out.println( " Is  " + value + " present in the map ? : " + s.containsValue( value ) );
        
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
5

Output:
Map : {a=1, b=2, c=3, d=4, e=5}
Is  5 present in the map ? : true


Input: 
5
a 1
b 2
c 3
d 4
e 5
6

Output:
Map : {a=1, b=2, c=3, d=4, e=5}
Is  6 present in the map ? : false
*/
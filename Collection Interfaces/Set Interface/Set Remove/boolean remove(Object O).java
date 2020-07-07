/**
*Set remove(): method is used to remove a particular element from a Set.
*/
import java.util.*; 

class SetRemove {  
    
   public static void main( String[] args ) { 
       
       Scanner sc = new Scanner( System.in );
       
       //n is the size of arrayList
	    int n = sc.nextInt();
	    
        // Declare an empty set of size n
        Set < String > set = new HashSet< >( ) ;
  
        // Add elements to the set 
        for(int i = 0 ; i < n ; i++ ){
            
            set.add( sc.next() );
        }
        
        // print set 
        System.out.println("Set : " + set); 
        
        
        // Removing elements using remove() method 
        set.remove( "Tutorial" ) ;  
        set.remove( "Welcome" ) ; 
  
        // Displaying the Set after removal 
        System.out.println("Set after removing elements: " + set); 
        
        
	    sc.close();
   }  
} 
/**
Input: 
6
Welcome to Set Interface Tutorial

Output:
Set : [Tutorial, Set, Welcome, to, Interface]
Set after removing elements: [Set, to, Interface]
*/
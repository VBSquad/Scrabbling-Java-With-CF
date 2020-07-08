/**
*first() :	Returns the first element from the current set.
*/
import java.util.*; 

class SortedSetFirst {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of the Set
        int n = sc.nextInt();
        
        // Creating SortedSet 
        SortedSet set = new TreeSet();
  
        for( int i = 0 ; i < n ; i++ ){
                
            set.add( sc.next() );
                
        }
  
        // print 
        System.out.println( "SortedSet : " + set );
        
        // first()
        System.out.println( "First element : " + set.first() );
        
        sc.close();
   }  
} 
/**
Input: 
5
a b c d e

Output:
SortedSet : [a, b, c, d, e]
First element : a
*/
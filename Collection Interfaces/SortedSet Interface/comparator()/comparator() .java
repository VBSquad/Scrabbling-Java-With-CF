/**
*comparator() :	Returns the comparator which is used to order the elements in the given set. Also returns null if the given set uses the natural ordering of the element.
*/
import java.util.*; 

class SortedSetComaparator {  
    
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
        
        // Comparator
        System.out.println( "Comparator : " + set.comparator() );
        
        sc.close();
   }  
} 
/**
Input: 
5
a b c d e

Output:
SortedSet : [a, b, c, d, e]
Comparator : null
*/
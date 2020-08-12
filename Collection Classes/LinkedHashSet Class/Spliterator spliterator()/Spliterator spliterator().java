/**
 Spliterator spliterator() :  method of Java LinkedHashSet class makes a late-binding and fail-fast Spliterator across the elements of this set.

 */
import java.util.*;

class LinkedHashSetSpliterator {
    static int i=1;  
    public static void main(String args[]) {
      
      Scanner sc = new Scanner( System.in );
      
      //size of LinkedHashSet
      int nn = sc.nextInt();
      
        LinkedHashSet hs = new LinkedHashSet();  
  
        // Mapping string values to int keys
        for( int i = 0 ; i < nn ; i++ ){
            
            hs.add( sc.next() );
        
        }
  
        // Displaying the LinkedHashSet 
        System.out.println( "Initial Mappings are: " + hs); 
        
        Spliterator<String> str = hs.spliterator();  
  
        // if element exists tryAdvance() will perform action  
        
        while(
            str.tryAdvance( (n)->
            System.out.println( i++ + " Alphabet - " + n ) ) );
        
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial Mappings are: [Student, Code, Input]
1 Alphabet - Student
2 Alphabet - Code
3 Alphabet - Input
*/
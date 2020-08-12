/**
 boolean removeAll(Collection c) :  method remove from this set all of its elements that are contained in the specified collection.

 */
import java.util.*;

class LinkedHashSetRemoveAll {
    
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
        System.out.println( "Initial List are: " + hs); 
        
        try{
            // Creating another object of  LinkedHashSet<Integer> 
            LinkedHashSet set2 = new LinkedHashSet(); 
            
            set2.add("Student"); 
  
            // print set2 
            System.out.println( "Collection Elements" + " to be removed : "
                               + set2 ); 
  
            // Removing elements from set 
            // specified in set2 
            // using removeAll() method 
            hs.removeAll( set2 ); 
  
            // print set1 
            System.out.println("LinkedHashSet after "
                               + "removeAll() operation : "
                               + hs);
        }
        catch( Exception e){
            System.out.println( "Exception Occured : " + e );
        }
   }    
}
/**
Input:
3
Student Code Input

Output:
Initial List are: [Student, Code, Input]
Collection Elements to be removed : [Student]
LinkedHashSet after removeAll() operation : [Code, Input]
*/
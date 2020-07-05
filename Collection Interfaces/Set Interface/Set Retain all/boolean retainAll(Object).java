/**
*The retainAll() : method of java.util.Set interface is used to retain from this set all of its elements that are contained in the specified collection.
*/
import java.util.*; 

class SetRetainAll {  
    
   public static void main( String[] args ) {  
       
            Scanner sc = new Scanner( System.in ) ;
        
            // Size of the list
            int n = sc.nextInt();
        
            // Creating object of SortedSet 
            Set < Integer > set1 = new HashSet < Integer >(); 
  
            for( int i = 0 ; i < n ; i++ ){
                
                set1.add( sc.nextInt() );
                
            }
  
            // print set1 
            System.out.println(  "Set before " + "retainAll() operation : "
                + set1); 
            
            //Size of 2nd set    
            int m = sc.nextInt();
            
            // Creating another object of Set 
            Set < Integer > set2 = new HashSet < Integer >(); 
            
            for( int i = 0 ; i < m ; i++ ){
                
                set2.add( sc.nextInt() );
                
            }
  
            // print set2 
            System.out.println( "Collection Elements " + "to be retained in set 1 : "
                + set2); 
  
            // Removing elements from set other than 
            // elements specified in set2 
            // using retainAll() method 
            set1.retainAll( set2 ); 
  
            // print set1 
            System.out.println( 
                "Set after "
                + "removeAll() operation : "
                + set1); 
                
                sc.close();
   }  
} 
/**
Input: 
5
1 2 3 4 5
3 
1 2 3

Output:
Set before retainAll() operation : [1, 2, 3, 4, 5]
Collection Elements to be retained in set 1 : [1, 2, 3]
Set after removeAll() operation : [1, 2, 3]
*/
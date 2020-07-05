/**
*The removeAll() : method of SortedSet interface is used to remove from this SortedSet all of its elements that are contained in the specified collection
*/
import java.util.*; 

class SetRemoveAll {  
    
   public static void main( String[] args ) {  
       
            Scanner sc = new Scanner( System.in ) ;
        
            // Size of the list
            int n = sc.nextInt();
        
            // Creating object of SortedSet 
            SortedSet < Integer > set1 = new TreeSet < Integer >(); 
  
            for( int i = 0 ; i < n ; i++ ){
                
                set1.add( sc.nextInt() );
                
            }
  
            // print set1 
            System.out.println(  "Set before " + "removeAll() operation : "
                + set1); 
            
            //Size of 2nd set    
            int m = sc.nextInt();
            
            // Creating another object of Set 
            SortedSet < Integer > set2 = new TreeSet < Integer >(); 
            
            for( int i = 0 ; i < m ; i++ ){
                
                set2.add( sc.nextInt() );
                
            }
  
            // print set2 
            System.out.println( "Collection Elements " + "to be removed : "
                + set2); 
  
            // Removing elemnts from set 
            // specified in set2 
            // using removeAll() method 
            set1.removeAll( set2 ); 
  
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
Set before removeAll() operation : [1, 2, 3, 4, 5]
Collection Elements to be removed : [1, 2, 3]
Set after removeAll() operation : [4, 5]
*/
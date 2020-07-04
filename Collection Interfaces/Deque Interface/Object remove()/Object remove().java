/**
*Object remove(): It is used to retrieves and removes the head of this deque.
*/
import java.util.*; 

class ArrayDequeRemove {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of Dequeue
        int n = sc.nextInt();
       
        //Creating Deque and adding elements  
        Deque < String > deque = new ArrayDeque < String > () ; 
        
        // Enter element in the deque
        
        for( int i = 0 ; i < n ; i++ ){
            
            deque.add( sc.next() ) ;
            
        }
        
        //Traversing elements  
        
        System.out.println( "Initial deque : " );
        
        for (String str : deque) { 
       
            System.out.println(str);  
   
        } 
        
        // remove head
        String removed_head = deque.remove() ;
   
        //Traversing elements  
        
        System.out.println( "Element removed from head :  " + removed_head );
        
        System.out.println( "Final deque : " );
        
        for (String str : deque) { 
       
            System.out.println(str);  
   
        }  
   }  
} 
/**
Input: 
3
student
code
in

Output:
Initial deque : 
student
code
in
Element removed from head :  student
Final deque : 
code
in
*/
/**
*Object poll(): It is used to retrieves and removes the head of this deque, or returns null if this deque is empty.
*/
import java.util.*; 

class ArrayDequePoll {  
    
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
        
        String removed_head  = " null ";
        
        // remove head
        if( deque.size() > 0 ){
            
            removed_head = deque.poll() ;
            
        }
            
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
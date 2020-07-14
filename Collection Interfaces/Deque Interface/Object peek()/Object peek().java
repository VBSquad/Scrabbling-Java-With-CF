/**
Object peek(): It is used to retrieves, but does not remove, the head of this deque, or returns null if this deque is empty.
*/
import java.util.*; 

class ArrayDequePeek {  
    
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
        
        String head  = deque.peek();
    
            
        //Traversing elements  
        
        System.out.println( "Element at the head :  " + head );
        
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
Element at the head :  student
Final deque : 
student
code
in

*/
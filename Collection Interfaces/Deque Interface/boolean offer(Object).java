/**
*boolean offer(Object) : It is used to insert the specified element into this deque.
*/
import java.util.*; 

class ArrayDequeAdd {  
    
   public static void main( String[] args ) {  
       
        Scanner sc = new Scanner( System.in ) ;
        
        // Size of Dequeue
        int n = sc.nextInt();
       
        //Creating Deque and adding elements  
        Deque < String > deque = new ArrayDeque < String > () ; 
        
        // Enter element in the deque
        
        for( int i = 0 ; i < n ; i++ ){
            
            deque.offer( sc.next() ) ;
            
        }
   
        //Traversing elements  
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
student
code
in
*/
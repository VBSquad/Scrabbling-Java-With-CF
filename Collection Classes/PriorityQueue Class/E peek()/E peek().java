/**
  Element peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueuePeek { 
    
   public static void main(String args[]) { 
       
       Scanner sc = new Scanner( System.in );
       
       //size of PriorityQueue
       int n = sc.nextInt();
       
        // Creating empty priority queue 
        PriorityQueue<String> pq = new PriorityQueue<String>(); 
      
  
       //input n elemets in PriorityQueue 
       for(int i = 0 ; i < n ; i++ ){
           
           pq.add( sc.next() );
           
       }
       
        // Displaying the PriorityQueue 
        System.out.println( "The PriorityQueue : " +  pq ); 
        
        String s = pq.peek();
        
        // Displaying the peek() 
        System.out.println( "The Element from peek() : " +  s ); 
  
   } 
} 

/**
Input:
3
Student Code In

The PriorityQueue : [Code, Student, In]
The Element from peek() : Code
*/
/**
  Element poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueuePoll { 
    
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
        
        String s = pq.poll();
        
        System.out.println( "Element removed from poll() : " + s );
        
        // Displaying the peek() 
        System.out.println( "The PriorityQueue after poll() : " +  pq ); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The PriorityQueue : [Code, Student, In]
Element removed from poll() : Code
The PriorityQueue after poll() : [In, Student]
*/
/**
  boolean offer(E e) : method is used to insert a particular element into the Priority Queue. It acts similar to the add() method of Priority Queue.
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueueOffer { 
    
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
        
        pq.offer("OpenSoruce");
        
        // Displaying the PriorityQueue 
        System.out.println( "The Final PriorityQueue : " +  pq ); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The PriorityQueue : [Code, Student, In]
The Final PriorityQueue : [Code, OpenSoruce, In, Student]
*/
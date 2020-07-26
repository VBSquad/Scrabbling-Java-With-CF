/**
  void clear(): This method is used to remove all of the contents of the priority queue.
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueueClear { 
    
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
        
        pq.clear();
        
        // Displaying the PriorityQueue 
        System.out.println( "The PriorityQueue after Clear() : " +  pq ); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The PriorityQueue : [Code, Student, In]
The PriorityQueue after Clear() : []
*/
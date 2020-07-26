/**
  boolean remove(Object o): TThis method removes a single instance of the specified element from this queue, if it is present
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueueRemove { 
    
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
        
        System.out.println( "Remove 'In' from PriorityQueue : " + pq.remove("In") );
        
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
Remove 'In' from PriorityQueue : true
The Final PriorityQueue : [Code, Student]
*/
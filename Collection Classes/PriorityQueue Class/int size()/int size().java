/**
  int size(): The method is used to return the number of elements present in the set.
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueueSize { 
    
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
        
        System.out.println( "Size of PriorityQueue using size() : " + pq.size() );
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The PriorityQueue : [Code, Student, In]
Size of PriorityQueue using size() : 3
*/
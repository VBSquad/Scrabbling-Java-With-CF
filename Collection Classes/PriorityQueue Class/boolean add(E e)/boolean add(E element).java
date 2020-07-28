/**
  boolean add(E element): This method inserts the specified element into this priority queue. Returned array is that of the specified array.
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueueAdd { 
    
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
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The PriorityQueue : [Code, Student, In]
*/

/**
  Iterator iterator()  : method is used to return an iterator of the same elements as the Priority Queue. The elements are returned in random order from what present in the Queue.
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueueIterator { 
    
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
       
        // Creating an iterator 
        Iterator value = pq.iterator(); 
  
        // Displaying the values after iterating through the queue 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The iterator values are: 
Code
Student
In
*/
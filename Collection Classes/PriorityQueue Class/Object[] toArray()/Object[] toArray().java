/**
  Object[] toArray() : method in Java is used to form an array of the same elements as that of the Priority Queue. Basically, it copies all the element from a priority queue to a new array.
 */
 
import java.io.*; 
import java.util.*;
  
class PriorityQueuetoArray { 
    
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
       
        // Creating the array and using toArray() 
        Object[] arr = pq.toArray(); 
  
        System.out.println("The array is:"); 
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The array is:
Code
Student
In
*/
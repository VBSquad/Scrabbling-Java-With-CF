/**
  T[] toArray(T[] a) : method in Java is used to form an array of the same elements as that of the Priority Queue. Basically, it copies all the element from a priority queue to a new array. It creates multiple arrays, unlike the previous method without parameters. This method copies all of the elements into the arr[].
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
       
        // Displaying the PriorityQueue 
        System.out.println("The PriorityQueue: " + pq); 
  
        // Creating the array and using toArray() 
        String[] arr = pq.toArray(new String[n]); 
          
        // Displaying arr 
        System.out.println("The arr[] is:"); 
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The PriorityQueue: [Code, Student, In]
The arr[] is:
Code
Student
In
*/
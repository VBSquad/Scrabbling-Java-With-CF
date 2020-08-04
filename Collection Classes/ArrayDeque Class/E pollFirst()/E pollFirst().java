/**
 E pollFirst() :method in Java is used to retrieve or fetch and remove the first element of the Deque. 
*/
 
import java.io.*; 
import java.util.*;
  
class ArrayDequePollfirst { 
    
   public static void main(String args[]) { 
       
       Scanner sc = new Scanner( System.in );
       
       //size of deque
       int n = sc.nextInt();
       
       // Intializing an deque 
        Deque<String> d = new ArrayDeque<>();
      
  
       //input n elemets in Deque 
       for(int i = 0 ; i < n ; i++ ){
           
           d.push( sc.next() );
           
       }
  
      // Output of the present Deque
      System.out.println( "The Deque is : " + d ); 
      
      //pollLast element
      System.out.println( "First Element poped : " + d.pollFirst() );
      
      System.out.println( "Final Deque : " + d );
      
   } 
} 

/**
Input:
3
Student Code In

Output:
The Deque is : [In, Code, Student]
First Element poped : In
Final Deque : [Code, Student]
 */
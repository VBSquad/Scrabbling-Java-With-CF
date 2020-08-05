/**
  E poll() : method returns head element and also removes it .
*/
 
import java.io.*; 
import java.util.*;
  
class ArrayDequePoll { 
    
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
      System.out.println( "Element poll : " + d.poll() );
      
      System.out.println( "Final Deque : " + d );
      
   } 
} 

/**
Input:
3
Student Code In

Output:
The Deque is : [In, Code, Student]
Element poll : In
Final Deque : [Code, Student]
 */
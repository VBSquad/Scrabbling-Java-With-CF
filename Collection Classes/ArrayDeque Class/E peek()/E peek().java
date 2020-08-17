/**
  E peek() : method returns head element without removing it.
*/
 
import java.io.*; 
import java.util.*;
  
class ArrayDequePeek { 
    
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
      System.out.println( "Element Peek in Deque : " + d.peek() );
     
      
   } 
} 

/**
Input:
3
Student Code In

Output:
The Deque is : [In, Code, Student]
Element Peek in Deque : In
 */
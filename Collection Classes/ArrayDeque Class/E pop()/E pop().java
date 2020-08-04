/**
  E pop() : method in Java is used to pop an element from the deque. The element is popped from the top of the deque and is removed from the same.
*/
 
import java.io.*; 
import java.util.*;
  
class ArrayDequePop { 
    
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
      
      //pop element
      d.pop();
      
      System.out.println( "Final Deque : " + d );
      
   } 
} 

/**
Input:
3
Student Code In

Output:
The Deque is : [In, Code, Student]
Final Deque : [Code, Student]
 */
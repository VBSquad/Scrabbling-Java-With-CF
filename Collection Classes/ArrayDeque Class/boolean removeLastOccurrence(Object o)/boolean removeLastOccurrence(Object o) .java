/**
  boolean removeLastOccurrence(Object o)  : method removes the last occurrence of the specified element in this deque.
*/
 
import java.io.*; 
import java.util.*;
  
class ArrayDequeremoveLastOccurrence { 
    
   public static void main(String args[]) { 
       
       Scanner sc = new Scanner( System.in );
       
       //size of deque
       int n = sc.nextInt();
       
       // Intializing an deque 
        Deque<String> d = new ArrayDeque<>();
      
  
       //input n elemets in Deque 
       for(int i = 0 ; i < n ; i++ ){
           
           d.add( sc.next() );
           
       }
  
      // Output of the present Deque
      System.out.println( "The Deque is : " + d ); 
      
      // this will remove last occurrence of element Student
      d.removeLastOccurrence("Student");
      
      //Size of Deque
      System.out.println( "Final Deque : " + d );
   } 
} 

/**
Input:
3
Student Code In

Output:
The Deque is : [Student, Code, In]
Final Deque : [Code, In]
 */
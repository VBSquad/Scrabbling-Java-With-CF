/**
  E remove() : method is used to remove the element present at the head of the Deque.
*/
 
import java.io.*; 
import java.util.*;
  
class ArrayDequeRemoveObject { 
    
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
      
      //Remove object
      System.out.println( "Object removed : " + d.remove() );
      
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
Object removed : Student
Final Deque : [Code, In]
 */
/**
  boolean remove(Object o) : method remove object from the deque and return true if object is present else return false
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
      System.out.println( "Object removed 'Student' : " + d.remove("Student") );
      
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
Object removed 'Student' : true
Final Deque : [Code, In]
 */
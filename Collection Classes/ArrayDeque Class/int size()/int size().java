/**
  int size() : returns the no. of elements in deque
*/
 
import java.io.*; 
import java.util.*;
  
class ArrayDequeSize { 
    
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
      
      //Size of Deque
      System.out.println( "Size of Deque : " + d.size() );
   } 
} 

/**
Input:
3
Student Code In

Output:
The Deque is : [Student, Code, In]
Size of Deque : 3
 */
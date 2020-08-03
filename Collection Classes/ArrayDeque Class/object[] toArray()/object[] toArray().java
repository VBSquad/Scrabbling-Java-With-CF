/**
  object[] toArray() : returns array having the elements of deque.
*/
 
import java.io.*; 
import java.util.*;
  
class ArrayDequeToArray { 
    
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
      
        //toArray() method : 
        Object[] arr = d.toArray(); 
        System.out.println( "Array Size : " + arr.length); 
  
        System.out.print( "Array elements : "); 
        for(int i=0; i<arr.length ; i++) 
            System.out.print(" " + arr[i]); 
      
   } 
} 

/**
Input:
3
Student Code In

Output:
The Deque is : [Student, Code, In]
Array Size : 3
Array elements :  Student Code In
 */
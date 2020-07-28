/**
  Object get() method is used to fetch or retrieve an element at a specific index from a LinkedList.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListGet { 
    
   public static void main(String args[]) { 
       
       Scanner sc = new Scanner( System.in );
       
       //size of Linked List
       int n = sc.nextInt();
       
      // creating an empty LinkedList 
      LinkedList list = new LinkedList(); 
      
  
       //input n elemets in linked list 
       for(int i = 0 ; i < n ; i++ ){
           
           list.add( sc.next() );
           
       }
  
      // Output the present list 
      System.out.println( "The list is:" + list ); 
  
      // Fetching the specific element from the list 
      System.out.println("The element is: " + list.get(2));
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
The element is: In
 */
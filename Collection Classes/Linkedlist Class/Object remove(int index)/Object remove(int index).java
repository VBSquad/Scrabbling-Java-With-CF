/**
  Object remove(int index) :  method is used to remove an element from a linked list from a specific position or index.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListRemove { 
    
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
      
      // Remove the head using remove() 
        list.remove( 2 ); 
  
      // Print the final list 
      System.out.println( "Final LinkedList : " + list );
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
Final LinkedList : [Student, Code]
 */
/**
  boolean add(Object element) : This method appends the specified element to the end of this list.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListAddElement { 
    
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
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
 */
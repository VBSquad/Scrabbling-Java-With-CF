/**
  Object .clone() method is used to create a shallow copy of the mentioned linked list. It just creates a copy of the list.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListClone { 
    
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
  
      // Creating another linked list and copying 
        LinkedList sec_list = new LinkedList(); 
        sec_list = (LinkedList) list.clone(); 
  
      // printing the new list 
      System.out.println( "The new List is:" + sec_list ); 
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
The new List is:[Student, Code, In]
 */
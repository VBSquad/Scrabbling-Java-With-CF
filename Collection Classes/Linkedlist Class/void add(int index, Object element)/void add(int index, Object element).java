/**
  void add(int index, Object element): This method inserts an element at a specified index in the list. It shifts the element currently at that position (if any) and any subsequent elements to the right (will add one to their indices).
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListAdd { 
    
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
  
      // Adding new elements to the end 
      list.add( 0 , "First" ); 
      list.add( n + 1 , "Last" ); 
  
      // printing the new list 
      System.out.println( "The new List is:" + list ); 
   } 
} 

/**
Input:
2
Hello World

Output:
The list is:[Hello, World]
The new List is:[First, Hello, World, Last]
 */
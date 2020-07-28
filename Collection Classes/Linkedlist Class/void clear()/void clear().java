/**
  void clear() : method is used to remove all the elements from a linked list. Using the clear() method only clears all the element from the list and not deletes the list. In other words we can say that the clear() method is used to only empty an existing LinkedList.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListClear { 
    
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
  
      list.clear();
  
      // printing the new list 
      System.out.println( "The new List after clearing is:" + list ); 
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
The new List is:[]
 */

/**
  void addLast() : method in Java is used to insert a specific element at the end of a LinkedList.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListAddLast { 
    
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
  
      // Adding new elements at the end 
        list.addLast("Last"); 
        list.addLast("At"); 
  
      // printing the new list 
      System.out.println( "The new List is:" + list ); 
   } 
} 

/**
Input:
3
student

Output:
The list is:[Student, Code, In]
The new List is:[Student, Code, In, Last, At]
 */
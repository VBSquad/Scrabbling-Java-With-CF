/**
  Object getFirst() : method is used to fetch or retrieve the first element from a LinkedList or the element present at the head of the List.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListGetFirst { 
    
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
      
      // Fetching first element from the list 
      System.out.println("The first element is: " + list.getFirst()); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
The first element is: Student
 */
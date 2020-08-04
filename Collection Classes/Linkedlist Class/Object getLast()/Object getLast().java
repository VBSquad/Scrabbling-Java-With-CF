/**
  Object getLast() : method is used to fetch or retrieve the last element from a LinkedList or the element present at the head of the List.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListGetLast { 
    
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
      System.out.println("The last element is: " + list.getLast()); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
The first element is: In
 */

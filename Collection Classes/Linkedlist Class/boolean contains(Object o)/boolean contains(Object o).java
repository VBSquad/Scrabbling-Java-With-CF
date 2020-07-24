/**
  boolean contains() : method is used to check whether an element is present in a LinkedList or not. It takes the element as a parameter and returns True if the element is present in the list.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListContains { 
    
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
  
      // Check if the list contains "Student" 
      System.out.println( "Does the List contains 'Student': "                          + list.contains("Student"));
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
Does the List contains 'Student': true
 */
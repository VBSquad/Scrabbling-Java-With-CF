/**
  Object set() method is used to replace any particular element in the linked list created using the LinkedList class with another element. This can be done by specifying the position of the element to be replaced and the new element in the parameter of the set() method.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListSet { 
    
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
       
       //Print the LinkedList class
       System.out.println( "List : " + list );
  
        // Using set() method 
        System.out.println("The Object that is replaced is: " + list.set(2, "Out"));
        
       //Print the LinkedList class
       System.out.println( "The new List : " + list );
   } 
} 

/**
Input:
3
Student Code In

Output:
List : [Student, Code, In]
The Object that is replaced is: In
The new List : [Student, Code, Out]
 */
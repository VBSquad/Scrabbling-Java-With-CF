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
      
      //Taking input for what user wants to check
      System.out.println("Enter what you want to check -");
      
      String p = sc.next();

      // Check if the list contains "Student" 
      System.out.println( "Does the List contains '" + p + "':"                          + list.contains(p));

   } 
} 


/**
Input:
4
I lost my keys
Enter what you want to check -
lost
Output:
The list is:[I, lost, my, keys]
Does the List contains 'lost':true
*/ 

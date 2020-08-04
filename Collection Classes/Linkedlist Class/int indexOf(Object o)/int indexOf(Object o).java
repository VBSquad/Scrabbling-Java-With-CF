/**
  int indexOf(Object o) : method is used to check and find the occurrence of a particular element in the list. If the element is present then the index of the first occurrence of the element is returned otherwise -1 is returned if the list does not contain the element.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListIndexOf { 
    
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
      
      // The first position of an element  
      System.out.println( "The first occurrence of Codes is at index : " 
                                              + list.indexOf("Codes") );  
  
   } 
} 

/**
Input:
3
Student Codes In

Output:
The list is:[Student, Codes, In]
The first occurrence of Codes is at index : 1
 */

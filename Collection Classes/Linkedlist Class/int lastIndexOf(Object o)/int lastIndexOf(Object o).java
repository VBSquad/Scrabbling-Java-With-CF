/**
  int lastIndexOf(Object o) :  method is used to check and find the occurrence of a particular element in the list. If the element is present in the list then the lastIndexOf() method returns the index of last occurrence of the element otherwise it returns -1. This method is used to find the last occurrence of a particular element in a LinkedList.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListLastIndexOf { 
    
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
      System.out.println( "The last occurrence of 'Codes' is at index : " 
                                              + list.lastIndexOf("Codes") );  
  
   } 
} 

/**
Input:
4
Student Codes In Codes

Output:
The list is:[Student, Codes, In, Codes]
The last occurrence of 'Codes' is at index : 3
 */

/**
  listIterator listIterator() : method is used to return a list-iterator containing the same elements as that of the LinkedList in proper and same sequence starti
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListIterator { 
    
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
  
      // Setting the ListIterator at a specified position 
        ListIterator list_Iter = list.listIterator(0); 
  
        // Iterating through the created list from the position 
        System.out.println("The list is as follows:"); 
        while(list_Iter.hasNext()){ 
           System.out.println(list_Iter.next()); 
        } 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is as follows:
Student
Code
In
 */
/**
  Object[] toArray() method returns an array containing all the elements in the list in proper sequence i.e. from first to last. The returned array will be safe as a new array is created (hence new memory is allocated). Thus the caller is free to modify the array. It acts as a bridge between array-based and collection-based APIs.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListToArray { 
    
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
       Object[] a = list.toArray(); 
        System.out.println("Returned Array: " + Arrays.toString(a) ); 
   } 
} 

/**
Input:
3
Student Code In

Output:
Returned Array: [Student, Code, In]
 */
/**
  boolean addAll(int index, Collection c) : This method, the index is the position where we have to start inserting the Collection elements and Collection is the list of elements whether Collection is of ArrayList, LinkedList type, etc.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListAddallElement { 
    
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
       
       // A collection is created 
      Collection<String> collect = new ArrayList<String>(); 
      collect.add("A"); 
      collect.add("Open"); 
      collect.add("Source"); 
      collect.add("for"); 
      collect.add("Geeks");
  
      // Output the present list 
      System.out.println( "The list is:" + list ); 
  
      list.addAll( 0 , collect );
  
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
The new List is:[A, Open, Source, for, Geeks, Student, Code, In]
 */
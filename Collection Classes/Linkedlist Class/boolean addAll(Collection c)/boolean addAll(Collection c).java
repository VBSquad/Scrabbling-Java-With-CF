/**
  boolean addAll(Collection C) : This method is used to append all of the elements from the collection passed as parameter to this function to the end of a list keeping in mind the order of return by the collections iterator.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListAddall { 
    
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
  
      list.addAll(collect);
  
      // printing the new list 
      System.out.println( "The new List is:" + list ); 
   } 
} 

/**
Input:
3
Student Code In

Output:
The list is:[Student, Code, In]
The new List is:[Student, Code, In, A, Open, Source, for, Geeks]
 */
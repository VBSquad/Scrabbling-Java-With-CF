/**
  boolean isEmpty() :  method is used to check if a HashSet is empty or not. It returns True if the HashSet is empty otherwise it returns False.
 */
 
import java.io.*; 
import java.util.*;
  
class HashSetIsEmpty { 
    
   public static void main(String args[]) { 
       
       Scanner sc = new Scanner( System.in );
       
       //size of HashSet
       int n = sc.nextInt();
       
       // Creating an empty HashSet 
       HashSet<String> set = new HashSet<>(); 
      
  
       //input n elemets in HashSet 
       for(int i = 0 ; i < n ; i++ ){
           
           set.add( sc.next() );
           
       }
  
      // Output of the present set 
      System.out.println( "The Set is:" + set ); 
      
      // Check for the empty set 
      System.out.println("Is the set empty: " + set.isEmpty()); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The Set is:[In, Student, Code]
Is the set empty: false
 */
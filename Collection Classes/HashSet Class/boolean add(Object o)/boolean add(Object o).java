/**
  boolean add(Object o) : method in Java HashSet is used to add a specific element into a HashSet. This method will add the element only if the specified element is not present in the HashSet else the function will return False if the element is already present in the HashSet.
 */
 
import java.io.*; 
import java.util.*;
  
class HashSetAdd { 
    
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
      System.out.println( "The Set is : " + set ); 
      
   } 
} 

/**
Input:
3
Student Code In

Output:
The Set is:[In, Student, Code]
 */
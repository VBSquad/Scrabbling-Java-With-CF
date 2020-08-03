/**
  void clear() :  method is used to remove all the elements from a HashSet. Using the clear() method only clears all the element from the set and not deletes the set. In other words, we can say that the clear() method is used to only empty an existing HashSet.
 */
 
import java.io.*; 
import java.util.*;
  
class HashSetClear { 
    
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
      
      set.clear();
  
      // Displaying the new Set after Cloning; 
      System.out.println("The Final set after clear : " + set);  
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The Set is:[In, Student, Code]
The Final set after clear : []
 */
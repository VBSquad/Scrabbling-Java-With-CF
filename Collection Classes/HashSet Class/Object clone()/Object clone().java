/**
  Object clone() :    method is used to return a shallow copy of the mentioned hash set. It just creates a copy of the set.
 */
 
import java.io.*; 
import java.util.*;
  
class HashSetClone { 
    
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
      
      // Creating a new cloned set 
        HashSet cloned_set = new HashSet(); 
  
        // Cloning the set using clone() method 
        cloned_set = (HashSet)set.clone(); 
  
        // Displaying the new Set after Cloning; 
        System.out.println("The new set: " + cloned_set);  
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The Set is:[In, Student, Code]
The new set: [Student, In, Code]
 */
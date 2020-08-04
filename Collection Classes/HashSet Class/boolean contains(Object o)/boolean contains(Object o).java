/**
  boolean contains(Object o) :   method is used to check whether a specific element is present in the HashSet or not. So basically it is used to check if a Set contains any particular element.
 */
 
import java.io.*; 
import java.util.*;
  
class HashSetContain { 
    
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
      
      // Check for "Geeks" in the set 
        System.out.println("Does the Set contains 'Student'? " + set.contains("Student")); 
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The Set is:[In, Student, Code]
Does the Set contains 'Student'? true
 */
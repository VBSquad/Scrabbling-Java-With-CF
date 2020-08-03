/**
  boolean remove(Object o) :  method is used to remove a particular element from a HashSet.
 */
 
import java.io.*; 
import java.util.*;
  
class HashSetRemove { 
    
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
      
      //remove element
      System.out.println( "'Student' removed : " + set.remove("Student") );
    
      // Print the size of set
      System.out.println( "Final set : " + set );
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The Set is:[In, Student, Code]
'Student' removed : true
Final set : [In, Code]

 */
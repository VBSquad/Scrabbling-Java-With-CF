/**
  int size() : method is used to get the size of the HashSet or the number of elements present in the HashSet.
 */
 
import java.io.*; 
import java.util.*;
  
class HashSetSize { 
    
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
    
      // Print the size of set
      System.out.println( "The size of set : " + set.size() );
  
   } 
} 

/**
Input:
3
Student Code In

Output:
The Set is:[In, Student, Code]
The size of set : 3
 */
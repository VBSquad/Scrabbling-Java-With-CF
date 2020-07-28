/**
  Object[] toArray(Object[] a) : It returns an array containing all of the elements in this LinkedList in the correct order; the run-time type of the returned array is that of the specified array.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListToArrayObject { 
    
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
       
       // Displaying the LinkedList 
        System.out.println( "The LinkedList: " +  list ); 
  
        // Creating the array and using toArray() 
        String[] arr = new String[ 3 ]; 
        arr =( String[] ) list.toArray( new String[0] ); 
  
        // Displaying arr 
        System.out.println( "Returned Array: " + Arrays.toString( arr ) ); 
   } 
} 

/**
Input:
3
Student Code In

Output:
The LinkedList: [Student, Code, In]
Returned Array: [Student, Code, In]
*/
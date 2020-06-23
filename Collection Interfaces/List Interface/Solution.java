/*
E remove(int index): The method of List interface in Java is used to remove an element from the specified index from a List container and returns the element after removing it.
It also shifts the elements after the removed element by 1 position to the left in the List.
*/

import java.util.*;

public class Solution {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner();
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        List < Integer > list = new ArrayList < Integer > (); 
  
        // Add elements to the list 
        for(int i = 0 ; i < n ; i++ ){
            list.add( sc.nextInt() );
        }
  
        // Index from which you want to remove element 
        int index = 2 ; 
  
        // Initial list 
        System.out.println( " Initial List : " + list ); 
  
        // remove element 
        list.remove( index ) ; 
  
        // Final list 
        System.out.println( " Final List : " + list ); 
        
	sc.close();
    }
}

/*

Sample Test Case

Input :
5
1 2 3 4 5

Output :
Initial List : [ 1 , 2 , 3 , 4 , 5 ]
Final List : [ 1 , 2 , 4 , 5 ]

*/

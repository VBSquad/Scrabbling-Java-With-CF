/*
E remove(int index) method is used to remove an element from the specified index from an ArrayList and returns the element after removing it.
It also shifts the successive elements of the removed element by 1 position to the left in the ArrayList.
*/

import java.util.*;

public class remove {
	
    //main code
    public static void main ( String [ ] args )
    {
	    Scanner sc = new Scanner ( System.in );
	    
	    //n is the size of arrayList
	    int n = sc.nextInt ();
	    
        // Declaring an empty ArrayList 
        List < Integer > list = new ArrayList < Integer > (); 
  
        // Adding elements to the list 
        for ( int i = 0 ; i < n ; i++ ) {
            list.add ( sc.nextInt () );
        }

        //Displaying the Initial Arraylist 
        System.out.println ( "Initial List : " + list ); 
  
        // Index from which you want to remove element 
        int index = sc.nextInt () ; 
  
        // remove element 
        System.out.println ( "Removing element: " + list.remove( index ) ); 
  
        //Displaying the Final list 
        System.out.println ( "Final List : " + list ); 
        
	    sc.close ();
    }
}

/*
Sample Test Case

Input :
5
1 2 3 4 5
2

Output :
Initial List : [1, 2, 3, 4, 5]
Removing element: 3
Final List : [1, 2, 4, 5]

*/


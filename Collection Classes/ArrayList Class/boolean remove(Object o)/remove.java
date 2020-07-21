/*
*boolean remove(Object o) method removes the first occurrence of the specified element o from the Arraylist. 
It returns true if the element is removed successfully from the Arraylist, else false.
*/
import java.util.*;

public class remove {

    //main code
    public static void main ( String [ ] args )
    {
	    Scanner sc = new Scanner( System.in );
	    
	    //n is the size of arrayList
	    int n = sc.nextInt();
	    
        // Declaring an empty ArrayList 
        List < String > list = new ArrayList < String > (); 
  
        // Adding elements to the list 
        for( int i = 0 ; i < n ; i++){
            list.add ( sc.next ( ) );  
        }
  
        //Displaying the Initial list 
        System.out.println( " Initial List : " + list ); 
  
        // o is the object to be removed from the list
        String o = sc.next ();
        
        list.remove( o ); 
        
        System.out.println( " Final List after removing " + o + " : " + list );
        
	sc.close();
	
    }
}

/*

Sample TestCase:

Input: 
4
a b c d
b

Output: 
Initial List : [a, b, c, d]
Final List after removing b : [a, c, d]

*/


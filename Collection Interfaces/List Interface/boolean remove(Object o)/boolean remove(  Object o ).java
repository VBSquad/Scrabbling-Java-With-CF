/*
*boolean remove(Object o) – removes the first occurrence of the specified element from the list. Returns true is any element was removed from the list, else false.
*/
import java.util.*;

class ListBooleanRemove {

    //main code
    public static void main ( String [ ] args )
    {
	Scanner sc = new Scanner( System.in );
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        List < String > list = new ArrayList < String > (); 
  
        // Add elements to the list in which one element may be 5
        for(int i = 0 ; i < n ; i++){
            list.add( sc.next( ) );
        }

        //Enter the element which need to be removed from the list
        String x = sc.nextLine();
        x=sc.next();
  
        // Initial list 
        System.out.println( " Initial List : " + list ); 
  
        // remove( Object o ) used 
        boolean rem=list.remove(x);
        
        System.out.println( " List contains "+ x + " : " + rem ); 
        
        System.out.println( " Final List : " + list );
        
	sc.close();
	
    }
}

/*
Sample TestCase:

Input: 
5
1 2 3 4 5
4

Output: 

Initial List : [1, 2, 3, 4, 5]
List contains 4 : true
Final List : [1, 2, 3, 5]
 
Input : 
5
1 2 3 4 5
6

Output: 

Initial List : [1, 2, 3, 4, 5]
List contains 6 : false
Final List : [1, 2, 3, 4, 5]

*/
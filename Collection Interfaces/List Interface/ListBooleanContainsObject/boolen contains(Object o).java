/*
list.contains( Object o ) : This java function return true if the object ( elements ) is present in the list 
   Else it returns false
   
*/

import java.util.*;

class ListBooleanContainsObject {

    //main code
    public static void main ( String [ ] args )
    {
	Scanner sc = new Scanner( System.in );
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        List < Integer > list = new ArrayList < Integer > (); 
  
        // Add elements to the list in which one element may be 5
        for(int i = 0 ; i < n ; i++){
            list.add( sc.nextInt( ) );
        }

        //Enter the element which need to be searched in the list
        int x = sc.nextInt();
  
        // Initial list 
        System.out.println( " Initial List : " + list ); 
  
        // contains( Object o ) used 
        System.out.println( " List contains "+ x + " : " + list.contains(x) ); 
        
	sc.close();
    }
}

/*
Sample TestCase:

Input: 
5
1 2 3 4 5
6

Output: 

 Initial List : [1, 2, 3, 4, 5]
 List contains 6 : false
 
Input : 
5
1 2 3 4 5
5

Output: 
 Initial List : [1, 2, 3, 4, 5]
 List contains 5 : true


*/
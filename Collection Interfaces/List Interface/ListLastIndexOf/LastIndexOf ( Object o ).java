/*
LastIndexOf(Object o) : This java method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
Parameters: This function has a single parameter, i.e, the element to be searched in the list.
Object is example integer value for int
*/

import java.util.*;

class ListLastIndexOf {

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

        //Enter the element whose last index is to find in list
        int x = sc.nextInt();
  
        // Initial list 
        System.out.println( " Initial List : " + list ); 
  
        // LastIndexOf(Object o) used 
        System.out.println( " Last Index of "+ x + " in list : " + list.lastIndexOf(x) ); 
        
	sc.close();
    }
}

/*
Sample TestCase:

Input: 
5
1 2 3 2 5
2

Output: 

Initial List : [1, 2, 3, 4, 5]
Last Index of 2 in list : 3

Input: 
5
1 2 3 2 5
6

Output: 

Initial List : [1, 2, 3, 4, 5]
LastIndex of 2 in list : -1

*/
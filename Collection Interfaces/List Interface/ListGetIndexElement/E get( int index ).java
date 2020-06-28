/*
E get(int index) : This java method returns the element at the given index.
It gives out of bound exception for invalid index
*/

import java.util.*;

class ListGetIndexElement {

    //main code
    public static void main ( String [ ] args )
    {
	Scanner sc = new Scanner( System.in );
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        List < Integer > list = new ArrayList < Integer > (); 
  
        // Add elements to the list 
        for(int i = 0 ; i < n ; i++){
            list.add( sc.nextInt( ) );
        }

        //Enter the index of the element you wanna get from the list
        int index = sc.nextInt();
  
        // Initial list 
        System.out.println( " Initial List : " + list );
        
        //check the validity of the index provided by the user
        if( index < list.size()  && index >= 0 ){
            
            // E get( int index ) used 
            System.out.println( " Element at index "+ index + " in list : " + list.get(index) ); 
            
        }
        else {
            
            //Out of Bound Error
            System.out.println(" Out of bound index given ");
        }
        
        
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
 Element at index 4 in list : 5

Input: 

5
1 2 3 4 5
5

Output: 

 Initial List : [1, 2, 3, 4, 5]
 Out of bound index given 
 
Input: 
 
5
1 2 3 4 5
-1

Output: 

 Initial List : [1, 2, 3, 4, 5]
 Out of bound index given 

*/
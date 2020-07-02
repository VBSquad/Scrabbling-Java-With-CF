/*
Queue element() : method in Java is used to retrieves, but does not remove, the head of this queue.
*/

import java.util.*;

class QueueElement {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc = new Scanner( System.in ) ;
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        Queue < Integer > queue = new LinkedList < Integer >() ;
  
        // Add elements to the list 
        for( int i = 0 ; i < n ; i++ ){
            queue.add( sc.nextInt() );
        }
  
        // print queue 
        System.out.println( " Queue : " + queue ) ; 
  
        // print head element
        System.out.println( " Queue's head : " + queue.element() ) ; 
        
	sc.close();
    }
}

/*

Sample Test Case

Input :
5
1 2 3 4 5

Output :
Queue: [1, 2, 3, 4, 5]
Queue's head: 1
*/

/*
Object remove() :java method of Queue Interface returns and removes the element at the front the container. It deletes the head of the container. The method throws an NoSuchElementException when the Queue is empty.
*/

import java.util.*;

class QueueRemove {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner( System.in ) ;
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        Queue < Integer > queue = new LinkedList < Integer > ();
  
        // Add elements to the list 
        for ( int i = 0 ; i < n ; i++ ){
            queue.add( sc.nextInt() );
        }
  
        // print queue 
        System.out.println( " Queue : " + queue ) ; 
  
        // print head 
        System.out.println( " Queue's head : " + queue.remove() ) ; 
        
        // print queue 
        System.out.println( " Final Queue : " + queue ); 
        
        
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
Final Queue: [2, 3, 4, 5]
*/

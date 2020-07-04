/*
Object poll() : It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
*/

import java.util.*;

class QueuePoll {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner( System.in ) ;
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        Queue < Integer > queue = new LinkedList < Integer >();
  
        // Add elements to the list 
        for(int i = 0 ; i < n ; i++ ){
            queue.add( sc.nextInt() );
        }
  
        // print queue 
        System.out.println( " Queue : " + queue ) ; 
  
        // print head 
        System.out.println( " Queue's head : " + queue.poll() ) ; 
        
        // print queue 
        System.out.println( " Final Queue : " + queue ) ; 
        
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

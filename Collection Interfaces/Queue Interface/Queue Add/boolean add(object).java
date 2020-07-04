/*
boolean add() : method of Queue Interface inserts the element passed in the parameter to the end of the queue if there is space. If the Queue is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.
*/

import java.util.*;

class QueueAdd{
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner( System.in );
	    
	//n is the size Queue
	int n = sc.nextInt();
	    
        // Declare an empty Queue of size n
        Queue < Integer > queue = new LinkedList < Integer > ();
  
        // Add elements to the queue
        for(int i = 0 ; i < n ; i++ ){
            queue.add( sc.nextInt() );
        }
        
        // print queue 
        System.out.println( " Queue : " + queue ); 
        
        
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
*/

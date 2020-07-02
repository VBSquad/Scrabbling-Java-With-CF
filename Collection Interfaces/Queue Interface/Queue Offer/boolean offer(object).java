/*
boolean offer() :java method of Queue Interface inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
*/

import java.util.*;

class QueueOffer {
	
    //main code
    public static void main ( String[ ] args )
    {
	    
        // Declare an empty List of size n
        Queue < Integer > Q = new LinkedList < Integer >()  ;
  
        if ( Q.offer( 10 ) )  
            System.out.println( " The Queue is not full "
                               + " and 10 is inserted " ) ; 
        else
            System.out.println( " The Queue is full " ) ; 
  
        if ( Q.offer( 15 ) )  
            System.out.println( " The Queue is not full "
                               + " and 15 is inserted " ) ; 
        else
            System.out.println( " The Queue is full " ) ;  
  
        if ( Q.offer( 25 ) ) 
            System.out.println( " The Queue is not full "
                               + " and 25 is inserted " ) ; 
        else
            System.out.println( " The Queue is full " ) ; 
  
        if ( Q.offer( 20 ) ) 
            System.out.println( " The Queue is not full "
                               + " and 20 is inserted " ) ; 
        else
            System.out.println( " The Queue is full " ) ; 
  
        // before removing print Queue 
        System.out.println( " Queue : " + Q ) ;
        
    }
}

/*

Sample Test Case

Output :
The Queue is not full and 10 is inserted
The Queue is not full and 15 is inserted
The Queue is not full and 25 is inserted
The Queue is not full and 20 is inserted
Queue: [10, 15, 25, 20]
*/

import java.util.*; 

public class isEmptyFunc { 
	public static void main ( String [ ] args ) 
	{ 
                // creating an Empty Integer List
		List < Integer > arr = new ArrayList < Integer > ( 15 ) ; 
                
                // check if the list is empty or not 
               // using isEmpty ( ) fucntion
		boolean answer = arr.isEmpty ( ) ;  
		if ( answer == true ) 
			System.out.println ( "The List is empty" ) ; 
		else
			System.out.println ( "The List is not empty" ) ;


                // addition of a element to 
               // the List
		arr.add ( 16 ) ; 


                // check if the list is empty or not 
               // after adding an element 
		answer = arr.isEmpty ( ) ; 
		if (answer == true) 
			System.out.println ( "The List is empty" ) ; 
		else
			System.out.println ( "The List is not empty" ) ; 
	} 
} 


/*  Output - 
The List is empty
The List is not empty */

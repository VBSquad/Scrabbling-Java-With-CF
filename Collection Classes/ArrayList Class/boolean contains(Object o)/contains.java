/*
contains( Object o ) method returns true if the object o is present in the Arraylist otherwise false.
*/

import java.util.*;

public class contains {
    public static void main ( String [ ] args )
    {

	    Scanner sc = new Scanner ( System.in );
	    
	    //n is the size of arrayList
	    int n = sc.nextInt();
	    
        //creating an empty arraylist 
        ArrayList < Integer > list = new ArrayList < Integer > (); 
  
        //Adding elements to the Arraylist
        for ( int i = 0 ; i < n ; i++){
            list.add ( sc.nextInt( ) );
        }

        //displaying the arraylist
        System.out.println( "ArrayList : " + list ); 

        //o is the object which needs to be searched in the list
        int o = sc.nextInt ();
  
        //
        System.out.println( "Does ArrayList contain " + o + " ? " + list.contains ( o ) ); 
        
	    sc.close();
    }
}

/*
Sample TestCase

Input: 
5
5 9 1 2 8
2

Output: 
ArrayList : [5, 9, 1, 2, 8]
Does ArrayList contain 2 ? true
 
*/


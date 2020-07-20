/*
 boolean containsAll(Collection c) : Returns true if this vector contains all of the elements in the specified Collection.

*/

import java.util.*;

class VectorContainsAll {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner ( System.in );
	    
	//n is the size of vector
	int n = sc.nextInt();
	    
        // Declare an empty vector
         Vector<String> vc = new Vector<>(); 
         
         Vector<String> vc1 = new Vector<>(); 
         
        // Add elements to the vector 
        for(int i = 0 ; i < n ; i++ ){
            
            vc.add( i , sc.next() );
            
        }
        
        vc1.add( 0 , "student" );
        
        System.out.println( "containsAll() : " + vc.containsAll(vc1) );
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
student code in open source

Output:
containsAll() : true
*/

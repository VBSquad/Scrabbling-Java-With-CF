/*
 remove(int index) : method is used to remove an element from a Vector from a specific position or index.
*/

import java.util.*;

class VectorRemove {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner ( System.in );
	    
	//n is the size of vector
	int n = sc.nextInt();
	    
        // Declare an empty vector
         Vector<String> vc = new Vector<>(); 
         
        // Add elements to the vector 
        for(int i = 0 ; i < n ; i++ ){
            
            vc.add( i , sc.next() );
            
        }
        
        System.out.println( " Vector : " + vc );
        
        // checking last element of vector 
        System.out.println( "Vector after removal of element at index 1 : " + vc.remove( 1 )); 
        
        System.out.println( vc );
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
6
student code in open source in

Output:
Vector : [student, code, in, open, source, in]
Vector after removal of element at index 1 : code
[student, in, open, source, in]
*/

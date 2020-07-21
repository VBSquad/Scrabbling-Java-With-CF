/*
 boolean remove(Object o) : method is used to remove any particular element from the Vector.
*/

import java.util.*;

class VectorRemoveBoolean {
	
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
        System.out.println( "Vector after removal of 'student' : " + vc.remove( "student" )); 
        
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
Vector after removal of 'student' : true
[code, in, open, source, in]
*/

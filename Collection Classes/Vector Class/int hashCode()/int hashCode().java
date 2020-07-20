/*
 int hashCode(): This method returns the hash code value for this Vector.

*/

import java.util.*;

class VectorHashCode {
	
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
        
        System.out.println( " Vector : " + vc );
        
        // checking hash code 
        System.out.println( "Hash code: " + vc.hashCode() ); 
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
student code in open source

Output:
Vector : [student, code, in, open, source]
Hash code: -1760159933
*/

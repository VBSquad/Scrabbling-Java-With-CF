/*
 Object clone() This method returns a clone of this vector.

*/

import java.util.*;

class VectorClone {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner ( System.in );
	    
	//n is the size of vector
	int n = sc.nextInt();
	    
        // Declare an empty vector
         Vector<String> vc = new Vector<>(); 
         
         Vector<String> v_clone = new Vector<>();
  
        // Add elements to the vector 
        for(int i = 0 ; i < n ; i++ ){
            
            vc.add( i , sc.next() );
        }
        
        // print vector 
        System.out.println( "Vector : " + vc );
        
        v_clone = (Vector)vc.clone(); 
         
        System.out.println( "Vector after clone() : " + v_clone );
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
student code in open source

Output :
Vector : [student, code, in, open, source]
Vector after clone() : [student, code, in, open, source]
*/

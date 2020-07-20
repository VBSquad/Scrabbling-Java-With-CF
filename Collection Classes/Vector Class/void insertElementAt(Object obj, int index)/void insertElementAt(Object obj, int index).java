/*
 insertElementAt(E obj,int index) method is used to insert the specified object as a component in this vector at the specified index.

*/

import java.util.*;

class VectorInsertElementAt {
	
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
        
        vc.insertElementAt( "hi" , 0 );
        
        System.out.println( " Vector after insertElementAt : " + vc );
        
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
 Vector after insertElementAt : [hi, student, code, in, open, source]
*/

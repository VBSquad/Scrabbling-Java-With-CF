/*
 void copyInto(Object[ ] anArray) : This method copies the components of this vector into the specified array.

*/

import java.util.*;

class VectorCopyInto {
	
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
        
        // print vector 
        System.out.println( "Vector : " + vc );
        
        String[] arr = new String[n]; 
  
        // copy componnent of vector int array arr 
        vc.copyInto(arr); 
        
        System.out.println( "Array after copyInto() : " + Arrays.toString(arr) );
        
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
Array after copyInto() : [student, code, in, open, source]
*/

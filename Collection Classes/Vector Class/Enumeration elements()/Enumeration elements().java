/*
 Enumeration elements() : method to get the Enumeration of specified Vector

*/

import java.util.*;

class VectorElements {
	
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
        
        // Get Enumeration of Vector elements 
        Enumeration en = vc.elements();
 
        /* Display Vector elements using hashMoreElements()
        * and nextElement() methods. 
        */
        System.out.println("Vector elements are: ");
        
        while( en.hasMoreElements() )
            System.out.println( en.nextElement() );
        
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
student code in open source

Output:
Vector elements are: 
student
code
in
open
source
*/

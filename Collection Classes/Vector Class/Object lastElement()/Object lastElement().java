/*
 Object lastElement(): This method returns the last component of the vector

*/

import java.util.*;

class VectorlastElement {
	
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
        System.out.println( "Vector's last componenets: " + vc.lastElement()); 
        
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
Vector's last componenets: source
*/

/*
 firstElement() : method in Java is used to retrieve or fetch the first element of the Vector. It returns the element present at the 0th index of the vector

*/

import java.util.*;

class VectorFirstElement {
	
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
        System.out.println( "Vector 1 : " + vc );
        
        // Displaying the first element 
        System.out.println( "The first element is: " + vc.firstElement() );  
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
student code in open source

Output :
Vector 1 : [student, code, in, open, source]
The first element is: student
*/

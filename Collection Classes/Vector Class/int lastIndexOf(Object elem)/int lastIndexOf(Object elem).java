/*
 lastIndexOf(Object element) : method is used to check and find the occurrence of a particular element in the vector. If the element is present in the vector then the lastIndexOf() method returns the index of last occurrence of the element otherwise it returns -1. 

*/

import java.util.*;

class VectorlastIndexOf {
	
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
        System.out.println( "Vector's last Index of 'in' : " + vc.lastIndexOf( "in" )); 
        
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
Vector's last Index of 'in' : 5

*/

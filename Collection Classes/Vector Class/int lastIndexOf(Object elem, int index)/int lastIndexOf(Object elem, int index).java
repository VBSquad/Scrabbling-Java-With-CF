/*
 int lastIndexOf(Object o, int index) : This method returns the index of the last occurrence of the specified element in this vector, searching backwards from index, or returns -1 if the element is not found.

*/

import java.util.*;

class VectorlastIndexOfOE {
	
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
        System.out.println( "Vector's last Index of 'in' from index 4 : " + vc.lastIndexOf( "in" ,4 )); 
        
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
Vector's last Index of 'in' from index 4 : 2

*/

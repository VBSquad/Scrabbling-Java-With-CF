/*
 int indexOf(Object elem, int index): This method returns the index of the first occurrence of 
 the specified element in this vector, or -1 if this vector does not contain the element after the given index position.

*/

import java.util.*;

class VectorIndexOf {
	
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
        
        // get the element at index of in after 3 postion 
        System.out.println(" index of 'in' after index 3 is: " + vc.indexOf("in" , 3) );
        
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
 index of 'in' after index 3 is: 5
*/

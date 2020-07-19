/*
 boolean contains(Object o): This method returns true if this vector contains the specified element.

*/

import java.util.*;

class VectorContain {
	
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
        
        // check whether vector contains "student" 
        if ( vc.contains( "student" ) ) 
            System.out.println( " student exists " ); 
        
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
student exists 
*/

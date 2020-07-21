/*
 boolean equals(Object o): This method compares the specified Object with this Vector for equality.

*/

import java.util.*;

class VectorEquals {
	
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
            
            String s = sc.next();
            
            vc.add( i , s );
            
        }
        
        // Add elements to the vector 
        for(int i = 0 ; i < n ; i++ ){
            
            String s = sc.next();
            
            vc1.add( i , s );
            
        }
        
        // print vector 
        System.out.println( "Vector 1 : " + vc );
        
        System.out.println( "Vector 2 : " + vc );
        
        if (vc.equals(vc1)) {
            System.out.println( "both vectors are equal" );
        }
        else{
            System.out.println( "both vectors are not equal" );
        }    
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
student code in open source
student code in open source

Output :
Vector 1 : [student, code, in, open, source]
Vector 2 : [student, code, in, open, source]
both vectors are equal
*/

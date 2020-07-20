/*
 boolean isEmpty(): This method tests if this vector has no components.

*/

import java.util.*;

class VectorisEmpty {
	
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
        
        // check whether vector is empty or not 
        if (vc.isEmpty()) 
            System.out.println("Vector is clear");
        else{
            System.out.println( "Vector not Clear ");
        }
        
        vc.clear();
            
        // check whether vector is empty or not 
        
        System.out.println( "Vector cleared " + vc);
        if (vc.isEmpty()) 
            System.out.println("Vector is clear"); 
        else{
            System.out.println( "Vector not Clear ");
        }    
        
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
Vector not Clear 
Vector cleared []
Vector is clear
*/

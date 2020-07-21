/*
 boolean removeAll(Collection c) : method Removes from this vector all of its elements that are contained in the specified Collection.
*/

import java.util.*;

class VectorRemoveCollection {
	
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
            
            vc1.add( i , s );
            
        }
        
        System.out.println( " Vector : " + vc );
        
        // checking last element of vector 
        System.out.println( "Vector after removal of another Vector containing Same elements : " + vc.removeAll( vc1 )); 
        
        System.out.println( vc );
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
6
student code in open source in

Output:
Vector : [student, code, in, open, source]
Vector after removal of another Vector containing Same elements : true
[]
*/

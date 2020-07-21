/*
 void addElement(Object obj) : method is used to add the specified component to the end of this vector and increasing its size by one.
 The capacity of this vector is increased if its size becomes greater than its capacity.
*/

import java.util.*;

class VectorAddElement {
	
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
        
        vc.addElement("A"); 
        vc.addElement("Computer"); 
        vc.addElement("Portal"); 
        vc.addElement("for"); 
        vc.addElement("Geeks"); 
        
        System.out.println( "Vector After addElement() : " + vc ); 
        
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
Vector After addElement() : [student, code, in, open, source, A, Computer, Portal, for, Geeks]
*/

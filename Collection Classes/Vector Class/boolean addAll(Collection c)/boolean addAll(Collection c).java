/*
 boolean addAll(Collection C): This method is used to append all of the elements from the collection passed as a parameter to this function to the end of a vector keeping in mind the order of return by the collection’s iterator.
*/

import java.util.*;

class VectorAddAll {
	
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
        
        Collection<String> c = new ArrayList<String>(); 
        c.add("A"); 
        c.add("Computer"); 
        c.add("Portal"); 
        c.add("for"); 
        c.add("Geeks"); 
        
        vc.addAll(c);
        
        System.out.println( "Vector After addAll() : " + vc ); 
        
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
Vector After addAll() : [student, code, in, open, source, A, Computer, Portal, for, Geeks]
*/

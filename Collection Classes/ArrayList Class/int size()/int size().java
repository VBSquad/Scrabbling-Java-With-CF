/*
 int size() : method in java to get the length of the array list .
*/

import java.util.*;

class ArrayListSize {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner ( System.in );
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty list of size n
        ArrayList< Integer > list = new ArrayList< Integer >();
  
        // Add elements to the list 
        for(int i = 0 ; i < n ; i++ ){
            
            list.add( sc.nextInt() );
        }
        
        // print list 
        System.out.println( "List : " + list ); 
        
        //print size
        System.out.println(" Size : " + list.size() );
        
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
1 2 3 4 5

Output :
List : [1, 2, 3, 4, 5]
Size : 5
*/

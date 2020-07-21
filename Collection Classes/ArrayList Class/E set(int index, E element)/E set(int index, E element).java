/*
 E set(int index, E element) : method in java to updata the index with the element .
*/

import java.util.*;

class ArrayListSet {
	
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
        
	// input index and element
        int index , element ;
        index = sc.nextInt();
        element = sc.nextInt();
     
        // Change the element of the array list
        list.set( index , element );
        System.out.println( "Modified ArrayList : " + list);
        
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
1 2 3 4 5
2 6

Output :
List : [1, 2, 3, 4, 5]
Modified ArrayList : [1, 2, 6, 4, 5]
*/

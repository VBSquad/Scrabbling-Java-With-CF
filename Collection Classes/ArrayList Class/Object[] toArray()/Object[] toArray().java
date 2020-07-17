/*
 toArray() : method is used to get an array which contains all the elements in ArrayList object in proper sequence (from first to last element).
*/

import java.util.*;

class ArrayListObject {
	
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
        
        // Create an array from the ArrayList
        Object[] obj = list.toArray();

        // Display the contents of the array
        System.out.println("Printing elements from first to last:"); 
        for (Object value : obj) {
            System.out.println( value );
        }
        
        
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
Printing elements from first to last:
1
2
3
4
5
*/

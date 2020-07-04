/*
Element set(int index, E ele) : method in Java is used to replace the specified element at the given index in the current list.
This function return the replaced element from the list
*/

import java.util.*;

class ListSetIndexElement {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner(System.in);
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        List < Integer > list = new ArrayList < Integer > (); 
  
        // Add elements to the list 
        for(int i = 0 ; i < n ; i++ ){
            list.add( sc.nextInt() );
        }
  
        // Index at which you want to set element 
        int index = sc.nextInt() ; 
        
        // Element you want to add at that index
        int element = sc.nextInt() ;
  
        // Initial list 
        System.out.println( " Initial List : " + list ); 
        
        //replaced element from the list
        int i = -1 ;
        
        try{
            
            // add element to the given index
            i = list.set( index , element ) ; 
        
        }
        catch ( Exception e ){
            
            System.out.println( " Error " + e );
            
        }
        
        finally{
  
            // Final list 
            System.out.println( " Final List : " + list );
            
            //check if element was replaced or not
            if( i != -1 ){
            
                System.out.println( " Element replaced from  the list : " + i );
            
            }
        
        }
        
	sc.close();
    }
}

/*

Sample Test Case

Input :
5
1 2 3 4 5
2
5

Output :
 Initial List : [1, 2, 3, 4, 5]
 Final List : [1, 2, 5, 4, 5]
 Element replaced from  the list : 3
 
 Input:
 5
 1 2 4 5 6
 6
 5

 Output:
 Initial List : [1, 2, 3, 4, 5]
 Error java.lang.IndexOutOfBoundsException: Index: 6, Size: 5
 Final List : [1, 2, 3, 4, 5]
*/

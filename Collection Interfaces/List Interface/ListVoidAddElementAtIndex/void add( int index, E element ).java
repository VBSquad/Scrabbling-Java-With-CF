/*
void add(int index, E element) : method in Java is used to insert the specified element at the given index in the current list.
This function don't return any value
*/

import java.util.*;

class ListVoidAddElementAtIndex {
	
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
  
        // Index at which you want to add element 
        int index = sc.nextInt() ; 
        
        // Elemt you want to add at that index
        int element = sc.nextInt() ;
  
        // Initial list 
        System.out.println( " Initial List : " + list ); 
  
        try{
            
            // add element to the given index
            list.add( index , element ) ; 
        
        }
        catch ( Exception e ){
            
            System.out.println( " Error " + e );
            
        }
        
        finally{
  
            // Final list 
            System.out.println( " Final List : " + list );
        
        }
        
	sc.close();
    }
}

/*

Sample Test Case

Input :
5
1 2 4 5 6
2
3

Output :
 Initial List : [1, 2, 4, 5, 6]
 Final List : [1, 2, 3, 4, 5, 6]
 
 Input:
 5
 1 2 4 5 6
 6
 3

 Output:
 Initial List : [1, 2, 4, 5, 6]
 Error java.lang.IndexOutOfBoundsException: Index: 6, Size: 5
 Final List : [1, 2, 4, 5, 6]
 
 Input: 
*/

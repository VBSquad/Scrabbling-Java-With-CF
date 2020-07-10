/**
*descendingIterator() : method of NavigableSet interface in Java is used to return an iterator over the elements in this set, in descending order. This iterator can be then used to iterate over the elements of the set.
*/

import java.util.*;

class NavigableSetHilgher {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner(System.in);
	    
	//n is the size of set
	int n = sc.nextInt();
	    
        // Declare an empty set of size n
        NavigableSet<Integer> set = new TreeSet<>();
  
        // Add elements to the set 
        for(int i = 0 ; i < n ; i++ ){
            
            set.add( sc.nextInt() );
        }
        
        Iterator<Integer> itr = set.descendingIterator(); 
        
        System.out.println( "Descending Value: " );
  
        // Iterate over the elements using itr 
        while (itr.hasNext()) { 
            
            System.out.print(  itr.next() + " " ) ; 
            
        } 
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
3 2 5 4 1

Output :
Descending Value: 
5 4 3 2 1 
*/

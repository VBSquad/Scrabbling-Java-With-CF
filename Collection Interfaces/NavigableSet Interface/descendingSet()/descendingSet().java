/**
*descendingSet() : method of NavigableSet interface in Java is used to return a reverse order view of the elements contained in this set. The descending set is backed by this set, so any changes to the set are reflected in the descending set, and vice-versa. If any of the set is modified while an iteration over other set is in progress, the results of the iteration are undefined.
*/

import java.util.*;

class NavigableSetDescendingSet {
	
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
        
        NavigableSet new_ns = set.descendingSet(); 
  
        Iterator itr = new_ns.iterator(); 
  
        // Iterate over the elements using itr 
        
        System.out.println( "DescendingSet Value: " );
        
        while (itr.hasNext()) { 
            
            System.out.print( itr.next() +  " " ); 
            
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
DescendingSet Value: 
5 4 3 2 1 
*/

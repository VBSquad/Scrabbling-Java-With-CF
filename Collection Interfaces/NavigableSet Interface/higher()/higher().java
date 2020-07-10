/**
*Higher(E e) : Returns the least element in this set which is greater than the given element or NULL if there is no such element.
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
        
        // print set 
        System.out.println( "Set : " + set ) ;
        
        //Higher
        System.out.println( "higher( 3 ) : " + set.higher(3) ) ;
        
	sc.close();
	
    }
}

/*

Sample Test Case

Input :
5
3 2 5 4 1

Output :
Set : [1, 2, 3, 4, 5]
higher( 3 ) : 4
*/

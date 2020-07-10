/**
*pollLast() : Retrieve and remove the last highest element. Or return null if there is no such element.
*/

import java.util.*;

class NavigableSetPollLast {
	
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
        System.out.println("Set : " + set);
        
        //pollLast
        System.out.println("pollLast(): " + set.pollLast());
        
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
pollLast(): 5
*/

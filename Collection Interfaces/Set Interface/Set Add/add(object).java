/*
 add() : Adds an object to the collection
*/

import java.util.*;

class SetAdd {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner(System.in);
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Declare an empty set of size n
        Set<Integer> set = new HashSet<Integer>();
  
        // Add elements to the set 
        for(int i = 0 ; i < n ; i++ ){
            
            set.add( sc.nextInt() );
        }
        
        // print set 
        System.out.println("Set : " + set); 
        
        
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

Input :
5
3 2 4 4 1

Output :
Set : [1, 2, 3, 4]
*/

/*
boolean addAll() : method is used to append all of the elements from the mentioned collection to the existing set. The elements are added randomly without following any specific order.
*/

import java.util.*;

class SetAddAll {
	
    //main code
    public static void main ( String[ ] args )
    {
	Scanner sc=new Scanner(System.in);
	    
	//n is the size of arrayList
	int n = sc.nextInt();
	    
        // Creating an empty Set 
        Set<String> st1 = new TreeSet<String>(); 
  
        // Use add() method to add elements into the Set 
        
        for( int i = 0 ; i < n ; i++ ){
            
            st1.add( sc.next() ) ;
            
        }
        
  
        // Displaying the Set 
        System.out.println("Set: " + st1); 
  
        // Creating another Set 
        Set<String> st2 = new TreeSet<String>(); 
  
        // Use add() method to add elements into the Set 
        st2.add("Hello"); 
        st2.add("World"); 
  
        // Using addAll() method to Append 
        st1.addAll(st2); 
  
        // Displaying the final Set 
        System.out.println("Set: " + st1);
        
        
	sc.close();
	
    }
}

/*
Sample Test Case

Input :
4
Welcome to VBSquad repo

Output :
Set: [VBSquad, Welcome, repo, to]
Set: [Hello, VBSquad, Welcome, World, repo, to]
*/

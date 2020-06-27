/*
    *list.equals( Object o ) : TThis method is used to compare two lists. It compares the lists as, both lists should have the same size, and all corresponding pairs of elements in the two lists are equal.
    *This method returns True if lists are equal else it returns false
*/

import java.util.*;

class ListBooleanEquals {

    //main code
    public static void main ( String [ ] args )
    {
	Scanner sc = new Scanner( System.in );
	    
	//n is the size of first arrayList
	int n = sc.nextInt();
	    
        // Declare an empty List of size n
        List < Integer > list1 = new ArrayList < Integer > (n); 
  
        // Add elements to the list 1
        for(int i = 0 ; i < n ; i++){
            list1.add( sc.nextInt( ) );
        }
  
  //m is the size of second arrayList
	int m = sc.nextInt();
	    
        // Declare an empty List of size m
        List < Integer > list2 = new ArrayList < Integer > (m); 
  
        // Add elements to the list 2
        for(int i = 0 ; i < m ; i++){
            list2.add( sc.nextInt( ) );
        }
        
        // Initial list 
        System.out.println( " Initial List 1 : " + list1 ); 
        System.out.println( " Initial List 2 : " + list2 ); 
  
        // equals( Object o ) used 
        System.out.println( " List 1 equals List 2 : " + list1.equals(list2) ); 
        
	sc.close();
    }
}

/*
Sample TestCase:

Input: 

5
1 2 3 4 5
5
1 2 3 4 5

Output: 

Initial List 1 : [1, 2, 3, 4, 5]
Initial List 2 : [1, 2, 3, 4, 5]
List 1 equals List 2 : true

 
Input : 

5
1 2 3 4 5
6
1 2 3 4 5 6

Output: 
 
Initial List 1 : [1, 2, 3, 4, 5]
Initial List 2 : [1, 2, 3, 4, 5, 6]
List 1 equals List 2 : false

Input: 

5
1 2 3 4 5
5
1 2 3 5 4

Output:

Initial List 1 : [1, 2, 3, 4, 5]
Initial List 2 : [1, 2, 3, 5, 4]
List 1 equals List 2 : false
 
*/
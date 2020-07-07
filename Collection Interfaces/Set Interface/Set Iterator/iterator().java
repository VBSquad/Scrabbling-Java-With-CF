/**
Set iterator():  method is used to return an iterator of the same elements as the set. The elements are returned in random order from what present in the set.
*/
import java.util.*; 

class SetIterator {  
    
   public static void main( String[] args ) {  
       
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
        
        // Creating an iterator 
        Iterator value = set.iterator(); 
  
        // Displaying the values after iterating through the iterator 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
        
        
    	sc.close();
    }  
} 
/**
Input: 
5
3 2 5 4 1

Output:
Set : [1, 2, 3, 4, 5]
The iterator values are: 
1
2
3
4
5
*/
/* The subList() method is used to get a portion of the list between the specified fromIndex, inclusive, and toIndex, exclusive. 
If fromIndex and toIndex are equal, the returned list is empty.*/

import java.util.*;
public class sublistfunc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of list1");
	    
	   //n is the size of arrayList
	   int n = sc.nextInt();
	    
        // Creating an empty integer list 
        List < Integer > list1 = new ArrayList < Integer > (); 

        System.out.println("Enter the elements of the list1");
  
        // Add elements to the list 
        for(int i = 0 ; i < n ; i++ ){
            list1.add( sc.nextInt() );
        }

        System.out.println("Enter the fromindex");
        int a = sc.nextInt();

        System.out.println("Enter the toindex");
        int b = sc.nextInt();

        List<Integer> list2 = list1.subList(a, b); 
        // print the subList 
        System.out.println("Sublist of list1: "
        + list2); 


    }
    
}

/* Sample test case:

Output : Enter the size of list1
Input  : 5
Output : Enter the elements of the list1
Input  : 1 2 3 4 5
Output : Enter the fromindex
Input  : 1
Output : Enter the toindex
Input  : 4
Output : Sublist of list1: [2, 3, 4]

*/
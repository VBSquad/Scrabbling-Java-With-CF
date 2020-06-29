/*
The clear() method of List interface in Java is used to remove all of the elements from the List container. 
This method does not delete the List container, instead it justs removes all of the elements from the List.
The return type of the function is void and it does not return anything.
*/


import java.util.*;
public class clearfunc {
    public static void main (String [ ] args) {
        Scanner sc = new Scanner(System.in);

        //n is the size of the arraylist
        int n = sc.nextInt();

        //Creating an empty integer list
        List < Integer > list = new ArrayList < Integer > (); 
  
        // Add elements to the list 
        for (int i = 0 ; i < n ; i++ ) {
            list.add( sc.nextInt() );
        }


        //Printing the initial list
        System.out.println( "Initial list: "+list );

        //clear method clears all the elements from the arraylist
        list.clear();

        //printing the final arraylist
        System.out.println( "Final list: "+list );

        sc.close();
    }   

}

/*
Sample Test Case

Input:
5
1 2 3 4 5

Output:
Initial list: [1, 2, 3, 4, 5]
Final list: []

*/
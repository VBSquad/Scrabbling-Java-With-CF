/*
The clear() method is used to remove all of the elements from the ArrayList. 
It does not delete the ArrayList , instead it justs removes all of the elements of the ArrayList.
*/

import java.util.*;

public class clear {
    public static void main (String [ ] args) {
        Scanner sc = new Scanner(System.in);

        //n is the size of the arraylist
        int n = sc.nextInt();

        //Creating an empty integer list
        ArrayList <Integer > list = new ArrayList <> (); 
  
        // Adding elements to the list 
        for (int i = 0 ; i < n ; i++ ) {
            list.add ( sc.nextInt() );
        }


        //Displaying the initial list
        System.out.println ( "Initial Arraylist: "+ list );

        //clear method clears all the elements from the arraylist
        list.clear ();

        //printing the final arraylist
        System.out.println ( "Final Arraylist: " + list );

        sc.close ();
    }   

}

/*

Sample Test Case

Input:
5
1 2 3 4 5

Output:
Initial Arraylist: [1, 2, 3, 4, 5]
Final Arraylist: []

*/


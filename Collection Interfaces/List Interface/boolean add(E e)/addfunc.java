/* 
The boolean add(E e) method of List interface in Java is used to insert the specified element to the end of the current list.
This method accepts a single parameter e which represents the element to be inserted at the end of this list.
The function returns a boolean value True if the element is successfully inserted in the List otherwise it returns False.
*/

import java.util.*;
public class addfunc {
    public static void main ( String [ ] args ) {
        Scanner sc = new Scanner ( System.in );

        //creating an empty list initially
        ArrayList < Integer > list = new ArrayList < Integer > ();

        //a is the element user wants to enter
        int a = sc.nextInt();

        //add(E e) method returns boolean value on successful insertion
        System.out.println( list.add(a) );

        //printing final list after performing the operation
        System.out.println( " List after adding element " + list );

        sc.close ();
    }
}

/*
Sample Test Case

Input:
5

Output:
true
List after adding element [5]
*/


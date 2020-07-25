/*
void removeRange() method of Vector Class in Java is used to remove all elements within the specified range from the vector.
It shifts any succeeding elements to the left. 
If toIndex == fromIndex, this operation has no effect.
*/

import java.util.*;

//since removeRange() method is protected therefore we need to inherit vector
public class removeRange extends Vector < Integer >{
    public static void main ( String [] args ) {

        Scanner sc = new Scanner ( System.in );

        //creating object of removeRange class
        removeRange v = new removeRange ();
        
        //n is number of elements in the vector
        int n = sc.nextInt ();

        //adding elements to the vector
        for ( int i = 0 ; i < n ; i++ ) {
            v.add ( sc.nextInt() );
        }

        //printing the Initial vector
        System.out.println ( "Initial Vector : " + v );

        int fromindex = sc.nextInt ();

        int toindex = sc.nextInt ();

        //removing elements whose index is between fromindex to toindex
        v.removeRange( fromindex , toindex ) ;

        //printing the final vector
        System.out.println( "Final vector : " + v );

        sc.close ();

    }
}

/*
Sample Test Case

Input:
5
1 2 3 4 5
1 3

Output:
Initial Vector : [1, 2, 3, 4, 5]
Final vector : [1, 4, 5]

*/


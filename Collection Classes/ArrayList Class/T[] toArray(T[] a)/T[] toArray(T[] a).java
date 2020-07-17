/*
 toArray() method is used to get an array which contains all the elements in ArrayList object in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
              If the list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.
*/

import java.util.*;

class ArrayListToArray {
	
    //main code
    public static void main ( String[ ] args )
    {
        
    Scanner sc = new Scanner( System.in );
        
	// create an empty array list with an initial capacity
    ArrayList<String> color_list = new ArrayList<String>();
    
    int size = sc.nextInt();

    // use add() method to add values in the list
    for( int i = 0 ; i < size ; i++ ){
        color_list.add( sc.next() );
    }

    // Create an array from the ArrayList
    String color_list2[] = new String[color_list.size()];
    color_list2 = color_list.toArray(color_list2);
         
    // Display the contents of the array
    System.out.println("Printing elements of color_list2:"); 
    for (String color : color_list2) {
      System.out.println("Color = " + color);
    }
	
    }
}

/*

Sample Test Case

Input :
5
White
Black
Red
White
Yellow

Output :
Printing elements of color_list2:
Color = White
Color = Black
Color = Red
Color = White
Color = Yellow
*/

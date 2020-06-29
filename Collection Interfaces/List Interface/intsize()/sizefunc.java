/* int size() function in List Interface returns the number of elements in the list */


import java.util.*;
public class sizefunc {
    public static void main(String[] args){
        // Creating an empty integer list 
        List<Integer> list = new ArrayList<Integer>(); 
  
        // adding elements to the list
        list.add(10); 
        list.add(20); 
        list.add(30); 
        list.add(40); 
        list.add(50); 
  
        // printing the List 
        System.out.println("List: "
                           + list); 
  
        //size variable is used to store the size of the list
        int size = list.size(); 
  
        // print the size of list 
        System.out.println("Size of list = "
                           + size); 
    }
    
}


/* Output - 
List: [10, 20, 30, 40, 50]
Size of list = 5
*/ 
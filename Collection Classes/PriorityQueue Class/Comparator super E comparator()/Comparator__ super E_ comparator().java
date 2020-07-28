/**
  Comparator<? super E> comparator() : method shares an important function of setting and returning the comparator that can be used to order the elements in a PriorityQueue. The method returns Null value if the queue follows the natural ordering pattern of the elements.
 */
 
import java.io.*; 
import java.util.*;

class The_Comparator implements Comparator<String> { 
    public int compare(String str1, String str2) 
    { 
        String first_Str; 
        String second_Str; 
        first_Str = str1; 
        second_Str = str2; 
        return second_Str.compareTo(first_Str); 
    } 
}
  
class PriorityQueueComparator { 
    
   public static void main(String args[]) { 
       
       PriorityQueue<String> queue = new 
        PriorityQueue<String>(new The_Comparator()); 
  
        queue.add("in"); 
        queue.add("code"); 
        queue.add("student"); 
        System.out.println("Queue before using the comparator: " + queue); 
  
        System.out.println("The elements sorted in descending"
                           + "order:"); 
        for (String element : queue) 
            System.out.print(element + " "); 
  
   } 
} 

/**
Output:
Queue before using the comparator: [student, code, in]
The elements sorted in descendingorder:
student code in 
*/
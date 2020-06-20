import java.util.*; 

public class isEmptyFunc { 
	public static void main(String[] args) 
	{ 
		List<Integer> arr = new ArrayList<Integer>(15); 
 
		boolean answer = arr.isEmpty(); 
		if (answer == true) 
			System.out.println("The List is empty"); 
		else
			System.out.println("The List is not empty");

		arr.add(16); 
 
		answer = arr.isEmpty(); 
		if (answer == true) 
			System.out.println("The List is empty"); 
		else
			System.out.println("The List is not empty"); 
	} 
} 

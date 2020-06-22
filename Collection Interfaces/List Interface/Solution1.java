import java.util.*;

class Solution1{
    //main code
    public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
	    
	//n is the size of arrayList
	int n=sc.nextInt();
	    
        // Declare an empty List of size n
        List<Integer> list = new ArrayList<Integer>(); 
  
        // Add elements to the list in which one element may be 5
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
  
        // Index from which you want to remove element 
        int index = 2; 
  
        // Initial list 
        System.out.println("Initial List: " + list); 
  
        // IndexOf used 
        System.out.println("Index of 5 in list: " + list.indexOf(5)); 
        
	sc.close();
    }
}
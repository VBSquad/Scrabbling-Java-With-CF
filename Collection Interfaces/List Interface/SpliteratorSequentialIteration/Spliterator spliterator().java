/*
*Spliterator = splitting + Iterator
*Spliterator is a Java Iterator, which is used to iterate elements one-by-one from a List implemented object.
*It supports Parallel Programming functionality.
*Spliterator supports both Sequential and Parallel processing of data.
*/
import java.util.*;

class SpliteratorSequentialIteration
{
  public static void main( String[] args ) 
  {
	List< String > names = new ArrayList<>();
	
	Scanner sc = new Scanner( System.in ) ;
	
	//n is the size of the List
	int n = sc.nextInt();
	
	//input in List
	for( int i = 0 ; i < n ; i++ ){
	
	    names.add( sc.next() ) ;
	
	}
		
	// Getting Spliterator
	Spliterator< String > namesSpliterator = names.spliterator() ;
		
	// Traversing elements
	namesSpliterator.forEachRemaining( System.out::println ) ;			
   }
}
/*
Input:
3
Rams
Posa
Chinni

*Output:
Rams
Posa
Chinni
*/
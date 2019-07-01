package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass1 {

/*
 * 		Set is just like a Arraylist 
 * 		
 * 		storing a data in the set
 * 
 * 		 differences betwwen of them
 * 
 * 			Arraylist storing a duplicated data 
 * 
 * 			Set is not storing duplicated data
 * 	
 * 			   
 * 			ArrayList allow multiple null values 		
 * 			
 * 			Set allow just one null value	
 * 
 * 
 * 
 */
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> mySet = new HashSet<>();
		
		mySet.add(1);
		mySet.add(1);
		mySet.add(2);
		mySet.add(1);
		mySet.add(3);
		mySet.add(1);
		mySet.add(5);
		mySet.add(1);
		mySet.add(46);
		mySet.add(23);
		mySet.add(12);
		mySet.add(8);
		mySet.add(13);
		mySet.add(100);
		
		System.out.println(mySet);
		
		
		ArrayList<Integer> myArray = new ArrayList<>();
		
		myArray.add(1);
		myArray.add(1);
		myArray.add(1);
		myArray.add(1);
		myArray.add(1);
		
		
		System.out.println(myArray);
		
		 
		
		
		/*
		 * 		Arraylist vs set vs map vs vector 
		 * 		
		 * 		
		 * 		==  vs .equals 
		 * 
		 * 				
		 * 		String vs StringBuilder vs StringBuffer
		 * 
		 * 		
		 */
		
		
	}
	
	
}

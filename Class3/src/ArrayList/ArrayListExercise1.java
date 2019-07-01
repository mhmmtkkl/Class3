package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise1 {

	public static void main(String[] args) {
		
		
/*	
 * 		Create one arrraylist Integer 
 * 
 * 		store multiple numbers 
 * 
 * 		is this arraylist contains true, false
 * 
 * 		print 3 element
 * 			
 * 		remove 5 element 
 * 
 * 		sort the arraylist 
 * 
 * 		get the total number of the arraylist 
 * 		
 */
		 
		ArrayList<Integer> int_ArrayList = new ArrayList<>();
		
		int_ArrayList.add(2);
		int_ArrayList.add(4);
		int_ArrayList.add(12);
		int_ArrayList.add(51);
		int_ArrayList.add(12);
		int_ArrayList.add(1);
		int_ArrayList.add(542);
		int_ArrayList.add(42);
		int_ArrayList.add(123);
		int_ArrayList.add(42);
		int_ArrayList.add(10);
		int_ArrayList.add(15);
		
		System.out.println("is arrraylist contains 2 " +int_ArrayList.contains(2));
		
		System.out.println("is arrraylist contains 16 " +int_ArrayList.contains(16));
		
		System.out.println("printing elemnt 1 "+int_ArrayList.get(5));
		
		System.out.println("printing elemnt 2 "+int_ArrayList.get(7));
		
		System.out.println("printing elemnt 3 "+int_ArrayList.get(2));
		
		System.out.println("printing before remove "+int_ArrayList);
		
		int_ArrayList.remove(4);
		
		int_ArrayList.remove(4);
		
		int_ArrayList.remove(4);
		
		System.out.println("printing after remove "+int_ArrayList);
		
		Collections.sort(int_ArrayList);
		
		System.out.println("printing after sore " + int_ArrayList);
		 
		System.out.println("size of the arraylist "+int_ArrayList.size());
	}
	
	
	
}

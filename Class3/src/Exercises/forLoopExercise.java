package Exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class forLoopExercise {

	
	public static void main(String[] args) {
		
/*
 * 		multiply the numbers from 0 to 100
 * 		
 * 		in for loop 
 */
		
		int result= 0;
		
		for(int i =0 ; i< 100 ;i++) {
			
			result = result + i;
			
		}
		
		System.out.println(result);
		
		
/*
 * 		Reverse a String 
 * 
 * 		String str = "This problem is similar"
 * 		
 * 
 */
		
		
/*
 * Create one string 
 * 
 * Store it to array 
 *
 * Remove dulicated strings ( DATA )
 * 
 * 
 */
		
		
		
/*
 * remove duplicate from array
 * 
 * 
 * 		Create one array 
 * 
 * 		if any data is duplicating remove it from the array
 * 
 * 
 */
		
		
		ArrayList<Integer> intArray = new ArrayList<>();
		
		intArray.add(1);  //0
		intArray.add(2);  //1
		intArray.add(3);  //2
		intArray.add(4);  //3
		intArray.add(5);  //4
		intArray.add(6);  //5
		intArray.add(7);  //6
		intArray.add(8);  //7
		intArray.add(9);
		intArray.add(10);
		intArray.add(11);
		intArray.add(6);
		intArray.add(2);
		intArray.add(12);
		intArray.add(8);
		intArray.add(13);
	 
		
		for(int i =0 ; i <intArray.size()-1 ; i++) {
			 
			for (int j = i+1; j < intArray.size(); j++) {
			 
				 if(intArray.get(i)==intArray.get(j)) {
					 
					 intArray.remove(i);
				 }
			}
		}
		
		System.out.println(intArray);
			

		
		
//		Sort arraylist 
		
		Collections.sort(intArray);
		
		System.out.println(intArray);
		
		 
		
	}
}

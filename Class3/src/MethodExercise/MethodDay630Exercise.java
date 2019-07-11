package MethodExercise;

import java.util.ArrayList;
import java.util.Random;

public class MethodDay630Exercise {

	
	public static void main(String[] args) {
		
		sumNumbers(5, 7, 8);
		sumNumbers(10 ,15, 38);
		sumNumbers(155 ,2000, 54145);
		
		int r1 = randomCreator(500);
		int r2 = randomCreator(20);
		int r3 = randomCreator(250);
		
		System.out.println(r1 + " r1 ");
		System.out.println(r2 + " r2 ");
		System.out.println(r3 + " r3 ");
		
		sumNumbers(r1, r2, r3);
		
		
		
	}
	
/*
 * 
 * Create one java method that will sum 3 numbers and print it in main method 
 * 
 */
	
	public static void sumNumbers(int i1 , int i2 , int i3) {
		
		int total = i1+i2+i3;
		
		System.out.println(total);
		
	}
	

/*
 * 		Create a method creating random number
 * 
 * 
 * 		get 3 random number and sum them 
 * 		
 * 
 */
	public static int randomCreator(int max) {
		
		Random rnd = new Random();
		
		int random1 = rnd.nextInt(max);
		 
		return random1;
		 
	}
	
	
	
//	java method get average of 3 numbers 
	
	
	
//	Create 2 string array and contaisn each other 
	
//	ARRAYS SHOULD BE IN THE MAIN METHOD
		
//	ArrayList<String> Array1 = new ArrayList<>();
 
	
//	Array1.add("Korea");
//	Array1.add("Mexico");
//	Array1.add("USA");
//	Array1.add("Japan");
//	Array1.add("Canada");
//	Array1.add("Russia");
//	
//	
//	ArrayList<String> Array2 = new ArrayList<>();
//	
//	Array2.add("USA");
//	Array2.add("Russia");
//	Array2.add("Korea");
//	Array2.add("Mexico");
//	Array2.add("Japan");
//	Array2.add("Canada");
//	Array2.add("South Africa");
	
	
	
	
	
	
	
	
	

	
	
	
	
	
}

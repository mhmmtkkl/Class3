package MethodExercise;

import java.util.Random;

public class MethodExercise710 {

	public static void main(String[] args) {
		
		int rand1 = randomNum(10);
		
		int rand2 = randomNum(20);
		
		int rand3 = randomNum(30);
		
		
		System.out.println(rand1);
		
		System.out.println(rand2);
		
		System.out.println(rand3);

	
	}
	
	
	
	public static int randomNum(int max) {
		
		Random rnd = new Random();
		
		int r1 = rnd.nextInt(max);
		 
		return r1; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

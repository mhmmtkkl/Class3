package IfElseStatement;

import java.util.Random;
import java.util.Scanner;

public class ScannerClassExercise {

	
public static void main(String[] args) {
	
	
	/*
	 * Random class  850
	 * 
	 * 		i should be able to type my guess 
	 * 
	 * 		if my number less then random 
	 * 
	 * print your number is too small 
	 * 
	 * 		else if my number bigger then random
	 * 
	 * print your number is too big 
	 * 
	 * 
	 * 		and I have 5 chance to finish it 
	 * 
	 * 		If i do more then 5 
	 * 
	 * 		print you are done bro 
	 * 
	 */
	
	
		Random rnd = new Random();
		
		int randomNum = rnd.nextInt(1000);
		
		Scanner scn = new Scanner(System.in);
	
		int max = 1000;
		
		int min = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			
			
			System.out.println("please enter your guess I have mine number is between " + min +" and " + max);
			
			
			int myGuess = scn.nextInt();
			
			if(myGuess>randomNum) {
				
				System.out.println("Your guess is bigger so get smaller number dude ");
				
				max=myGuess;
				
			}else if(myGuess<randomNum) {
				
				System.out.println("Your guess to short bitch get larger number ");
				
				min = myGuess;
				
			}else if(myGuess==randomNum) {
				
				System.out.println("You got me boy here is my ass " + randomNum);
				
				break;
			}
			
			if(i==10) {
				
				System.out.println("Get the hell out of here dont let me shit on your shoes " + randomNum);
			
			}
	
			System.out.println();
		 	}
	
		System.out.println(randomNum);
	
	
	
	
	
	
	
	
	
	
}
}

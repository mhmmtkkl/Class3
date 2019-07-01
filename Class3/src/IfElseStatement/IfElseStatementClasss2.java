package IfElseStatement;

import java.util.Scanner;

public class IfElseStatementClasss2 {

//	Scanner class and exercise of it 
	
	public static void main(String[] args) {
		
/*			Scanner class
 * 				We are able to type in the console with scanner class
 * 
 * 	
 */
		
		Scanner scn =new Scanner(System.in);
		
		System.out.println("What is your name ");
		
		String name = scn.nextLine();
		
		System.out.println("you have a cool name dude yeah - " + name);
		
		
		/*
		 * Ask the age of the person
		 * 
		 * if it is less then 20 
		 * 
		 * print you are .... 
		 * 
		 * if it is between 20 40 
		 * 
		 * print you are .... 
		 * 
		 * if it is more then 40 
		 * 
		 * print you are .... 
		 * 
		 * 
		 */
		
		Scanner scn2 = new Scanner(System.in);
		
		System.out.println("PLease enter your age");
		
		int age = scn2.nextInt();
		
		if(age<20) {
			System.out.println("You are still young");
		}else if(age>20 && age<40 ) {
			System.out.println("You are okay");
		}else if(age>40 ) {
			System.out.println("You gone more then a half way");
		}
		
		
		
		
	}
	
	
}

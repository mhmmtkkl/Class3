package MethodsDay1;

import java.util.Random;

public class MethodDay626 {

/*
 * 	Methods: 
 * 
 * 		We are creating a methods for reusable functionalities lke random class , scanner class ,compatring arraylists 
 * 
 * 			but we have to connect our methods to main method 
 * 
 * 			because execution of the JAVA start with main method and end with main method 
 * 
 * 
 * 	
 */
	

	 
/*	Access modifiers
* 
* 	 public int a1 = 15;			all in project
*	 protected int a2 = 15;		in the package and in the super/parent class 
*	 int a3 =20;				in the package
*	 private int a4 =20;		just in the class
*/	 
	
	
//	creating first method
	public static void m1() {
	
		int num1 = 15;
		
		int num2 = 25;
		
		int total = num1+num2;
		
		System.out.println("num1 + num2 is = " + total);
		
	}
	
//	Creating return type 
	public static int RandomGenerator() {
		
		Random rnd = new Random();
				
		int randomNum = rnd.nextInt(1000);
		
		return randomNum;
	}
	
//	return type 2 
	public static String strName() {
		
		String name = "Omer";
		
		return name;
	}
	
	
//	paramaters in methods 
	public static int RandomGenerator2(int maxNum) {
		
		Random rnd = new Random();
		
		int randomNum = rnd.nextInt(maxNum);
		
		return randomNum;
		
	}
	
	
	public static void main(String[] args) {
		
		m1();
		
//		you have more codes 
		
		m1();
		
		int mainRandom = RandomGenerator();
		
		System.out.println("main Random =="+mainRandom);
		
		System.out.println("main Random =="+mainRandom);
		
		System.out.println("main Random =="+mainRandom);
		
		System.out.println(strName());
		
		int random2 = RandomGenerator2(10);
		
		int random3 = RandomGenerator2(1000);
		
		int random4 = RandomGenerator2(100000);
		
		System.out.println("random2 ==  "+random2);
		System.out.println("random3 ==  "+random3);
		System.out.println("random4 ==  "+random4);
		
		
		
	}
	 
	
	
}

package IfElseStatement;

import java.util.ArrayList;
import java.util.Random;

public class IfElseStatementClass2Exercise {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Create one random num 
		 * 
		 * 		if it is more then 100 
		 * 
		 * print ..........
		 * 
		 * 		if it is less then 100 
		 * 
		 * print .......... 
		 */
		
		
		int num=  200;
		
		Random rnd = new Random();
		
//		Creating random Number 
		int RandomNumber = rnd.nextInt(num);
		
//		if random number bigger then 100 
		if(RandomNumber>100) {
			
			System.out.println("Random number is bigger then 100 and number is ===  " + RandomNumber);
		
//		else if random number less then 100 
		}else if(RandomNumber<100) {
			
			System.out.println("Random number is less then 100 and number is ===  " + RandomNumber);
				
			
		}
		 
		
//		Create calculator
		
/*
 * 		Create one char 
 * 
 * 		and two int 
 * 
 * 		if char  ==  +    sum two int 
 * 
 *    	if char  ==  -    minus two int
 * 
 * 		if char  ==  *    multiply two int 
 * 
 * 		if char  ==  /    divide two int 
 * 		 
 */
		
/*		overview			profitability 
 * 		1M					1000000
 * 		10K 				10000
 */
		
		char c1 = '*';
		
		int i1 =40 ; 
		
		int i2 = 20; 
		
		int total =0;
		
		if(c1=='+') {
			
			total = i1 +i2 ;
			
		}else if(c1=='-'){
			
			total = i1-i2;
			
		}else if(c1=='*') {
			
			total = i1*i2;
		
		}else if(c1=='/') {
			
			total = i1 / i2;
		
		}
		
		System.out.println(total);
		
		
		
		
//		reverse arraylist 
		
		/*
		 * Create one arraylist 
		 * 
		 * 	and reverse it 
		 * 
		 * 	1 2 3 4 5 6 7 8 9
		 * 	
		 * 	9 8 7 6 5 4 3 2 1
		 * 
		 */
		
		
		ArrayList<Integer> intArray = new ArrayList<>();
		
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		intArray.add(4);
		intArray.add(5);
		intArray.add(6);
		intArray.add(7);
		intArray.add(8);
		intArray.add(9);
		intArray.add(10);
		
		for(int i = intArray.size()-1 ; i>=0 ; i--) {
			
			System.out.println(intArray.get(i));
			
			
		}
		 
		
//		is array unique or not 
//		
//		array String 10 state duplicate 
//		
//		is unique 
		
		
		ArrayList<String> strString = new ArrayList<>();
		
		strString.add("New Jersey");
		strString.add("New York");
		strString.add("California");
		strString.add("Illinois");
		strString.add("Georgia");
		strString.add("Texas");
		strString.add("Ohio");
		strString.add("Florida");
		strString.add("California");
		strString.add("Alabama");
		
		String result = "";
		
		outerloop:
		for (int i = 0; i < strString.size(); i++) {
			
			String fistState = strString.get(i);
			
			String secondState;
			
			for (int j = i+1; j <  strString.size(); j++) {
				
				secondState = strString.get(j);
				 
				if(fistState.equals(secondState)) {
					
					result ="This is NOT a unique array";
				
					break outerloop;
					 
					
				}else {
					
					result ="This is a Unique array";
				}
				
			}
			 
		}
		System.out.println(result);
		
		
		System.out.println("----------------------------------------------------------");
		
//		break  and continue 
//		We are using break and continue in for loops 
		
//		break is stopping the for loop 
		
//		continue is passing that step
		
		for (int i = 0; i <= 10; i++) {
			
//			if i 
			if(i==6) {
				
				System.out.println(i);
				
				break;
				
			}else {
				System.out.println(i);
			}
			
		 }
		
		System.out.println("---------------- Printing even numbers ------------------------------------------");
		

		
		for (int i = 0; i <100; i++) {
			
			if(i%2 == 1) {
				
				continue;
				
			}else {
				
				System.out.println(i);
			
			}
			
		}
		
		 System.out.println("------------------------------------");
		 
		 
//		get prime numbers from 0 to 100 
		
//		1,3,5,7,11, 13, 17, 19,23
		
		for (int i = 0; i < 100; i++) {
			
			
			if(i%2==0 || i%3==0 || i%5==0 ) {
				 
				continue;
				
			}else {
				System.out.println(i);
			}
			
			
		}
		
		
		
		
		
		
	}
	
}

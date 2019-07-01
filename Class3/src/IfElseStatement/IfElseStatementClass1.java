package IfElseStatement;

import java.util.ArrayList;
import java.util.Random;

public class IfElseStatementClass1 {

	
	public static void main(String[] args) {
		
		
/*
 * 	if else statement:
 * 
 * 
 * Purpose :  if ( true ) then {   do this  } 
 * 
 * 	else if (true ) then { do this }
 * 
 * 		
 */
		
//		how declare if else statement 
		
		int i1 = 15;
		
		if(i1<60) {
			System.out.println("i1 is less then 60");
			
		}else if (i1 <40) {
			
			System.out.println("i1 less then 40");
			
		}else if (i1 <20) {
			
			System.out.println("i1 less then 20");
		
		}else {
			
			System.out.println("i1 BIGGER then 60");
		}
		
//		String contains 
		
		String name = "Omer Osman Muhammet";
		
		if(name.equals("Osman")) {
			
			System.out.println("name equals Osman");
		}
		else {
			System.out.println("name NOT equals Osman");
			
		}
		  
// 	&&  and || operatot in if else 
		
		int i2 = 520;
		
		if(i2<60 && i2>=40) {
			
			System.out.println("i2 is bigger then 40 and less then 60 "+ i2);
			
		}else if(i2>=20 && i2 < 40) {
			
			System.out.println("i2 is bigger then 20 and less then 40 "+ i2);
			
		}else if(i2>=0 && i2 < 20) {
			
			System.out.println("i2 is bigger then 0 and less then 20 "+ i2);
		
		}else {
			
			System.out.println("i2 bigger then 60 or less then 0 "+ i2);
			 
		}
 
		System.out.println("---------------------------------------------------");
		
		i2 = 520;
		
		if(i2<60 || i2>=40) {
			
			System.out.println("i2 is bigger then 40 and less then 60 "+ i2);
			
		}else if(i2>=20 || i2 < 40) {
			
			System.out.println("i2 is bigger then 20 and less then 40 "+ i2);
			
		}else if(i2>=0 || i2 < 20) {
			
			System.out.println("i2 is bigger then 0 and less then 20 "+ i2);
		
		}else {
			
			System.out.println("i2 bigger then 60 or less then 0 "+ i2);
			 
		}
		
/*
 * 		Create one array 
 * 
 * 
 * 		which stores at least 10 states 
 * 
 * 		
 * 		verify is that arrat contains California 
 * 
 * 		if yes then print the locatoin of it 
 *  
 * 		  
 */
		 
//		ArrayList<String> states
		
		System.out.println("-------------------------------------");
		
//		creating arrayList for states
		ArrayList<String> states = new ArrayList<>();
		
		states.add("New JErsey");
		states.add("New York");
		states.add("Illinois");
		states.add("Texas");
		states.add("Florids");
		states.add("California");
		states.add("Deleware");
		
		
//		creating arrayList for population
		ArrayList<Integer> population = new ArrayList<>();
		
		population.add(5000000);
		population.add(8000000);
		population.add(15000000);
		population.add(6000000);
		population.add(23000000);
		population.add(3000000);
		population.add(1000000);
		
		
//		example output California population is 23000000
		
		for (int i = 0; i < states.size(); i++) {
			
			String stat = states.get(i);
		 
			
			if(stat.contains("California")) {
				
				System.out.println(i);
			  
				System.out.println(states.get(i) + " population is " + population.get(i));
			} 
			 
		}
		
		
//		random class
		Random rnd = new Random();
		
		int randomNum = rnd.nextInt(1000);
		
		System.out.println("random number "+randomNum);
		
		if(randomNum<500) {
			
			System.out.println("Random num less then 500");
		
		}else if (randomNum > 500) {
			
			System.out.println("Random num bigger then 500");
			
		}
		
		
		
		
/*
 * 
 * Arraylist 
 * 
 * for loop 
 * 
 * if stateent 
 * 
 * Random Num
 * 
 * 		
 */
		
		
		
		
		
		
		
	}
}

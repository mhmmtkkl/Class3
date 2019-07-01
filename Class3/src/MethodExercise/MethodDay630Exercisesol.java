package MethodExercise;

import java.util.ArrayList;
import java.util.Random;

public class MethodDay630Exercisesol {

	public static int sumNumbers(int i1 , int i2 , int i3) {
		
		int total = i1+i2+i3;
		
		return total;
		
	}
	
//	random number creator 
	public static int randomCreator(int max) {
		
		Random rnd = new Random();
		
		int randomNum = rnd.nextInt(max);
		
		return randomNum;
	
	}

	
public static void countrys (ArrayList<String> firstlist , ArrayList<String> secondlist ) {
		
	boolean b1 = false;
	
		for (int i = 0; i < firstlist.size(); i++) {
			
			for (int j = 0; j < firstlist.size(); j++) {
			 
				if (firstlist.get(i).contains(secondlist.get(j))) {
					
					b1 = true;
				 
					break;
					
				} else {
					b1 = false;
				}
				
			}
			
			System.out.println(firstlist.get(i)+ " is in the second array or not  "+b1);
		}
	
		
}
	
	
	
	
	public static void main(String[] args) {
		
		int myI1 = 15;
		
		int myI2 = 20;
		
		int myI3 = 25;
		
		int rr = sumNumbers(myI1,myI2,myI3);
		
		System.out.println(rr);
		
		
//		-----------------------------------------------
		
		int int1 = randomCreator(100);
		
		int int2 = randomCreator(16);
		
		int int3 = randomCreator(45);
		
		System.out.println("int1 =  "+int1);
		
		System.out.println("int2 =  "+int2);
		
		System.out.println("int3 =  "+int3);
		
		int r2 = sumNumbers(int1,int2,int3);
		
		System.out.println("total number if 3 random nums "+r2);
		
		
		System.out.println("---------------------------------------");
		
		ArrayList<String> Array1 = new ArrayList<>();
		
		Array1.add("Korea");
		Array1.add("Mexico");
		Array1.add("USA");
		Array1.add("Turkey");
		Array1.add("Japan");
		Array1.add("Canada");
		Array1.add("Russia");
		
		
		ArrayList<String> Array2 = new ArrayList<>();
		
		Array2.add("USA");
		Array2.add("Russia");
		Array2.add("Korea");
		Array2.add("Mexico");
		Array2.add("Japan");
		Array2.add("Canada");
		Array2.add("South Africa");
		
		
		countrys(Array1, Array2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
	
	
	
}

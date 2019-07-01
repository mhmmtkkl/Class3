package ForloopsClass0623;

import java.util.ArrayList;

public class ForLoopClass2Execise {

	
	public static void main(String[] args) {
		
/*
 * 
 * Create one arraylist 
 * 
 * and print it in for loop 
 * 
 *  sum all the number in the arraylist 
 * 		
 */
		
/*
 * 	Arraylist we are storing multile elements 
 * 		
 */
		
//		String , Double , Short , Boolean 
		ArrayList<Integer> intArray1 = new ArrayList<>();
		
		intArray1.add(5);
		intArray1.add(10);
		intArray1.add(15);
		intArray1.add(20);
		intArray1.add(25);
		intArray1.add(30);
		intArray1.add(35);
		intArray1.add(40);
		
		
//		System.out.println(intArray1);
//		
//		System.out.println(intArray1.get(0));
		
		int total = 0;
		
		for(int i =0 ; i < intArray1.size() ; i++) {
			  
			 total = total + intArray1.get(i);
			
		}
		
		 System.out.println(total);
		
		
/*
 * 	Create string 
 * 
 * 		Split by " "
 * 		
 * 		Reverse each word
 * 
 * 
 */
		 String myString = "Spain, country located in extreme southwestern Europe.";
		 
		 
//		 separating the each words and string in the String array
		 String[] words = myString.split(" ");
	 
//		 to read word array we have to create a for loop
		 for(int i =0 ; i <words.length ; i++) {
			 
//			 to read each word letter by letter we have to store them in the char array
			 char[] letter = words[i].toCharArray();
			 
//			 we are reading a char array with this for loop 
			 for(int j = words[i].length()-1 ; j>=0 ; j--) {
				 
				 System.out.print(letter[j]);
				 
			 }
			 
			 System.out.print(" ");
			 
		 }
		  
		  
		
		
		
		
	}
	
	
}

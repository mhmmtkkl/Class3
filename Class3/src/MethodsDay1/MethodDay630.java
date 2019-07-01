package MethodsDay1;

import java.util.ArrayList;


public class MethodDay630 {

//	
	
	
public static void FirstArrayContainsSecondArray(ArrayList<String> s1 , ArrayList<String> s2) {
	
	for (int i = 0; i < s1.size() ; i++) {
		
		if(s1.get(i).contains(s2.get(i))) {
			 
			System.out.println(true);
			
			 
		}else {
			
			System.out.println(false);
		}
		
		
	}
	 
}
	public static void main(String[] args) {
		
		ArrayList<String> Array1 = new ArrayList<>();
		
		Array1.add("USA");
		Array1.add("Canada");
		Array1.add("Mexico");
		Array1.add("Japan");
		Array1.add("Russia");
		Array1.add("Korea");
		
		ArrayList<String> Array2 = new ArrayList<>();
		
		Array2.add("USA");
		Array2.add("Canada");
		Array2.add("Mexico");
		Array2.add("Japan");
		Array2.add("South Africa");
		Array2.add("Russia");
		Array2.add("Korea");
		
		
		FirstArrayContainsSecondArray(Array1, Array2);
		
	 
		
		
	}
	
	
	
}

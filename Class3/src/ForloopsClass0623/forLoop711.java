package ForloopsClass0623;

import java.util.ArrayList;

public class forLoop711 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> myarray = new ArrayList<>();
		
		myarray.add("100");
		myarray.add("2");
		myarray.add("12");
		myarray.add("32");
		myarray.add("42");
		myarray.add("65");
		myarray.add("34");
		myarray.add("32");
		myarray.add("2");
		myarray.add("100");
		myarray.add("9");
		 
		
		ArrayList<String> myarray2 = new ArrayList<>();
//		if the values are duplicating print them
		
		 
		for (int i = 0; i < myarray.size(); i++) {
			
			for (int j = i+1; j < myarray.size(); j++) {
				
				if(myarray.get(i).equals(myarray.get(j))) {
					
					myarray2.add(myarray.get(i));
					 
				}
				 	
			}
		}
		
		myarray.removeAll(myarray2);
		
		System.out.println(myarray);
		
		
		
		
	}
}

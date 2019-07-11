package MethodExercise;

import java.util.ArrayList;
import java.util.*;


public class MethodExercise71 {

	
/*
 * 
 * 	  
 * 
 * 
 * 
 *  
 * 	
 */
	
	
	
	public static void main(String[] args) {
		
		
		
		
	ArrayList<String> myArr = new ArrayList<>();
		
		myArr.add( "Pennsylvania"  );
		myArr.add( "New Mexico"  );
		myArr.add( "Mississippi"  );
		myArr.add( "Colorado"  );
		myArr.add( "Washington"  );
		myArr.add( "Wyoming"  );
		myArr.add( "Arizona"  );
		myArr.add( "Maryland"  );
		myArr.add( "Wisconsin"  );
		myArr.add( "Maine"  );
		myArr.add( "Istanbul"  );
		
		
		String[] s1 = new String[] {"Alabama"
				,"Alaska",
				"Arizona",
				"Arkansas",
				"California",
				"Colorado",
				"Connecticut",
				"Delaware",
				"Florida",
				"Georgia",
				"Hawaii",
				"Idaho",
				"Illinois",
				"Indiana",
				"Iowa",
				"Kansas",
				"Kentucky",
				"Louisiana",
				"Maine",
				"Maryland",
				"Massachusetts",
				"Michigan",
				"Minnesota",
				"Mississippi",
				"Missouri",
				"Montana",
				"Nebraska",
				"Nevada", 	
				"New Hampshire",
				"New Jersey",
				"New Mexico",
				"New York",
				"North Carolina",
				"North Dakota",
				"Ohio",
				"Oklahoma",
				"Oregon",
				"Pennsylvania",
				"Rhode Island",
				"South Carolina",
				"South Dakota",
				"Tennessee",
				"Texas",
				"Utah",
				"Vermont",
				"Virginia",
				"Washington",
				"West Virginia",
				"Wisconsin",
				"Wyoming"};
		
		ArrayList<String> AllStates = new ArrayList<>();
	 
		Collections.addAll(AllStates, s1);
		
		 
		
/*
 * 
 * Create a method 2 arraylist as a paramaater first one is containg the second one or not 
 * 
 * Create one MYSTATES arraylist 10 values in it 
 * 
 * All States arraylist containing your list 
 * 
 * create other arraylist COUNTRIES  and verify  Allstates arraylist is not containng COUNTRIES  arraylist 
 * 
 * 
 */
		
		
	
		firstArrayContainsSecondArray(myArr, AllStates);
		
		
//		NOTE: break is stopping the for loop and continue is passing that logic
//		for (int i = 0; i < 100; i++) {
//			
//			
//			
//			
//			if(i==70) {
//				
//				continue;
//			}
//			
//			System.out.println(i);
//			
//		}
//		
		
		ArrayList<String> settingExpected = new ArrayList<>();
		
		settingExpected.add("Name");
		settingExpected.add("LastName");
		settingExpected.add("Address");
		settingExpected.add("Manage Account");
		 
		ArrayList<String> settingActual = new ArrayList<>();
		
		settingActual.add("Name");
		
		firstArrayContainsSecondArray(settingExpected, settingActual);
		
		
	}
	
	
	public static void firstArrayContainsSecondArray(ArrayList<String> expected , ArrayList<String> actual) {
		
		boolean b1 =false;
		
		for (int i = 0; i < expected.size() ; i++) {
  	
			for (int j = 0; j < actual.size() ; j++) {
 	
				
				 if(expected.get(i).contains(actual.get(j))) {
					 
					 b1=true;
					 
					 break;
				 
				 } 
				 
				
				 
			}
			 System.out.println(b1);
		  
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
 
}

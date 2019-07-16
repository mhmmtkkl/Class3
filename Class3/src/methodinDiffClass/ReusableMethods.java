package methodinDiffClass;

import java.util.ArrayList;

public class ReusableMethods {
 
	
	public double String_ToDouble(String str) {
		 
		str = str.replaceAll("[^\\d.]", "");
		 
		double d1 = Double.parseDouble(str);
		 
		return d1;
		
	}
	 
	
	public static ArrayList<Double> StringArray_ToDoubleArray(ArrayList<String> strArr) {
		 
		
/*		
 * 		for loop 
 * 
 * 		replace 
 * 
 * 		parse 
 * 
 * 		add to ArrayList<Double>
 * 
 * 		 
 */
		 
		ArrayList<Double> d2 = new ArrayList<>() ; 
		
			for (int i = 0; i < strArr.size(); i++) {
				
				String s1 = strArr.get(i).replaceAll("[^\\d.]", "");
				
				double d1 = Double.parseDouble(s1);
				
				d2.add(d1);
				 
				
			}
 
		
		return d2;
		
	}
	 
	public static double Get_total(ArrayList<Double> d1 ) {
		
		double total =0;
		
		for (int i = 0; i < d1.size(); i++) {
			
			double num = d1.get(i);
			
			total = total +num ;
			
		}
		
		
		return total;
		
	}
	
	
/*			Access modifiers 
 * 
 * Public : 
 * 
 * protected 
 * 
 * default 
 * 
 * Private 
 * 
 * 	
 */
	
	
	 
	
/*		return types 
 * 
 * 		void: no return type 
 * 
 * 		int: return type is integer 
 * 
 * 		String : return type is String 
 * 
 * 		
 * 	
 */
	
	
	/*
	 * 
	 * 		Static: 
	 * 
	 * 			
	 * 
	 * 
	 * 
	 * 
	 */
	
	 
}






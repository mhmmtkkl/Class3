package Exercises;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class WrapperClassExerc {

	
	public static void main(String[] args) {
		
		
		
//		String s1 ="$10,150.55";
//		
//		s1 = s1.replaceAll("[\\$|,|;|']", "");
//		
//		System.out.println(s1);
		
		/*
		 * 	Create 3 string 
		 * 
		 * 	s1 = $10,150.55
		 * 
		 * 	s2 = $15,120.40
		 * 
		 * 	s3 = $25,150.60
		 * 
		 * 	total = $50,421.55
		 * 	
		 * 	s1+s2+s3 == total 
		 * 
		 * 			to delete $ and , use replace method in java 
		 * 
		 * 			String change to double 
		 * 
		 * 			and sum them 
		 * 
		 * 			while chechking to equal use == operator
		 * 
		 * 
		 */
	
//		deleting the $ and , 
		String s1 ="$10,150.55";
		
		String s2 ="$15,120.40";
		
		String s3 ="$25,150.60";
		
		String total = "$50,421.55";
		
		s1 = s1.replace("$", "");
		
		s1 = s1.replace(",", "");
		
		s2 = s2.replace("$", "");
		
		s2 = s2.replace(",", "");
		
		s3 = s3.replace("$", "");
		
		s3 = s3.replace(",", "");
		
		total = total.replace("$", "");
		
		total = total.replace(",", "");
		
		System.out.println("s1 = " + s1);
		
		System.out.println("s2 = "+s2);
		
		System.out.println("s3 = " +s3);
		
		System.out.println("total = " +total);
		
//			converte String to Double 
		
//		double to int 
		
//		casting between the primitives 
		
//		parse between String and double or int ot short ...
		
		
		double d1 = Double.parseDouble(s1);
		
		double d2 = Double.parseDouble(s2);
		
		double d3 = Double.parseDouble(s3);
		
		double total1 = Double.parseDouble(total);
		
		System.out.println("d1 = "+d1);
		 
		System.out.println("d2 = "+d2);
		 
		System.out.println("d3 = "+d3);
		
//		sum d1 d2 and d3
		
		double myTotal =  d1+d2+d3;
		
//		is my total == to total1 
		
		myTotal = Math.round(myTotal * 100.0) / 100.0;
		  	
		System.out.println("My total : "+ myTotal);
		
		System.out.println("Total 1 : "+total1);
	  
		System.out.println(myTotal==total1);
				
		
		
		 for (int i = 0; i < 100; i++) {
			
			 if(i % 2 ==0 || i%3 ==0 || i%5==0 ) {
				
				continue;
			 
			 }else {
				 
				 System.out.println(i);
				 
			 }
			 
			 
			 
		}
		
		
		
		
		
		
		
		
		
		
	}
}

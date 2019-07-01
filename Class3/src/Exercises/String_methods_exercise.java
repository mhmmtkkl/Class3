package Exercises;

public class String_methods_exercise {

	 
	

	
	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 *  
		 *
		 * 
		 * 	
		 * 
		 * 	make exer2 to lower case 
		 * 
		 *  
		 */
		
		String exer = "The site they chose was formerly a strawberry farm, so the soil was rich.";
		
//		Get the length of the String 
		
		System.out.println("length of the exer: "+exer.length());
		
		
//				Change a to H 
//		  
//		  		Change t to K
		
		System.out.println("Changing a to H : "+exer.replace("a", "H") + " 48");
		
		exer.replace("a", "H");
		
		System.out.println(exer + " 52");
		
		String exer23 = exer.replace("t", "K");
		
		System.out.println("Changing t to K : " + exer23 + " 56");
		
		 
//		Get 5 character in the string 
//		 * 
//		 * 	Get the location of the i 
//		 * 
//		 * 	Get the location of the last i 

		System.out.println("Printing 5th caracter in the String : " + exer.charAt(5) );
		
		System.out.println("Printing first i : " + exer.indexOf("i"));
		
		System.out.println("Printing last i : " + exer.lastIndexOf("i"));
		
	 	 
//			  Create one more string (exer2)  which is was rich 
//			  
//			  		is exer contining the exer2
//			  
//			  		is exer equal to exer2 
//			 
		
		String exer2 = "was rich";
		
		System.out.println("is exer containng exer2 : " + exer.contains(exer2));
		
		System.out.println("is exer equals exer2 : " + exer.equals(exer2));
		
//		Make exer to upper case 
		
		System.out.println("making exer uppercase : " + exer.toUpperCase());
		
		
	}
	
	
}

package Arrays;

public class Array1 {

	public static void main(String[] args) {
		 
		
//		Array vs ArrayList
		
		
/*
 * 		Array 
 * 
 * 			We are storing multiple variables in the array 
 * 		
 */
		
//		How we are declaring the array 
		
//		Firstabele we need tell which variable we are going to work with
		
//		Creating int array
		int[] intArray = new int[6];  
		
		Integer[] intArray2 = new Integer[5];
		
		
		
		intArray[0] = 55;
		intArray[1] = 45;
		intArray[2] = 35;
		intArray[3] = 25; 
		intArray[4] = 15;
		intArray[5] = 05;
		
//		intArray[6] = 00;
		
		int total = intArray[0] +intArray[1]+ intArray[2] + intArray[3]+ intArray[4] + intArray[5];
		
		System.out.println("total is =  "+total);
		System.out.println("intArray 0 = "+intArray[0]);
		System.out.println("intArray 1 = "+intArray[1]);
		
		
		
//		Creating String Array
		
		String[] name = new String[4];
		
		name[0] = "Osman";
		name[1] = "Omer";
		name[2] = "Muhammet";
		name[3] = "Feti";
		
		System.out.println("name 0 = "+name[0]);
		
//		other arrays 
		
		double[] doubleArray= new double[4];
		byte[] byteArray = new byte[5];
		short[] shortArray = new short[10];
		 
		
//		Arrays Methods
		
		String[] name2 = new String[4];
		
		name2[0] = "Osman";
		name2[1] = "               Omer                 ";
		name2[2] = "Muhammet";
		name2[3] = "Feti is going to job";
		
//				length
		System.out.println("name2 length =  "+name2.length);
		
		System.out.println("name2 lastElement length = " + name2[3].length());
		
//		     contains 
		System.out.println("name2 second element contains Omer or no: " + name2[1].contains("Omer"));
		 
//		 	equals
		System.out.println("name2 third element equal to osman : " + name2[2].equals("Osman"));
		
//			charAt
		System.out.println("what is the forth eleemnt containg in array : " + name2[3].charAt(3));
		
//			indexOf
		System.out.println("Array index of method " +  name2[3].indexOf('g'));
		
//			replace
		System.out.println("Array replace method " +  name2[2].replace("M", "A"));
		
//			upper Case , lower Case
		System.out.println("Array uppercase method " +  name2[2].toUpperCase());
		
//			trim is cutting the spaces in the end and the beginnig
		System.out.println("Using trim method " + name2[1]);
		System.out.println("Using trim method " + name2[1].trim());
		
		
		String[] States= new String[5];
		
		States[0] = "New Jersey";
		States[1] = "New York";
		States[2] = "Ohio";
		States[3] = "Virginia";
		States[4] = "Florida";
		
		int[] population = new int[5];
		 
		population[0] = 8000000;
		population[1] = 20000000;
		population[2] = 4000000;
		population[3] = 6000000;
		population[4] = 4000000;
		
		
		System.out.println(States[3]);
		
		States[3] = "Indianapolis";
		
		System.out.println(States[3]);
		
	
		
//		    string to split 
		String paragraph = "When an array is declared, only a reference of array is created.";
	 
		String[] sArray = paragraph.split(" ");
		
		System.out.println(sArray[2]);
		
		System.out.println(sArray.length);
		
		
//		Array Literal 
		
		String[] countries= new String[] {"US","China","Turkey","South Africa"};
		
		System.out.println("Countries 3 = "+countries[3]);
		
		
		
/*
 * 	Wrapper class  parsing 
 * 		Create couple strings and parse them to double or integer and get the total 
 * 
 * 
 * 	String methods
 * 
 * 	Arrays 
 * 
 * 		Creating array , printing array 
 * 
 * 	Array methods
 * 	
 * 
 * 
 */
		
		
		
//		
//		String name23 = "Omer wenr to JFK today";
//		
//		for(int i =name23.length()-1 ; i>=0 ; i--) {
//			
//			char[] ch1 = name23.toCharArray();
//			
//			System.out.print(ch1[i]);
//		}
//		System.out.println();
//		
//		System.out.println();
//		
//		
//		
//		StringBuilder strb = new StringBuilder();
//		
//		strb.append(name23);
//		
//		StringBuilder strb2 = strb.reverse();
//		
//		String nameReverse= strb2.toString();
//				
//				System.out.println("asdsad     "+nameReverse);
//		
//	}
	
	}
}

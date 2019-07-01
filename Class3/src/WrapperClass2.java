
public class WrapperClass2 {

	
	public static void main(String[] args) {
		
		
		
//		Wrapper Class: it help us to change from string to primitives (double or int ; float ...)
		
		/*
		 * 	Why we need to converte from string to primitive 
		 * 
		 * 		All elements from WebSite are string to use math operators we need to change them to primitives 
		 * 
		 */
		
	
		
//		All wrapper classes 
		
/*  
 * 
 * 	PRIMITIVES 	      WRAPPER CLASS
 * 	
 * 	double 		=		Double 
 * 	int 		= 		Integer
 * 	short 		=		Short
 * 	byte 		= 		Byte
 *	boolean 	=		Boolean 
 *	float 		= 		Float
 *	char		=		Character 
 *	long 		= 		Long
 *  
 */
		
//		string to int 
		
		String s1 = "95";
		
		String s2 = "105";
		
		int i1 = Integer.parseInt(s1);
		
		int i2 = Integer.parseInt(s2);
		
		System.out.println(i2);
		
		i2 = i1+i2;
		
		System.out.println(i2);
		 
//		string to double 
		
		String num1 = "$15.45";
		
		String num2 = "$35.55";
		
		String total = "$51.00";
		 
		num1 = num1.replace("$", "");
		
		num2 = num2.replace("$", "");
		
		total = total.replace("$", "");
		 
			System.out.println(num1);
				
			System.out.println(num2);
				
			System.out.println(total);
				
			double d1 = Double.parseDouble(num1);
				
			double d2 = Double.parseDouble(num2);
				
			double dTotal = Double.parseDouble(total);
			
			double myTotal = d1+d2;
			
			boolean isItEqual = dTotal==myTotal;
			
			System.out.println("is d1 and d2 equal to myTotal : " + isItEqual);
		 
			
		
//		== (equal equal) vs equals 
		
		int e1 = 10;
		
		int e2 = 20;
		
		System.out.println(e1 == e2);
		
		String st1 = "name";
		
		String st2 = "name";
		
		System.out.println("going to string .equals");
		
		System.out.println(st1.equals(st2));//true
		
		System.out.println(st1==st2);//true
		
			System.out.println("Working on == and .equals diffrence");
			
			String st3 = new String("name");
			
			System.out.println(st1.equals(st3));//true
 	 
			System.out.println(st1==st3);//false
			
//		When we are working with String always using the .equals
			
//		When we are working with primitives always using == 
 
		 	
	 
	}
}

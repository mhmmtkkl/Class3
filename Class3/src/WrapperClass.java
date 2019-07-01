
public class WrapperClass {

	public static void main(String[] args) {
		
//		String 
		
		String str1 = "My name is Muhammet Ali. I am from Turkey.";
	 
		
		String str2 = new String("My name");
		
//		String is immutable (not changable)
		
		String s1 = "Hello";
		
		String s2 = "Hello";
		
		s2 = "Hello2";
		
		s1 = "Hello2";
		
		String s3 = new String("My car");
		
		String s4 = new String("My car");
		
		 
//		String Methods 
		
//		Lenght - Charat - indexof -  lastindexof - touppercase - tolowerCase -   Substring - replace - contains - equal - 
		
		String myString = "Become A New York Times Subscriber Today And Get Unlimited Articles For Just $1 A Week. Multiple Bundle Options. Free Access to NYT Apps. ";
		
//		Length: it is returning how many caracters in out string 
		
		System.out.println("Length method s2 : "+s2.length());
		System.out.println("Length method myString: "+myString.length());
		
//		Charat: is returning the char which is in the in the parantazises position
		System.out.println("Char at method :"+myString.charAt(4));
		
		
//		indexof: is returning the position of the first String whic is in the parantes
		System.out.println("Index of method: "+myString.indexOf("m"));
		
     //		Java is case sensitive language 
		System.out.println("Index of method a : "+myString.indexOf("a"));
		System.out.println("Index of method A : "+myString.indexOf("A"));
		
//		lastindexof: is returning the position of the last String whic is in the parantes
		System.out.println("Last Index of A : " + myString.lastIndexOf("A"));
		
		
//		uppercase: making all string uppercase 
		System.out.println("Uppercase method " + s2.toUpperCase());
			
//		lowerCase: making all string lowerCase 
		System.out.println("LowerCase method " + s2.toUpperCase());
		
		
//		Substring: cutting the string  0 - your nnumber or keep between the numbers and cut others
		String dollar = "$10.5";
		System.out.println("Substring is here : "+ dollar.substring(1));
		
		String dollar3 = "$10.$5";
		System.out.println("Substring is here : "+ dollar3.substring(2, 5));
		
//		replace: replacing the String with diff character
		
		System.out.println("Replace method is here "+dollar3.replace("$", ""));
		
		
//		contains: is checking is your String is containing the String which you typed : returns true or false
		System.out.println("Contains method "+myString.contains("Muham"));
		System.out.println("Contains method "+myString.contains("Times"));
		System.out.println("Contains method "+myString.contains(s2));
		
//		equal : is your string equal to the String which you typed :  returns true or false
		
		String name = "Muhammet Ali";
		System.out.println("equals Method : " +name.equals("Muhammet Ali") );
		System.out.println("equals Method : " +name.equals("Muhammet ali") );
		System.out.println("equals Method : " +name.equals(myString) );
		
		
/*
 * 		Create one String    Paris Saint-Germain is rich beyond belief
 * 		
 * 		Length 
 * 
 * 		Change S to G
 * 		
 * 		Change s to P 
 * 		
 * 		Create one more string which is  s2 = rich 
 * 		
 * 		is String contains s2 
 * 
 * 		is Strong equals s2 
 * 		
 * 		
 */
		
		

		
		
		
	}
	
}

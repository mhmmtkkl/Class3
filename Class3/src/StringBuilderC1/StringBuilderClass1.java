package StringBuilderC1;

public class StringBuilderClass1 {

 
	
	public static void main(String[] args) throws InterruptedException {
		
		 
//		String builder help us to add to our string 
		
		String name = "Omer";
		
//		Declaring String Builder
		StringBuilder strB = new StringBuilder();
		
		strB.append(name);
		
		strB.append(" Onal");
		
		System.out.println(strB);
		
//		Reverse String with String builder
		String name2 = strB.reverse().toString();
		
		System.out.println(name2);
		
//		Another way to declare stringbuilder
		StringBuilder strB2 = new StringBuilder(name);
		
		System.out.println(strB2 + " StrB2");
	
/*	Since String is immutable in Java, whenever we do String manipulation like concatenation,
 *  substring etc, it generates a new String and discards the older String for garbage collection.

	These are heavy operations and generate a lot of garbage in heap. 	
	So Java has provided StringBuffer and StringBuilder class that should be used for String manipulation.

	StringBuffer and StringBuilder are mutable objects in java and provide append(), insert(), delete() and substring() methods for String manipulation.
 * 
 * 
 * 	
 */
	
	int i1 = 10 ; 
	
	i1 =20;
	
	System.out.println(i1);
	
	Thread.sleep(4000);
	final int i2 = 10;
	
	System.out.println(i2);
//	this line will display error because after using final u can not change the variable
//	i2 =25;
	
	 
	
		
		
	}
}

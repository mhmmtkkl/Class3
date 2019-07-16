package Encapsulation;

public class EncapsulationExercMeth {

	
	/*	
	 * 	Create 5 variable 
	 * 
	 * 	name 
	 * 
	 * 	age 
	 * 
	 * 	address
	 * 
	 * 	contact num 
	 * 
	 * 	Class
	 *
	 * 
	 * 	Create getter and setter for each of the variable except class 
	 * 
	 * 	class has just a getter and class = 12
	 *
	 *	in the main method create 3 student 
	 */
	
	private String name;
	
	private int age;
	
	private String Address; 
	
	private String contact_num;
	
	private String Myclass="Automation Class";
	
	/*
	 * Constructors :
	 * 
	 * 			So constructors are used to assign values to the class variables at the time of object creation,
	 *  either explicitly done by the programmer or by Java itself (default constructor).
	 *  
	 *  if you dont create a constructor in JAVA. Java will give you default constructor.
	 */
	
	public EncapsulationExercMeth(String name,int age,String Address,String contact_num) {
		
		
		this.name = name; 
		this.age=age;
		this.Address=Address;
		this.contact_num=contact_num;
		
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.Address);
		System.out.println(this.contact_num);
		 
		
	}
	
	public EncapsulationExercMeth(String name,int age,String contact_num) {
		
		this.name = name; 
		this.age=age;
		this.contact_num=contact_num;
		
		System.out.println(this.name);
		System.out.println(this.age); 
		System.out.println(this.contact_num);
		System.out.println(this.Myclass);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

package Inheritance.IngeritanceDay2;

public class Student {

	/*	
	 * Student class 
	 * 
	 * 	has a variables as 
	 * 
	 * 	Full Name 
	 * 	Contact
	 * 	Address 
	 * 	Money
	 * 	Age
	 * 		if age is less then 20 type get the hell out of here 
	 * 		else {
	 * 
	 * 		welcome baby 
	 * 		}	
	 * 
	 * International Student
	 * 	
	 * 	Visa 
	 * 	Passport
	 * 	i20 
	 * 
	 * 	Native
	 * 	
	 * 	ID 
	 * 	Highschool diploma
	 * 	
	 * 	
	 * 
	 */
	
	
		String Full_Name ;
	  	String Contact;
	  	String Address;
	  	int Money;
	  	String Age;
	  	
	  	public Student(String Full_Name , String Contact , String Address , int money , String age) {
	  		
	  		this.Full_Name = Full_Name;
	  		this.Contact = Contact;
	  		this.Address = Address;
	  		this.Money = money;
	  		this.Age = age;
	  		ismorethen20(age);
	  		
	  	 }
	  	
	  	
	  	public void ismorethen20(String age ) {
	  		
	  		age = this.Age;
 
	  		int myAge = Integer.parseInt(age);
	  		
	  		if(myAge<20) {
	  			this.Age = "Get the hell out of here ";
	  		}else {
	  			
	  			this.Age = age.toString();
	  		}
	  		 
	  	}
	  	 
	  	public String toString() {
	  		
	  		return ("Name of the Student is = " + Full_Name+ 
	  				" Name of the Contact is = " + Contact + 
	  				" Name of the Address is = " + Address + 
	  				" Name of the Money is = " + Money + 
	  				" Name of the Age is = " + Age 
	  				);
	  		
	  	}
	  	
	  	
	  	
	
}






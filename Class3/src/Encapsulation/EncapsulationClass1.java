package Encapsulation;

public class EncapsulationClass1 {
 
	
/*	
 * 		By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

		It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, 
you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

		It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
 * 	
 */
	
	private String model; 
	
	private String make; 
	
	private int year;
	
	private String speed;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getmake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
		
	}
	
	public int getYear() {
		
		return year;
	}

	public void setYear(int year) {
		
		this.year = year;
		
	}
	
	public String getspeed() {
		
		return speed;
	}
	
	
	public void setspeed(String speed) {
		
		int s1 = Integer.parseInt(speed);
		
		if(s1>150) {
			
			this.speed = speed;
		
		}else {
			
		this.speed = "This car is garbage";
			
		}
		
	}
	
}

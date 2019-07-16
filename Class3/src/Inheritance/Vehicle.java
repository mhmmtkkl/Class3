package Inheritance;

public class Vehicle {

	int wheelCount;
	
	int speed;
	
	String Model;
 
	/*this keyword we are initializing in the one class 
	*
	*
	*
	*super keyword we are initializing in the parent and child class 
	*
	*
	*/
	
	public Vehicle(int wheelCount,int speed,String Model) {
		
		this.wheelCount = wheelCount;
		
		this.speed = speed;
		
		this.Model = Model;
		  
	}
	
	public void SpeedIncreas (int increaseAmount) {
		 
		speed += increaseAmount;
		
	}
	
	public void SpeedDecrease(int decreaseAmount) {
		 
		speed -= decreaseAmount;
		
	}
	
	public String toString() {
		
		return ("Car has = " + wheelCount + " wheel ,  Max speed is = "  + speed + " Model of the car is = " + Model );
	}
	       
	    
}

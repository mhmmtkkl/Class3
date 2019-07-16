package Inheritance;

public class Car extends Vehicle {

	int door;
	
	public Car(int wheelCount, int speed, String Model , int door) {
	
		super(wheelCount, speed, Model);
	
		this.door = door;
		
	}
 
	
	public String toString() {
		
		return (super.toString() + " door count is = " + door);
		
	}
	
}

package OverLoadingvsOverriding.carExample;

public class Car {

	int speed;
	
	int doors;
	
	public Car (int speed ,int doors) {
		
		this.speed = speed;
		
		this.doors = doors;
	}
	
	
	public int speedIncrease(int increaseAmount) {
		
		speed+=increaseAmount;
		
		System.out.println("I am in the car class ");
		
		return speed;
	}
	

	
	public String toString() {
		
		return "My current speed is = " + speed +" my car has = " + doors + "doors";
		
	}
	
	
}

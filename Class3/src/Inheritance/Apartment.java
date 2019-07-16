package Inheritance;

public class Apartment extends HomeType{

	int neighborCount;
	
	public Apartment(int floor, int window, int room , int neighborCount) {
		super(floor, window, room);
		
		this.neighborCount = neighborCount;
	}

	
	public String toString () { 
		
		return ( super.toString() + " this apartment neighbor count is " + neighborCount);
	}
	
	
	
	
}

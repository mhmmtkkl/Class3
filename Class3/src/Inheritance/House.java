package Inheritance;

public class House extends HomeType {

	boolean isFirePlaceExist;
	
	public House(int floor, int window, int room , boolean isFirePlaceExist) {
		super(floor, window, room);
		
		this.isFirePlaceExist = isFirePlaceExist;
	}

	public String toString() {
		
		return (super.toString() + " is this house has a fire place  =  " + isFirePlaceExist);
		
	}
	
	
}

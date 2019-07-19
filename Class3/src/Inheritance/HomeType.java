package Inheritance;

public class HomeType {

/*
 * HomeType should have 
 * 
 * 	variables floor 
 * 
 *  window 
 *  
 *  room 
 *  
 *  house should have fireplace 
 *  
 *  apartment should have neighbor count 
 *  
 */
	
	
	int floor;
	
	int window;
	
	int room;
	
	public HomeType(int floor ,int window , int room ) {
		
		this.floor =floor;
		
		this.window = window;
		
		this.room = room;
		 
	}
	
	
	public String toString() {
		
		return ("This house has =" + floor + " number of floor and count of window is = " + window + "count of room is = " + room );
		 
	}
	
	
	
}

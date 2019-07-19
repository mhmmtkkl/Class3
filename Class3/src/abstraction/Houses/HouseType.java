package abstraction.Houses;

public abstract class HouseType {


	int floor;
	
	int room;
	
	int squearFeet;
	
	public HouseType(int floor ,int room , int squearFeet ) {
		
		this.floor =floor;
		
		this.room = room;
		
		this.squearFeet = squearFeet;
		

		
	}

	
	public abstract int price();
	
	
	public String toString() {
		
		return ("This house has =" + floor + " number of floor and count of room is = " + room + " count of squearFeet is = " + squearFeet );
		 
	}
	
}

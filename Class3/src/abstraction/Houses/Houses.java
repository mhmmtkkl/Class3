package abstraction.Houses;

public class Houses extends HouseType{

	int priceoftheHouse; 
	
	public Houses(int floor, int room, int squearFeet) {
		super(floor, room, squearFeet);
		
		this.priceoftheHouse = price(); 
		
	}

	@Override
	public int price() {
		 
		return super.squearFeet * 3000;
		
	}

	 public String toString() {
		 
		 return super.toString() + " price of the house is " + priceoftheHouse;
	 
	 }
	
}

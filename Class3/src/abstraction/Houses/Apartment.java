package abstraction.Houses;

public class Apartment extends HouseType{

	int neighborCount;
	
	int priceofTheApartment;
	
	int multiplication;
	
	public Apartment(int floor, int room, int squearFeet,int neighborCount,int multiplication) {
		
		super(floor, room, squearFeet);
		 
		this.neighborCount = neighborCount;
		
		this.multiplication = multiplication;
		
		priceofTheApartment = price();
		
	}

	@Override
	public int price() {
	 
		return squearFeet*multiplication;
	
	}

	
	public String toString() {
		
		return super.toString() + " neighbor count is " + neighborCount + " price of the apartment is " +
		priceofTheApartment + " multiplication" + multiplication;
	}
	
	/*
	 * extends houseType 
	 * 
	 * 		price *2
	 * 
	 * 		neighbor count
	 * 		
	 * 
	 */
	
	
	
	
	
}

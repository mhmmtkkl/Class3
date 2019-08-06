package abstraction.SportSchool;

public class Gymnastics extends Student{


	int priceofcourse;
	
	int courseofthestudent = getcountofthestuden();
	
	public Gymnastics(String name, String height, String weight, int speed , int countofthestudent) {
		super(name, height, weight, speed ,countofthestudent);
		
		this.priceofcourse=price();
		
	}

	@Override
	public int price() {
		int basketballprice=120;
		int result;
		
		if (courseofthestudent==1 ) {
			result =  basketballprice;
		}else {
			result = basketballprice*6/4;
		}
		
		
		
		return result;
	}
	
	public String toString() {
		return super.toString() + "price of course = " + priceofcourse;
		
	}
}

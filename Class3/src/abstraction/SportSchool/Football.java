package abstraction.SportSchool;

public class Football extends Student { 
	 

		int priceofcourse;
		
		int courseofthestudent = getcountofthestuden();
		
		public Football(String name, String height, String weight, int speed , int countofthestudent) {
			super(name, height, weight, speed ,countofthestudent);
			
			this.priceofcourse=price();
			
		}

		@Override
		public int price() {
			int footballprice=100;
			int result;
			
			if (courseofthestudent==1 ) {
				result =  footballprice;
			}else {
				result = footballprice*6/4;
			}
			
			
			
			return result;
		}
		
		public String toString() {
			return super.toString() + "price of course = " + priceofcourse;
			
		}
		
		

 
}

package abstraction.SportSchool;

public abstract class Student {

	
/*
 * 	5 variables 
 * 
 * 		name 
 * 
 * 		height 
 * 
 * 		weight 
 * 	
 * 		speed
 * 
 * 		price
 * 
 * 		countofthe student
 * 
 * getter setter 
 * 
 * 	abstract methods
 * 
 * 		priceofCourse if else { 150 * 6/4
 * 
 * 
 * 
 * 	football
 * 		if speed less then 25 mile : This student not able to play football
 * 
 * tostring
 * 100
 * 
 * Basketball 
 * 		If height less then 175 cm : this student not able to play basketball
 * 
 * 120
 * 
 * Gymnastic 
 * 		if weight more then 55 kg : this student not able to do gymnastic 
 * 
 * 150
 * 
 * if one family has 2 sstudnet then secon one price %50 off 
 * 
 */
	 
 
		
		String name;
		String height;
		String weight;
		int speed;
		private  int countofthestudent;
		
		
		public int getcountofthestuden() {
			return countofthestudent;
			
		}
		
		
		public Student(String name, String height, String weight, int speed, int countofthestudent) {
			this.name=name;
			this.height=height;
			this.weight=weight;
			this.speed=speed;
			
			this.countofthestudent = countofthestudent;
			
			
		}
		public abstract int price();
		
		
		
		
		public String toString() {
			
			
			return("our courses is for you ");
			
			
			
			
			
			
			
		}
	
}

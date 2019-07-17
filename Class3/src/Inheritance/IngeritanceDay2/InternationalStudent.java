package Inheritance.IngeritanceDay2;

public class InternationalStudent extends Student {

		
		String Visa ;
	  	String Passport;
	 	boolean i20 ;
	 	
	 	 
	 	public InternationalStudent(String Full_Name, String Contact, String Address, int money, String age,String Visa,String Passport,boolean i20 ) {
			
	 		super(Full_Name, Contact, Address, money, age);
			
			this.Visa = Visa;
			this.Passport = Passport;
			this.i20 = i20;
			
			
		}
	 	
		public String toString() {
			
			return (super.toString() + " Visa number of the Student is = " + Visa + 
					" Passport number of the student is = " + Passport + " is student has a i20 = " + i20);
			
		}
}

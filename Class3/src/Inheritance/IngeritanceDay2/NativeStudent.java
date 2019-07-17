package Inheritance.IngeritanceDay2;

public class NativeStudent extends Student {

	
	
	int ID ;
	 boolean Highschool_diploma;
	 
	 
	 public NativeStudent(String Full_Name, String Contact, String Address, int money, String age ,int ID , boolean Highschool_diploma) {
			
		 	super(Full_Name, Contact, Address, money, age);
			this.ID = ID;
			this.Highschool_diploma = Highschool_diploma;
			
		}
	 
	 
	 
	 public String toString() {
		 
		 return (super.toString() + " Id number of the student is " + ID + " Is student has a highschool diploma = "+ Highschool_diploma );
		 
	 }
	 
}

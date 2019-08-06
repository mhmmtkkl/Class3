package Exercises.OOPExercise;

public abstract class Employees implements myEmployees {
	
	String name;
	
	String age;
	
	String ID;
	
	String employeeType;
	 
	public Employees(String name , String age, int ID ,String employeeType) {
		
		
	}
	public Employees(String name , String age, String ID ,String employeeType ) {
		
		this.name=name;
		this.age=age;
		this.ID=ID;
		this.employeeType = employeeType;
		  
		
	}
	
	public Employees() {
		
		
	}
	
	public abstract String attandence();
	
	
	public String toString() {
		
		return "This employee name is = " + name +" his age is = " + age + " his employee ID is = " + ID 
				+ " Hisemployee type is = "+ employeeType ;
		 
	}
	
	
	
	
	
}

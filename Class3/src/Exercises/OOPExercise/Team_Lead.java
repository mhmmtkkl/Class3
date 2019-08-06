package Exercises.OOPExercise;

public class Team_Lead extends Employees {

	int teamMemberCount;
	
	String attandence;
	
	int maxAttandence = 20;
	
	public Team_Lead(String name, String age, String ID, String employeeType , int teamMemberCount , String attandence) {
		super(name, age, ID, employeeType);
		 
		this.teamMemberCount = teamMemberCount;
		this.attandence =  attandence;
	}

	@Override
	public String attandence() {
		
	  int attandence1 = Integer.parseInt(attandence);
	 
	  String myReturn= null;  
	  
	  if(attandence1>maxAttandence) {
		  
		  myReturn = " Your attandence is too high so you are fired";
	  
	  }else if(attandence1 == maxAttandence) {
		  myReturn = " your attande is same with max attandence so you have to come to work rest of the year";
	  
	  }else {
		  
		  myReturn = ("you dont need to worry about attandence ");
	  }
	 
	  return myReturn;
		
	} 

	
	public String toString() {
		
		return super.toString() + " team member count is " + teamMemberCount + " attandence message is  ====" +  attandence();
	}

	@Override
	public String salaryLimit() {
	 
		return null;
	}
	
	
	
	
}

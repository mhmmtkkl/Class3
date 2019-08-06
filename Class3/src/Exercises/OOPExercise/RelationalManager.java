package Exercises.OOPExercise;

public class RelationalManager extends Employees {

	int clientCount;
	
	int CallReportCount; 
	
	String attandence;
	
	int maxAttandence =50;
	
	int salary;
	
	public RelationalManager(String name, String age, String ID, String employeeType, int clientCount,int CallReportCount , String attandence , int salary) {
		
		super(name, age, ID, employeeType);
	 
		this.clientCount = clientCount;
		
		this.CallReportCount = CallReportCount;
		  
		this.attandence = attandence;
	
		this.salary = salary;
	}

	
	public String toString()  {
		  
		return  super.toString() + "client Count of this employee is = " + clientCount +" callreport count of this employee is " + CallReportCount+ " your attandence result is ====" + attandence() + salaryLimit();
		  
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


	 
	 
	@Override
	public String salaryLimit() {
		
		 
		int myMaxSalary = super.MaxSalary;
		
		String message =null;
		
		 if(salary>myMaxSalary) {
			 
			 message = "Your salary is too high";
			 
		 }else if(salary==myMaxSalary) {
			 
			 message = ("I can not increase your salart at all");
		 }else {
			 
			 message = ("You are soo cheap");
			 
		 }
		
		 	return message;
	}
	
}

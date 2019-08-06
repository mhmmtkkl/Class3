package Interface;

public class Employee implements People {
	
	int Attendence ;
	 String Salary;
	 String WorkHour;
	 
	public  Employee(int Attnedence, String Salary ,String WorkHour) {
		
		this.Attendence= Attnedence;
		this.Salary= Salary;
		this.WorkHour=WorkHour;
	
	}
	
	@Override
	public String work() {
		String minWorkHour = People.minWorkHour;
		
		int minWorkOurint = Integer.parseInt(minWorkHour);
		
		int myWorkHourint = Integer.parseInt(WorkHour);
		
		String result ;
		
		if(myWorkHourint>minWorkOurint) {
			
			result = "You ll get over time salary";
			
		}else if(myWorkHourint==minWorkOurint) {
			
			result = "You are the perfect employee";
			
			
		}else {
			
			result = "You think you are different then other employees ";
			
		}
		
		return result;
	}

	@Override
	public String salary() {
		 String maxSalary = People.maxSalary;
		
		 int maxSalarystr = Integer.parseInt(maxSalary);	
		
		 int mySalary = Integer.parseInt(Salary);
		 
		 String result ;
		 
		 if(mySalary>maxSalarystr) {
			 
			 result = "Your salary is too high, it can be max " + maxSalary +" if you are okay with it we can still work with you";
			 
		 }else if(maxSalarystr==mySalary){
			 
			 result = "You are the perfect employee u are good to go my boy";
			 
		 }else {
			 
			 result = "you should work more so I can get better car";
		 }
		 
		 return result;
	}

	@Override
	public String attandence() {
		 int Maxattandence = People.maxAttnedence;
			
		 String result;
		 
		 if(Attendence > Maxattandence ) {
			 
			 result = "tell me jusst one reason to not fire u";
			 
			 
		 }else if(Attendence == Maxattandence) {
			 
			 result = "I like u but I ll fire if i have to";
			 
		 }else { 
			 
			 result = "why are u coming everyday";
			 
		 }
		
		 return result;
	}

	public String toString() {
		return "Work Result is === "+work() +"Attandence result is === "+ attandence() + "Salary result is === " +salary();
		
		
		
	}
	
 
}

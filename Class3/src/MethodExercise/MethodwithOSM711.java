package MethodExercise;

public class MethodwithOSM711 {

	
//	 create a date for 2 days future date  
	
//	create a date 2 days before 
	
//	creating call report 
	
//	void = no return 
	
	
//	create a method which accepts to paramets if num1 / num2 == even number then return true 
	
	   public static void main(String[] args) {
		
		   System.out.println(m1(16 , 2));
		   
	}
	
	public static boolean m1 (int num1 , int num2) {
		
		boolean b1 = false;
		
		int result = num1/num2 ;
		  
		boolean b2 = result % 2 == 0;
		
		System.out.println(b2);
		
		if(b2) {
			
			b1 = true;
			
		} 
		  
		return b1;
		
	}
	
	
	
	
	
}

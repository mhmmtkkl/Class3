package OverLoadingvsOverriding;

public class Calculator {

	public int sum(int i1 ,int i2) {
		
		int total = i1+i2;
		
		return total;
	}
	
	
	public int sum(int i1,int i2, int i3) {
		
		int total = i1+i2+i3;
		
		return total;
		 
	}
	
	
	public static int multiply(int i1 ,int i2) {
		
		int total = i1*i2;
		
		return total;
	}
	
	public static int multiply(int i1 ,int i2,int i3) {
		
		int total = i1*i2*i3;
		
		return total;
	
	}
	
	private final int division(int i1 ,int i2) {
		
		int division = i1/i2;
		
		return division;
	}
	
	private final int division(int i1 ,int i2,int i3) {
		
		int division = i1/i2/i3;
		
		return division;
	}
	
}

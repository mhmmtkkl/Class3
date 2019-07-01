package ForloopsClass0623;

import java.util.ArrayList;

public class ForLoopClass1Exercise2 {

	public static void main(String[] args) {
		
		
//		sum the numbers from 1 to 10 
		int total = 0;
		
		for(int i =0 ; i<10 ; i++) {
			
/*			0		0		0
 * 			0		0		1
 * 			1		1		2
 * 			3		3		3	
 * 			6		6		4
 * 			10
 */
			total = total+ i;
			
		 
		}
		
		System.out.println(total);
		 
			
		

//		< ,   > , <=  ,  >=  , != , ==  , %
	
//	!= not equal 
	
		int pers=  17 % 13 ;
		
		System.out.println(pers);
		
		
// nested loop is loop inside  the loop 
		
		for(int i = 0; i < 5 ;i++) {
 
			for(int j = 0;j<4 ; j++) {
				
 
				System.out.print(j);
				
			}
			
			System.out.println("     i = " + i);
			
		}
	
	
		
	
	
//*
//**
//***
//****
//*****
	
	for(int i =0 ; i<6 ; i++) {
		
		for(int j=0 ; j<i+1 ; j++) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	
	
	System.out.println("------------------------------------------"); 
	System.out.println("------------------------------------------"); 
	System.out.println("------------------------------------------"); 
	System.out.println("------------------------------------------"); 
	
	
//	  *
//   **
//  ***
// ****
//*****
	
//	 this one is a home work
	
	
	
	
	}
		
 
}

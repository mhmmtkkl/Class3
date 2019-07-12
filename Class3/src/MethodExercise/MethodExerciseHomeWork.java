package MethodExercise;

import java.util.ArrayList;

public class MethodExerciseHomeWork {

	
 
	
	
	
/*
 * Create one arrraylist 
 * 
 * Create a method it will accept a arrayList 
 * 
 * in this method you should remove the letters and $ sign 
 * 
 * if value contains M multiply by 10000000
 * 
 * if value contains K mulyiply by 1000
 * 
 * else multiply 1 
 * 
 * 
 * and sum all of them 
 *  
 */
		
//	int totalNumofOsmanStatement = totalnumofArray(OsmanBankStatement);
	
	
		public static int totalnumofArray(ArrayList<String> Myarray) {
			
			int total = 0 ;
			
//			need to read each value in the arraylist 
			for (int i = 0; i < Myarray.size(); i++) {
				
				String myNum;
				
				int d1;
				
//				if array contains M then do this line of codes 
				if(Myarray.get(i).contains("M")) {
					
					myNum = Myarray.get(i).replace("M", "");
						
					myNum = myNum.replace("$", "");
					
					d1 = Integer.parseInt(myNum);
					
					d1 = d1 * 1000000;
					
					
//				if array contains K then do this 
				}else if(Myarray.get(i).contains("K")) {
					
					myNum = Myarray.get(i).replace("K", "");
					
					myNum = myNum.replace("$", "");
					
					d1 = Integer.parseInt(myNum);
					
					d1 = d1 * 1000;
					
					
//					if array doesnt contains K or M then do this 
				}else {
					
					myNum = Myarray.get(i).replace("$", "");
					
					d1 = Integer.parseInt(myNum);
					
				 
					
					
				}
				 
				total = total + d1 ;
		 
			}
		
		
			return total ;
		}
		
		
		
		public static void main(String[] args) {
			
//			Creating first person statement 
			ArrayList<String> MyStringArray = new ArrayList<>();
			
			MyStringArray.add("$1M");
			MyStringArray.add("$2M");
			MyStringArray.add("$4M");
			MyStringArray.add("$8M");
			MyStringArray.add("$105K");
			MyStringArray.add("$500");
			MyStringArray.add("$600K");
			MyStringArray.add("$1M");
			MyStringArray.add("$2M");
			MyStringArray.add("$4M");
			MyStringArray.add("$8M");
			MyStringArray.add("$105K");
			MyStringArray.add("$500");
			MyStringArray.add("$600K");
			MyStringArray.add("$1M");
			MyStringArray.add("$2M");
			MyStringArray.add("$4M");
			MyStringArray.add("$8M");
			MyStringArray.add("$105K");
			MyStringArray.add("$500");
			MyStringArray.add("$600K");
		
//			Calling the method and storing the return type 
			int totalNumofOmerStatement = totalnumofArray(MyStringArray);
			
			System.out.println(totalNumofOmerStatement);
			
//			Creating second person statement 
			ArrayList<String> OsmanBankStatement = new ArrayList<>();
			
			OsmanBankStatement.add("$3M");
			OsmanBankStatement.add("$8M");
			OsmanBankStatement.add("$102K");
			OsmanBankStatement.add("$7M");
			OsmanBankStatement.add("$2M");
			OsmanBankStatement.add("$503");
			OsmanBankStatement.add("$62K");
			OsmanBankStatement.add("$925");
			OsmanBankStatement.add("$15K");
			
//			Calling the method and storing the return type 
			int totalNumofOsmanStatement = totalnumofArray(OsmanBankStatement);
			

			System.out.println(totalNumofOsmanStatement);
			
			
				
		}

		
		
		
		
		
	
	
	
	
	
	
	
		
}

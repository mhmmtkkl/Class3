package ForloopsClass0623;

public class ForLoopClass1 {
	
	public static void main(String[] args) {
		
/*
 * 		for loop using for the read and write the multiple elements  --
 * 
 * 		nested for loop 
 * 
 * 		for each loop
 * 	
 * 		while loop --
 * 
 * 		do while loop  --
 * 
 * 		infinite loop (forever)	--
 * 		
 */
		
		
//		while loop 
		int i=0;
		
		while(i<10) {
			
			System.out.println(i);
			
//			
//			if(i==6) {
//				
//				break;
//			}
			
			
			i++;
		}
		
//		infinite loop 	
		int j =2;
		while(j==10) {
			
			System.out.println(j);
			
			j=j+3;
			 
		}
		
//		do while loop 
		
		int k = 0;
		do{
			System.out.println("k = "+k);
			
			k++;
		}while(k<25);
		
//		for loop
		
		for(int g = 0 ; g<20 ; g++) {
			
			System.out.println("g = "+g);
			
		}
		
		
		String name = "alkdmlsadmalskdmalsdmasd";
		
		char[] namChar = name.toCharArray();
		
		
		for(int r=0;r<name.length() ; r++) {
					
			for(int p =0 ;p<namChar.length ; p++) {
				
				if(namChar[r] == namChar[p]) {
						
//						namChar[p].
						
					
				}
			}
			
			
		}
		
		
		
		
	}
	
	
}

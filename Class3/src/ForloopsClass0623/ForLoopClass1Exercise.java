package ForloopsClass0623;

import java.util.ArrayList;

public class ForLoopClass1Exercise {

	
	public static void main(String[] args) {
		
		ArrayList<String> States = new ArrayList<>();
		
		States.add("Alabama");   
		States.add("Alaska");	
		States.add("Arizona");	 
		States.add("Arkansas");  
		States.add("California");
		States.add("Colorado");
		States.add("Connecticut");
		States.add("Delaware");
		States.add("Florida");
		States.add("Georgia");
		States.add("Hawaii");
		States.add("Idaho");
		States.add("Illinois");
		States.add("Indiana");
		States.add("Iowa");
		States.add("Kansas");
		States.add("Kentucky");
		 
		
		for(int i = 0 ; i<States.size() ; i++ ) {
			
			System.out.println("each states in the list "+States.get(i));
			 
		}
		
 
		
		ArrayList<Integer> Population = new ArrayList<>();
		
		 
		Population.add(4858979);
		Population.add(738432);
		Population.add(6828065);
		Population.add(2978204);
		Population.add(39144818);
		Population.add(3590886); 
		Population.add(945934);
		Population.add(20271272);
		Population.add(10214860);
		Population.add(1431603);
		Population.add(1654930);
		Population.add(12859995);
		Population.add(6619680);
		Population.add(3123899);
		Population.add(2911641);
		Population.add(4425092);
		Population.add(4425092);
		
		for(int k = 0 ; k<States.size() ; k++) {
			
			System.out.println("State names "+ States.get(k) +" Population for each of them " + Population.get(k));
			
			
		}
		
		
 
		}
	 
	
}

package Encapsulation;

public class EncMain {

	public static void main(String[] args) {
		
		
		EncapsulationClass1 e1 = new EncapsulationClass1();
		
		 e1.setModel("Audi");
		 e1.setMake("A4");
		 e1.setspeed("160");
		 e1.setYear(2015);
		 
		 System.out.println(e1.getModel());
		 System.out.println(e1.getmake());
		 System.out.println(e1.getspeed());
		 System.out.println(e1.getYear());
		 
		 
		 System.out.println("-----------------------------------------------");
		 
		 e1.setModel("BMW");
		 e1.setMake("550");
		 e1.setspeed("110");
		 e1.setYear(2016);
		  
		 System.out.println(e1.getModel());
		 System.out.println(e1.getmake());
		 System.out.println(e1.getspeed());
		 System.out.println(e1.getYear());
		 
		 
		 
		 
		 
		 
	}
	
	
}

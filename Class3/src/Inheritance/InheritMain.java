package Inheritance;

public class InheritMain {

	public static void main(String[] args) {
		
//		Car bmw = new Car(4, 150, "550I", 4);
//		
//		System.out.println(bmw.toString());
		
		House House1 = new House(2, 10, 3, false);
		
		System.out.println(House1);
		
		House House2 = new House(1, 5, 2, true);
		
		System.out.println(House2);
		 
		Apartment Apartment1 = new Apartment(10, 1000, 50, 3000);
		
		System.out.println(Apartment1);
	}
	
}

package methodinDiffClass;

import java.util.ArrayList;

public class MainMeth {

	  
	
	public static void main(String[] args) {
		
		ReusableMethods RM = new ReusableMethods();
		
		double myDouble = RM.String_ToDouble("16M");
		
		System.out.println(myDouble);
		
		ArrayList<String> myArrayString= new ArrayList<>();
		
		myArrayString.add("10M");
		myArrayString.add("12M");
		myArrayString.add("15M");
		myArrayString.add("10M");
		myArrayString.add("10M");
		myArrayString.add("90M");
		
		ArrayList<Double> d1= RM.StringArray_ToDoubleArray(myArrayString);
		
		System.out.println(d1);
		
		double myTotal = RM.Get_total(d1);
		
		System.out.println(myTotal);
		
		
		
		 
	}
	
	
}

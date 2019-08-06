package Interface;

public class main {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "50000", "40");
		
		System.out.println(e1);
		
		int i = 1, j = 10;
		   do {
		      if (i++ > --j) continue;
		   } while (i < 5);
		   System.out.println("i=" + i + " j=" + j);
		   
		   String mStr = "123"; 
		   long m = Long.parseLong(mStr);
		   
		   System.out.println();
		   
		   int i1, h, g;
		   i1=h=g=5;
		   
		   System.out.println(i1);
		   System.out.println(h);
		   System.out.println(g);
		   
		float f1 = 123_345_667F;
		   System.out.println(f1);
		   
		   int a;
		      int b;
		      for (a = 0, b = 0; b < i; ++b, a++){
		         System.out.println(a + " " + b);
		      }
		      System.out.println(a + " " + b);
		      
		    
		      

   }
}
	

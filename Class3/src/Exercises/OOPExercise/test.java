package Exercises.OOPExercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		
		RelationalManager rm1 = new RelationalManager("Omer", "23", "T22312", "Relational Manager", 10, 20, "12", 80000);
		
		System.out.println(rm1);
		
		RelationalManager rm2 = new RelationalManager("Muhammet", "25", "T266984",  "Relational Manager", 25, 35, "8" , 105000);
		
		System.out.println(rm2);
				
		Team_Lead tm1 = new Team_Lead("Mehmet", "30", "T.Lucky", "TeamLead", 2, "20");
		System.out.println(tm1);
		
		int i1[] =new int[4]; 
		
		
		
		Set<Integer> i2 =new HashSet<>();
		
		i2.add(1);
		i2.add(21);
		i2.add(34);
		i2.add(14);
		i2.add(123);
		i2.add(32);
		i2.add(321);
		i2.add(40);
		i2.add(11);
		i2.add(21);
		i2.add(35);
		i2.add(47);
		
		System.out.println("Hashset "+i2);
		
		Set<Integer> i3 = new TreeSet<>();
		
		i3.add(1);
		i3.add(7);
		i3.add(3);
		i3.add(12);
		i3.add(16);
		i3.add(74);
		i3.add(32);
		i3.add(121);
		i3.add(13);
		i3.add(72);
		i3.add(30);
		i3.add(127);
		
		System.out.println("Treeset " + i3);
		
		Set<Integer> i4 = new LinkedHashSet<>();
		
		i4.add(1);
		i4.add(212);
		i4.add(3);
		i4.add(4);
		i4.add(52);
		i4.add(51);
		i4.add(27);
		i4.add(35);
		i4.add(14);
		i4.add(50);
		i4.add(18);
		i4.add(24);
		i4.add(32);
		i4.add(44);
		i4.add(55);
		System.out.println(i4);
		
	}
}

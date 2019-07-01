package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	
/*
 * 		ArrayList: is just like an array we are abl to store multiple elements 
 * 
 * 
 * 		array 							vs 								arraylist 
 * 		
 * 		Fixed size														u can add an remove as much as you want 
 * 		length															size
 * 		while adding using assignmernt operator 						using add operator 
 *  
 * 		array pritive and objects 										just objects
 * 
 */
	
 public static void main(String[] args) {
	

//	How to create Arraylist
	ArrayList<String> name = new ArrayList<>();
	
//	arraylist add method
	name.add("Omer");
	name.add("Muhammet");
	name.add("Osman");
	name.add("Halil");
	name.add("Feti");
	
	
//	arraylist get method	
	System.out.println(name.get(3));
	
	System.out.println(name.size());
	
//	arraylist set method
	
	name.set(3, "Selim");
	
	System.out.println(name.get(3));
	
//	arraylist remove method
	
	name.remove(2);
	
	System.out.println(name.get(2));
	
//	arraylist contains method
	System.out.println(name.contains("Omer"));
	
//	arraylist sort 
	Collections.sort(name);
	
	System.out.println(name);
	
	
	
	
	
 }	
}

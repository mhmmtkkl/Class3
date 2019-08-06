package Interface;

import java.util.ArrayList;

public interface People {

	/*
	 * 	rules : 
	 * 			all methods in the interface are abstract 	|| 	Abstraction can contain non abstract methods 
	 * 
	 * 			interface can not store constructor 	|| Abstraction can contain constructor
	 * 
	 * 			to get interface you need to use "implements" || Abstraction we have to use "extends" keyword 
	 * 		
	 * 			all variables in interface is static final || Abstraction can contain regular variables 
	 * 		
	 * 			variable in interface are public || abstract class variables are can be private or protected as well 
	 * 
	 * 			An interface can extend another Java interface only, ||	An abstract class can extend another Java class and implement multiple Java interfaces.
	 * 
	 * 			A Java class can implement multiple interfaces but it can extend only one abstract class.
	 * 
	 */
	
	int maxAttnedence=10;
	 
	String maxSalary = "100000";
	
	String minWorkHour = "40";
	
	public String work();
	
	public String salary();
	
	public String attandence();
 
	
}

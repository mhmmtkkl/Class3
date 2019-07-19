package abstraction.area;

public class rectangle extends shape{
 
	double length; 
    double width; 
      
    public rectangle(String color,double length,double width) { 
         
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    double area() { 
        return length*width; 
    } 
  
    @Override
    public String toString() { 
        return "Rectangle color is " + super.color +  
                           "and area is : " + area(); 
    } 
  
}

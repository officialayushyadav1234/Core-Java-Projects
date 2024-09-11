package shape_project;

public class Circle extends TwoDShape{

	boolean isregular = true;
	double radius;
	
	Circle()     // default constructor
	{
		
	}
	
	Circle(double radius)  // parameterized constructor
	{
		this.radius=radius;
	}
	
	@Override
	public void getArea()
	{
		System.out.println("Area of Circle is:" +3.14*radius*radius+ "Sq.Unit");
	}
	
	@Override
	public void getPerimeter()
	{
		System.out.println("Perimeter is :" +2*3.14*radius+ "Unit");
	}
	
}

package shape_project;

public class Triangle extends TwoDShape{

	double a;
	double b;
	double c;
	
	Triangle()
	{
		
	}
	
	Triangle(double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void getArea()
	{
		double s = (a+b+c)/2;
		double area =Math.sqrt (s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is: " +area+ "Sq. Unit");
	}
	
	public void getPerimeter()
	{
		System.out.println("Perimeter of Triangle is: "+(a+b+c)+"Unit");
	}
}

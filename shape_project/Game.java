package shape_project;

import java.util.*;
public class Game {

	Game()
	{
		System.out.println("Welcome to the Mathemetical Brain Game");
	}
	
	public int selectShape()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 to Select 2-D Shape");
		System.out.println("Press 2 to Select 3-D Shape");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		 case 1:
			 System.out.println("You have Selected 2-D Shape");
			 return choice;
			 
		 case 2:
			 System.out.println("You have Selected 3-D Shape");
			 return choice;
			 
	     default :
	    	 System.out.println("This is Not a Valid Choice!!");
	    	 return selectShape();
		}
		
	}
	
	public TwoDShape selectTwoDShape()
	{
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Press 1 to Circle");
      System.out.println("Press 2 to Rectangle");
      System.out.println("Press 3 to Triangle");
      System.out.println("Press 4 to Square");
      
      int choice = sc.nextInt();
      switch(choice)
      {
       case 1:
    	  System.out.println("You have selected Circle");
    	  System.out.println("Enter the Radius:");
    	  double r = sc.nextDouble();
    	  return new Circle(r);
    	  
       case 2:
    	   System.out.println("You have selected Rectangle");
    	   System.out.println("Enter the Length: ");
    	   double l = sc.nextDouble();
    	   System.out.println("Enter the Width: ");
    	   double w = sc.nextDouble();
    	   return new Rectangle(l,w);
    	   
       case 3:
    	   System.out.println("You have selected Triangle");
    	   return getTriangle();
    	   
       default :
    	   System.out.println("This is Not a valid choice!!");
    	   return selectTwoDShape();
      }
	}
	
	public static Triangle getTriangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side 1:");
		double a = sc.nextDouble();
		System.out.println("Enter the Side 2:");
		double b =sc.nextDouble();
		System.out.println("Enter the Side 3:");
		double c = sc.nextDouble();
		
		if(a+b>c && b+c>a && c+a>b)
			return new Triangle(a,b,c);
		else 
		{
			System.out.println("This is not Valid Triangle!!");
			return getTriangle();
		}
	}
	
	public ThreeDShape selectThreeDShape()
	{
		
	}
}






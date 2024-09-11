package shape_project;

import java.util.*;
public class User {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		char p;
		
		do {
			
			int choice = g.selectShape();
			switch(choice)
			{
			 case 1:
				TwoDShape t1 = g.selectTwoDShape();
				t1.getArea();
				t1.getPerimeter();
				break;
				
			 case 2:
				 ThreeDShape t2 = g.selectThreeDShape();
				 t2.getVolume();
				 t2.getLateralSurfaceArea();
				 t2.getTotalSurfaceArea();
				 break;
				 
		     default:
		    	 System.out.println("Not Working");
			}
			
			System.out.println("Press Y/y to restart the Game Or Other Character to Exits !!");
			p=sc.next().charAt(0);
		} while(p=='Y' || p=='y');
		
		System.out.println("Thank You For Playing Game!!");
		System.out.println("See You Soon!!");
	}
}

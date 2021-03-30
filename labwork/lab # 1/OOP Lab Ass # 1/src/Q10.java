/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 10
	"Area and Radius of Circle"
	-------------------------------
*/

import java.util.Scanner;

public class Q10{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		float circum = 0.0f;
		boolean again = false;
		String choice = "";

		do{

			System.out.print("Enter the circumference : ");
			circum = input.nextFloat();

			Circle c1 = new Circle(circum);
			c1.setRadius( c1.CircumToRadius() );
			c1.setArea( c1.CalcArea() );
			
			System.out.println("\n**************Results**************\n");
			System.out.println("Circumference : " + c1.getCircum() );

			System.out.format("Radius         :%.3f %n",c1.getRadius());

			System.out.println("Area          : " + c1.getArea()   );
			System.out.println("\n***********************************\n");

			System.out.print("\nRun Application Again ? (y or n) :   ");
			choice = input.next();
	
			if(choice.equals("y"))
				again = true;
			else if(choice.equals("n"))
				again = false;
			else{
				System.out.println("Invalid Choice.Application is going to close.");
				again = false;
			}

		}while(again);

	}	// end of main

}	// end of class "Q10"


//===================================================================================================

class Circle{
	
	public final float pi = 3.14159f;
	private final float circumference;
	private float radius;
	private int area;

	Circle(float num){

		circumference = num;

	}	// end of constructor

//---------------------------------------------------------------------------

	float getCircum(){
		
		return circumference;

	}	// end of "getCircum"

//---------------------------------------------------------------------------

	float getRadius(){
		
		return radius;

	}	// end of "getRadius"

//---------------------------------------------------------------------------
	
	void setRadius(float num){
		
		radius = num;

	}	// end of "setRadius"

//---------------------------------------------------------------------------

	int getArea(){
		
		return area;

	}	// end of "getRadius"

//---------------------------------------------------------------------------
	
	void setArea(float num){
		
		area =(int) num;

	}	// end of "setRadius"
	
//---------------------------------------------------------------------------	

	float CircumToRadius(){

		return ( circumference / (2 * pi) );
	
	}	// end of "CircumToRadius"

//---------------------------------------------------------------------------

	float CalcArea(){
	
		return	(pi * (float)Math.pow(radius,2));

	}	// end of "CalcArea"

//---------------------------------------------------------------------------

}		// end of class Circle
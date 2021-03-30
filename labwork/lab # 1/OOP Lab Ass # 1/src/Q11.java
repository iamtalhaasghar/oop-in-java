/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 11
	"Quadratic Equations"
	-------------------------------
*/

import java.util.Scanner;

public class Q11 {

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";

		do{

			System.out.println("Quadratic Equation : a (x^2)+ b(x) + c = 0 \n");
			System.out.print("Enter \"a\" : ");
			float num1 = input.nextFloat();
			System.out.print("Enter \"b\" : ");
			float num2 = input.nextFloat();
			System.out.print("Enter \"c\" : ");
			float num3 = input.nextFloat();

			
			Quadratic q1 = new Quadratic(num1, num2, num3);
			
			q1.PrintRoots();

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


		System.out.println("End of Program!!!");

	}	// end of main

}	// end of class "Q11"

//==============================================================================

class Quadratic{

	final float a;
	final float b;
	final float c;

	float Root1;
	float Root2;
	float D;

	private DISC_TYPE eqType;


	enum DISC_TYPE{

		CASE1,		// "D" > 0
		CASE2,		// "D" = 0
		CASE3		// "D" < 0
	}

	Quadratic(float num1 ,float num2, float num3){
	
		a = num1;
		b = num2;
		c = num3;
	
	}	// end of constructor

//-----------------------------------------------------------------------------------------------	


	float FindDiscriminant(){
		
		return (float)(  (Math.pow(b,2)) - 4*(a)*(c) );


	}		// end of "Discriminant"

//-----------------------------------------------------------------------------------------------	

	private void DetermineType(){

		D = FindDiscriminant();

		if(D>0){
			eqType = DISC_TYPE.CASE1;
		}
		else if(D==0){
			eqType = DISC_TYPE.CASE2;		
		}
		else if(D<0){
			eqType = DISC_TYPE.CASE3;
		}

	}		// end of "DetermineType"

//-----------------------------------------------------------------------------------------------	

	private void FindRoots(){
		
		this.DetermineType();
		
		switch(eqType){
			
			case CASE1:
				
				Root1 = (float) ( ( (-b) + (float) Math.sqrt(D) ) / (2f*a)  );
				Root2 = (float) ( ( (-b) - (float) Math.sqrt(D) ) / (2f*a)  );	
				break;	

			case CASE2:

				Root1 = Root2 = -( b / (2f*a) );
				break;			

			case CASE3:
				
				Root1 = -( b / (2f*a) );
				Root2 = ( Math.abs(D) ) / (2f*a) ;
				break;


		}	// end of switch


	}	// end of "FindRoots"

//-----------------------------------------------------------------------------------------------	

	void PrintRoots(){
	
		FindRoots();

		System.out.println("*****************Results*****************\n");

		System.out.println("Quadratic Equation : " + a + " * (x^2) + "
			+ b +" * (x) + " + c + " = 0 \n");

		System.out.println("Discriminant : " + D );

		if (eqType==DISC_TYPE.CASE1){
			
			System.out.println("Roots are \"Real\" and \"Different\".\n");
			System.out.println("Root # 1 : " + Root1 );
			System.out.println("Root # 2 : " + Root2 );		
	
			System.out.format("Solution Set = { ( %.4f" , ( (Root1 < Root2) ? Root1 : Root2 ) ); 
			System.out.format(" , %.4f ) }%n" , ( (Root1 > Root2) ? Root1 : Root2 ));
		}

		else if (eqType==DISC_TYPE.CASE2){
			
			System.out.println("Roots are \"Real\" and \"Equal\".\n");
			System.out.println("Root # 1 : " + Root1 );
			System.out.println("Root # 2 : " + Root2 );		
	
			System.out.format("Solution Set = { ( %.4f ) } %n", Root1);
		}

		else if(eqType==DISC_TYPE.CASE3){

			System.out.println("Roots are imaginary.\n");
			System.out.format("Root # 1 : %.4f + %.4f i %n" , Root1 , Root2);
			System.out.format("Root # 2 : %.4f - %.4f i %n" , Root1 , Root2);

		}
		
		System.out.println("\n*****************************************");
		
	}	// end of "PrintRoots"


}	// end of class "Quadratic"

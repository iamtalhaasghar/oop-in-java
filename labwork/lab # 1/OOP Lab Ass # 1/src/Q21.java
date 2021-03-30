/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 21
	"Drawing Patterns side by side"
	-------------------------------
*/

import java.util.Scanner;
public class Q21{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";

		do{

			System.out.println("\n****************Drawing Patterns****************\n");
		
			System.out.println("What should be the size of each pattern ? ");
			System.out.print("Enter a number (2 to 10)  : ");
			
			int number = input.nextInt();
			
			System.out.println("\n");
			DrawPatterns(number);

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

//------------------------------------------------------------------------------

	static void DrawPatterns(int num){

		int size = num;
		
		int spaces1 = size - 1;
		int spaces2 = 0;
		int spaces3 = 0;
		int spaces4 = size - 1;

		int stars2 = size;
		int stars3 = size;
		

		for(int i=1; i<=size ; i++){
		
				// draws the first pattern
			for(int j = 1 ; j<=i ; j++){
						
				System.out.print("* ");
					
			}	// end of 1st inner for loop


			for(int k=1; k <= spaces1; k++)
				System.out.print("  ");
			
			spaces1--;
			
			//--------------------------------------------------

			System.out.print("\t");


				// draws the second pattern
			for( int m = 1 ; m<=stars2 ; m++ ){
				
				System.out.print("* ");

			}		// end of 2nd inner for loop

			stars2--;

			for(int n=1 ; n<=spaces2 ; n++)
				System.out.print("  ");
			
			spaces2++;

			//--------------------------------------------------

			System.out.print("\t");

			for(int r=1; r<=spaces3 ; r++)
				System.out.print("  ");

			spaces3++;

			for( int s = 1 ; s<=stars3; s++ ){

				System.out.print("* ");
				
			}		// end of 3rd inner for loop

			stars3--;

			//--------------------------------------------------

			System.out.print("\t");

			for(int p=1; p<=spaces4; p++)
				System.out.print("  ");

			spaces4--;

			for( int q = 1; q<=i ; q++){
				
				System.out.print("* ");


			}		// end of 4th inner for loop

			//--------------------------------------------------

			
			System.out.println();


		}		// end of for loop



	}	// end of "DrawPatterns"

}	// end of class "Q21"
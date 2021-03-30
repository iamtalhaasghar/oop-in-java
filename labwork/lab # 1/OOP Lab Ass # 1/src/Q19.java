/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 19
	"Value of pi"
	-------------------------------
*/

import java.util.Scanner;
public class Q19{

	static Scanner input = new Scanner(System.in);

	public static void main(String []args){


		boolean again = false;
		String choice = "";

		do{

			System.out.format("%n Approximate Value of pi is : %.10f %n", ValueOfPi());

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

//----------------------------------------------------------------------

	public static double ValueOfPi(){

	double total = 0d;
	char sign = '+';
	int count=0;
	
		for(int i=1 ; i<2_000_000 ; i+=2){

			switch(sign){

				case '+':
					total += ( ( 4d ) / ( i ) );
					sign = '-';
					break;
				case '-':			
					total -= ( ( 4d ) / ( i ) );
					sign = '+';
					break;
				default:
					System.out.println("This 'default case' should never execute!!!");	
			}
			
			count ++;
			
			if(count>376845 && count<376855 )
				System.out.println("Combination # "+ count +"  |  pi = " + total );

		}	// end of for loop
	
		return total;

	}	// end of "ValueOfPi"


}	// end of class "Q19"
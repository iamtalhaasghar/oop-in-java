/*
	-------------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 6
	"Convert Minutes to Days and Years"
	-------------------------------------
*/

import java.util.Scanner;

public class Q6{

	static Scanner input = new Scanner(System.in);

	public static void main(String []args){

		boolean again = false;	
	
	    do{
		double minutes;
		System.out.print("Enter Minutes : ");

		minutes =  input.nextDouble();
		
		double days = ConvertToDays(minutes);		// call to "ConvertToDays"
		double years = ConvertToYears(minutes);		// call to "ConvertToYears"


		// Printing the results

		System.out.println("\n**************Results**************\n");

		System.out.format("Minutes : %.3f %n",minutes);
		System.out.format("Days : %.3f %n",days);
		System.out.format("Years : %.5f %n",years);
		
		System.out.println("\n***********************************\n");
		
		System.out.print("Run Application Again ? (y or n) :   ");
		String choice = input.next();

		if(choice.equals("y"))
			again = true;
		else if(choice.equals("n"))
			again = false;
		else{
			System.out.println("Invalid Choice.Application is going to close.");
			again = false;
		}

	    }while(again);	// end of do...while..

		System.out.println("End of Program!!!");

	}	// end of body of "main"

//---------------------------------------------------------------------------

		// converts minutes to days
	static double ConvertToDays(final Double min){
		
		return( min / (60*24) );		
			

	}	// end of function "ConvertToDays"

//---------------------------------------------------------------------------

		// converts minutes into years
	static double ConvertToYears(final Double min){

		return( min / (365*24*60) );

	}	// end of function "ConvertToYears"
		


}	// end of body of class "Q6"
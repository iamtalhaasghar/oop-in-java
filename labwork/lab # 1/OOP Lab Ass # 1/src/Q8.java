/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 8
	"Temprature Conversions"
	-------------------------------
*/

import java.util.Scanner;

public class Q8{

	

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		double temprature;
		String choice = "";
		do{

			System.out.println("Main Menu: ");
			System.out.println("---------------------------\n");
			System.out.println("1 = Fahrenheit to Celcius");
			System.out.println("2 = Celcius to Fahrenheit");
			System.out.println("\n---------------------------");

			while( !( choice.equals("1") || choice.equals("2") ) ){
			
				System.out.print("Enter your choice ? :   ");
				choice = input.next();	
				
			}	// end of while
		
			System.out.print("\nEnter Temprature (0)"+
				( choice.equals("1") ? "F" : "C" )+
			 	"  :  ");		

			temprature = input.nextDouble();
			
			System.out.println("---------------------------\n");
			System.out.print("Temprature in (0)"+
				( choice.equals("1") ? "C" : "F" )+
				" is : ");

			switch(choice){

				case "1":
					System.out.format("%.2f%n",ToCelcius(temprature));
					break;

				case "2":
					System.out.format("%.2f%n",ToFahrenheit(temprature));
					break;							

			}	// end of switch
			

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


//--------------------------------------------------------------------

	static double ToCelcius(double F){

		return ( ((F-32d) * 5d) / 9d);

	}	// end of "ToCelcius"

//--------------------------------------------------------------------

		// converts celcius to Fahrenheit
	static double ToFahrenheit(double celcius){

		return ( (9d/5d) * celcius + 32d );

	}		// end of "ToFahrenheit"

//--------------------------------------------------------------------

}		// end of class "Q8"
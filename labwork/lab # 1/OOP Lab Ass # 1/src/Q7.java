/*
	----------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 7
	"Separate the digits of a number"
	----------------------------------
*/

import java.util.Scanner;

public class Q7{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);
		boolean again = false;
		int number = 0;

		do{
			
			System.out.print("Enter a number : ");
			number = input.nextInt();
			if(!Number.IsPositive(number)){

				System.out.println("Your number is negative.");
				System.out.println("It will be converted to corresponding"+
					" positive number.");

				number = Number.ToPositive(number);	
			}
			
			Number n1 = new Number(number);

			n1.digits = n1.ToDigits();

			System.out.println("\n**************Results**************\n");
			System.out.println("Number : " + n1.getNum());	
			System.out.println("Digits : "+ n1.NoOfDigits()+"\n");
			System.out.print("Digits are : ");
			n1.PrintDigits();
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

		}while(again);

		System.out.println("End of Program!!!");

	}	//end of main


	


}	// end of class "Q7"

// ================================================================================

class Number{

	private final int num;
	int digits[];

	Number(int n){

		num = n;

	}		// end of constructor


	int getNum(){
		
		return num;

	}		// end of "getNum"


//---------------------------------------------------------------------------

		// checks whether the given number is positive or not 
	static boolean IsPositive(final int n){

		if(n<0)
			return false;
		else 
			return true;
		
	}	// end of "IsPositive"

//---------------------------------------------------------------------------

		// converts negative number to to positive number
	static int ToPositive(final int n){

		if( !Number.IsPositive(n) )
			return (Math.abs(n));
		else 
			return (n);


	}		// end of "ToPositive"

//---------------------------------------------------------------------------

		// determine the number of digits of given number
	int NoOfDigits(){	
	
		int c_num = num;
		int digits = 0;

		if(c_num == 0)
			return 1;
	
		while( c_num > 0 ){
	
			c_num/=10;					
			digits++;

		}	// end of while

		return digits;

	}	// end of "NoOfDigits"

//---------------------------------------------------------------------------

	int[] ToDigits(){
		
		int c_num = num;

		int dig[] = new int[NoOfDigits()]; 
		
		for (int i = (dig.length) - 1  ; i >= 0 ; i-- ){

			dig[i] = c_num % 10;
			c_num /= 10;
	

		}		// end of for
	
		return dig; 

	}	// end of "ToDigits"

//---------------------------------------------------------------------------


		// Print digits of a number
	void PrintDigits(){
		
		for(int temp : digits){

			System.out.print(temp + " -: ");
			

		}	// end of foreach
		
	}		// end of "PrintDigits"



}		// end of class "Number"
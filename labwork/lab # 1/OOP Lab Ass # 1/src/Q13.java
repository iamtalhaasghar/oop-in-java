/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 13
	"Prime Numbers from 2 to 100"
	-------------------------------
*/

import java.util.Scanner;
public class Q13 {

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";
		int count;
		do{

			count =0;			

			for(int j=0; j<=100 ; j++){

				if(IsPrime(j)){

					System.out.format("\" %2d \" is a Prime Number.%n",j);
					count ++;
				}
			}		// end of for loop
			
			System.out.println("\nTotal Prime Numbers : "+count);

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

//--------------------------------------------------------------------------------
	
	public static boolean IsPrime(int num){

		if(num<2)
			return false;
		
		for(int i=2; i <=(num/2) ; i++){

			if(num%i==0)
				return false;

		}	// end of for loop

		return true;

	}	// end of "IsPrime"



}	// end of class "Q13 "
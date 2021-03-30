/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 23
	"Fibonacci Series"
	-------------------------------
*/

import java.util.Scanner;
public class Q23{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";

		do{


			System.out.println("The first 20 Fibonacci numbers are : \n");
			for(int i=1; i<=20 ; i++){

				System.out.format("Fib. ( %02d ) : %4d%n", i , FibonacciSeries(i));

			}
				
			System.out.print("\n\nThe average of first 20 fibonacci numbers is : ");
			System.out.println(FibonacciAverage(20) + "\n");

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

//--------------------------------------------------------------------------------------

	static int FibonacciSeries(int num){		

		if(num==1)
			return 1;
		if(num==2)
			return 1;

		return (FibonacciSeries(num-1)+FibonacciSeries(num-2));

	}

	static float FibonacciAverage(int n){
		
		float total = 0f;
		int count = 0;

		for(int i=1; i<=n ; i++){

			total += FibonacciSeries(i);
			count ++;
		}

		

		return (total/count);

	}
	

}	// end of class "Q23"
/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 18
	"Print Bar Charts"
	-------------------------------
*/

import java.util.Scanner;
public class Q18 {

	static Scanner input = new Scanner(System.in);

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";
		int numbers[];
		do{
			System.out.println("\n**************** Bar Charts ****************");

			System.out.println("Enter five Numbers : ");
			numbers = GetNumbers(5);

			System.out.println("\n>>>Graphical representation of given data :\n");
			PrintBarChart(numbers);			

			System.out.println("*********************************************");

			System.out.print("\nRun Application Again ? (y or n)    ");
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

//--------------------------------------------------------------------------

	static int[] GetNumbers(final int n){
	
		int num[] = new int[n];

		for(int i=0; i<num.length ; i++){

			System.out.print((i+1)+" ) : ");
			num[i]=input.nextInt();			

		}		// end of for loop

		return num;

	}	// end of "GetNumbers"

//----------------------------------------------------------------------------

	static void PrintBarChart(final int temp[]){
		
		for(int i=0 ; i<temp.length; i++){

			System.out.format("%d) - ( %2d ) : ",(i+1),temp[i]);
			
			for(int j=0 ; j<temp[i] ; j++){
				
				if( (j!=0) && ((j+1)%5==0) ){
					System.out.print(" | ");	
				}
				else{
					System.out.print(" * ");
				}
			
			}	// end of inner for loop

			System.out.println();

		}	// end of outer for loop


	}	// end of "PrintBarChart"



}	// end of class "Q18"
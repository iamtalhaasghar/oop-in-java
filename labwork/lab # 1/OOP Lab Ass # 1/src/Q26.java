/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 26
	"Multiplication Table"
	-------------------------------
*/

import java.util.Scanner;
public class Q26{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";

		do{

			System.out.println("\n\n*******************Multiplication Table*******************\n\n");
		
			MultiplicationTable();
			
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

//--------------------------------------------------------------------------

	public static void MultiplicationTable(){


		for(int i=0; i<10 ; i++){
		
			
			System.out.print((i==0) ? " * | " : "" );
			System.out.print((i==1) ? "---------------------------------------\n" : "");
			System.out.format( (i!=0) ? (" %d | ")  : "" , i);
			
			for(int j=1 ; j<10 ; j++){
				
				if(i==0)
					System.out.format("%2d  ",(j));
				else
					System.out.format("%2d  ",(i*j));	

			}
			
			System.out.println();

		}


	}		// end of "MultiplicationTable"

	

}	// end of class "Q26"
/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 25
	"CheckBoard Pattern"
	-------------------------------
*/

import java.util.Scanner;
public class Q25{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";

		do{
		
			System.out.println("\n*****************Printing the CheckBoard Pattern*****************\n\n");
			PrintCheckBoard();

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

//------------------------------------------------------------------

	static void PrintCheckBoard(){

		int size = 7;
		char ch ;

		for(int i=0; i<size; i++ ){

			if(i%2==0)
				ch = '#';
			else
				ch = ' ';
				
			for(int j=0; j< size*2 ; j++){
			
				System.out.print(ch);
				
				if(ch==' ')
					ch = '#';
				else
					ch = ' ';
						
			}
			
			System.out.println();
	
		}

	}		// end of "PrintCheckBoard"




}	// end of class "Q25"
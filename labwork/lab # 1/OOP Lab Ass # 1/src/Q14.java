/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 14
	"Printing the Grid using Array"
	-------------------------------
*/

import java.util.Scanner;
public class Q14 {

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";
		
		char Grid[][];

		do{

			System.out.print("Enter Vertical Length of Grid : ");
			int rows = input.nextInt();			

			System.out.print("Enter Horizontal Length of Grid : ");
			int col = input.nextInt();
				
			Grid = MakeGrid(rows,col);

			PrintGrid(Grid);

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

//---------------------------------------------------------------------------------------------

	static char[][] MakeGrid(final int num1, final int num2){
			
		char  Pattern[][] = new char [num1][num2];

		for(int i=0 ; i < Pattern.length ; i++){
			for(int j = 0 ; j < Pattern[i].length ; j++){
	
				if(j%2==0)
					Pattern[i][j] = ' ';
				else if(j%2==1)
					Pattern[i][j] = '-';
				
			}

		}
		
		return Pattern;

	}	// end of "Make Grid"

//---------------------------------------------------------------------------------------------

	static void PrintGrid(final char PrintPattern[][]){

		for(char ch1[] : PrintPattern){
			for(char ch : ch1){

				System.out.print(ch);
		
			}

			System.out.println();

		}

	}	

}	// end of class "Q14 "
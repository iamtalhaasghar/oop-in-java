/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 15
	"Calculating Average using array"
	-------------------------------
*/

import java.util.Scanner;
public class Q15 {

	
	static Scanner input = new Scanner(System.in);	

	public static void main(String []args){


		boolean again = false;
		String choice = "";
		int num=0;
		float numbers[];

		do{
			System.out.println("\n*********************\"Calculating Average\"*********************\n");
			

			System.out.print("How many Numbers are there ? : ");
			num = input.nextInt();
			
			System.out.println("Enter numbers : ");
			numbers = GetNumbers(num);
			CalcAvg(numbers);
			System.out.println("\n****************************************************************");
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

//-----------------------------------------------------------------------------
		
	static float[] GetNumbers(int n){

		float nums[] = new float[n];
	
		for(int i=0 ; i<nums.length ; i++){
			
			System.out.format("%2d )  : ",(i+1));
			nums[i]= input.nextFloat();

		}	// end of for loop

		return nums;		

	}		// end of "GetNumbers"


//-----------------------------------------------------------------------------

	static void CalcAvg(float num[]){

		float total = 0f;

		for(float temp : num){
		
			total+=temp;
		
		}		// end of for loop

		System.out.print("Numbers entered : ");

		for(float temp : num){
		
			System.out.print(temp +" ,");

		}		// end of for loop

		System.out.println("\n>>>>Average is : "+ (total/num.length));

	}	// end of "PrintNumbers"

}	// end of class "Q15 "
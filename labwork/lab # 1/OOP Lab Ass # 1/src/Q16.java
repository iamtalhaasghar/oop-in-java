/*
	---------------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # Q16
	"Search an element in the given Array"
	---------------------------------------
*/

import java.util.Scanner;
public class Q16 {

	static Scanner input = new Scanner(System.in);

	public static void main(String []args){

		

		boolean again = true;
		String choice = "";
		int nums[];
		do{
	
			System.out.println("\n*****************Searching of a Number in Array*****************");
		
			System.out.print("Elements to store in array?   :  ");
			int num = input.nextInt();

			nums = GetNumbers(num);

			again = true;

			while(again){
				
				System.out.print("Number to search in array?        : ");
				num = input.nextInt();
				
				IsAt(nums,num);
			
				System.out.print("\n\nSearch something else?  (y or n)  : ");
				choice = input.next();
				
				if(choice.equals("y"))
					again = true;
				else if(choice.equals("n"))
					again = false;
				else{
					System.out.println("Invalid Choice!! Searching ended!!!");
					again = false;
				}
			}

			System.out.println("\n****************************************************************");	

			System.out.print("\n\nRun Application Again ? (y or n) :   ");
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

//------------------------------------------------------------------------

		// get numbers from user

	static int[] GetNumbers(final int num){
	
		int numbers[] = new int[num];

		for(int i=0; i<numbers.length ; i++){

			System.out.format("%2d ) : ",(i+1));
			numbers[i]=input.nextInt();			

		}		// end of for loop

		return numbers;

	}	// end of "GetNumbers"


//------------------------------------------------------------------------

	private static boolean Search(final int num[], final int n){

		for(int temp : num){

			if(temp==n)
				return true;

		}		// end of for each	

		return false;

	}	// end of "Search"


//------------------------------------------------------------------------

	static void IsAt(final int num[], int n){

		if(Search(num,n)){

			System.out.print("The number\" "+n+" \" is at serial # :  ");

			for (int i=0 ; i<num.length ; i++){
				if(num[i]==n)
					System.out.print((i+1)+" ,");

			}	// end of inner for

		}	// end of if....statement

		else{
			System.out.println("The number \" "+n+" \" does not exists in the given array.");

		}	// end of else..
			

	}	// 	end of "IsAt"


}	// end of class "Q16 "
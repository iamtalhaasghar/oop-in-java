/*
	---------------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # Q17
	"Find and Replace an Item in an Array"
	---------------------------------------
*/

import java.util.Scanner;
public class Q17 {

	static Scanner input = new Scanner(System.in);

	public static void main(String []args){

		

		boolean again = true;
		String choice = "";
		int nums[];
		do{
	
			System.out.println("\n*****************Find and Replace Numbers in Array*****************");
		
			System.out.print("Elements to store in array?   :  ");
			int num = input.nextInt();

			nums = GetNumbers(num);

			again = true;

			while(again){
				
				System.out.print("Number to replace in array?        : ");
				num = input.nextInt();
				
				if(Search(nums,num)){

					System.out.print("Enter the new number ?     :  ");
					int new_num = input.nextInt();

					Replace(nums,num,new_num);

					System.out.println("*******************");
					System.out.println("Updated Array : ");
					PrintArray(nums);
				}
				else{
			
					System.out.println("The number \" "+ num +" \" does "+
						"not exists in the given array.");	

				}				
			
				System.out.print("\nReplace something else?  (y or n)  : ");
				choice = input.next();
				
				if(choice.equals("y"))
					again = true;
				else if(choice.equals("n"))
					again = false;
				else{
					System.out.println("Invalid Choice!! Process ended!!!");
					again = false;
				}
			}

			System.out.println("\n**********************************************************");	

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

			System.out.printf("%2d ) : ",(i+1));
			numbers[i]=input.nextInt();			

		}		// end of for loop

		return numbers;

	}	// end of "GetNumbers"


//------------------------------------------------------------------------

	static boolean Search(final int num[], final int n){

		for(int temp : num){

			if(temp==n)
				return true;

		}		// end of for each	

		return false;

	}	// end of "Search"


//------------------------------------------------------------------------

	private static int IsAt(final int num[], int n){

		if(Search(num,n)){

			for (int i=0 ; i<num.length ; i++){

				if(num[i]==n)
					return i;

			}	// end of inner for

		}	// end of if....statement

		else{

			System.out.println("The number \" "+n+" \" does not exists in the given array.");
			System.out.println("Warning : Index '-1' is being returned.");			

		}	// end of else..
			
		return -1;		

	}	// 	end of "IsAt"

//--------------------------------------------------------------------------------

	static void Replace(final int num[], final int old ,final int new_number){
		
		if(Search(num,old)){

			int index = IsAt(num,old);
			num[index] = new_number;	
			System.out.println("Update Successful!!");			
		}		


	}		// end of ""Replace"

//--------------------------------------------------------------------------------

	static void PrintArray(int num_arr[]){

		for(int i=0 ; i<num_arr.length ; i++){

			System.out.format("%2d ) : %d %n",(i+1),num_arr[i]);

		}		// end of for loop
				

	}	// end of "PrintArray"



}	// end of class "Q17 "
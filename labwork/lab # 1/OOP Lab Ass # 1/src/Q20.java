/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 20
	"Drawing Patterns"
	-------------------------------
*/

import java.util.Scanner;
public class Q20{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";

		do{
			
			MainMenu();

			System.out.print("\n\nEnter your choice :  ");
			choice = input.next();

			switch(choice){

				case "0":
					PatternA();
					PatternB();
					PatternC();
					PatternD();
					PatternE();
					PatternF();
					PatternG();
					PatternH();
					PatternI();
					break;

				case "1" :
					PatternA();
					break;

				case "2" :
					PatternA();
					break;

				case "3" :
					PatternC();
					break;

				case "4" :
					PatternD();
					break;

				case "5" :
					PatternE();
					break;

				case "6" :
					PatternF();
					break;
				
				case "7" :
					PatternG();
					break;
				
				case "8" :
					PatternH();
					break;

				case "9" :
					PatternI();
					break;

				default :
					System.out.println("Invalid Input!!!");


			}
		
		
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

//--------------------------------------------------------------------------------------------

	static void MainMenu(){

		System.out.println("*****************Main Menu*****************\n");
		System.out.println("0) Draw All Patterns");
		System.out.println("1) Triangle # 1 ");
		System.out.println("2) Triangle # 2 ");
		System.out.println("3) Triangle # 3 ");
		System.out.println("4) Triangle # 4 ");
		System.out.println("5) Hollow Square");
		System.out.println("6) Inversed \"Z\" ");
		System.out.println("7) \"Z\" of #`s ");
		System.out.println("8) Sand Hour Glass ");
		System.out.println("9) Square with Diagonals ");

	}	// end of "MainMenu"

//--------------------------------------------------------------------------------------------

	static void PatternA(){

		System.out.println("\n**************Pattern # 1**************\n");
		
		for(int i=0; i<=8 ; i++ ){
			for(int j=0 ; j<i ; j++){
				System.out.print("# ");	
			}		

			System.out.println();
		
		}
		
	}	//	 end of "PatternA"

//--------------------------------------------------------------------------------------------
	
	static void PatternB(){

		System.out.println("\n**************Pattern # 2**************\n");
		
		for(int i=8; i>0 ; i--){
			for(int j=0; j<i; j++){
				System.out.print("# ");	
		
			}

			System.out.println();
		}

	}	//	 end of "PatternB"

//--------------------------------------------------------------------------------------------

	static void PatternC(){

		System.out.println("\n**************Pattern # 3**************\n");

		int spaces=0;

		for(int i=8; i>0 ; i--){

			for(int j=0 ; j< spaces ; j++){

				System.out.print(" ");

			}

			spaces+=2;

			for(int k=0 ; k<i ; k++){
				
				System.out.print("# ");

			}
		
			System.out.println();

		}	


	}	//	 end of "PatternC"

//--------------------------------------------------------------------------------------------

	static void PatternD(){

		System.out.println("\n**************Pattern # 4**************\n");

		int spaces = 8*2;

		for(int i=0; i<=8 ; i++){

			for(int j=0 ; j < spaces ; j++){

				System.out.print(" ");

			}

			spaces-=2;
			
			for(int k=0; k<i ; k++){

				System.out.print("# ");				

			}	
		
			System.out.println();		

		}			

	}	//	 end of "PatternD"	

//--------------------------------------------------------------------------------------------
	
	static void PatternE(){

		System.out.println("\n**************Pattern # 5**************\n");


		int spaces = (8*2)-4;
		int stars = 8;

		for(int i=0 ; i<8 ; i++ ){

			if(i==0 || i==7){
				
				for(int j=0 ; j<stars; j++){
				
					System.out.print("# ");
				}

			}			
			else {
				
				System.out.print("# ");

				for(int k=0 ; k<spaces; k++){
					
					System.out.print(" ");

				}
				
				System.out.print("# ");
			}		

		
			System.out.println();
		}


	}	// end of "PatternE"
	
//--------------------------------------------------------------------------------------------
		
	static void PatternF(){
		
		System.out.println("\n**************Pattern # 6**************\n");

		for(int i=0; i<8 ;i++){

			if(i==0 || i==7){
				
				for(int j=0 ; j<8; j++){
				
					System.out.print("# ");
				}

			}
			else{
				for(int j=0 ; j<8 ; j++){
					
					if(j==i)
						System.out.print("# ");

					else
						System.out.print("  ");


				}				
			
			}


			System.out.println();


		}		



	}	// end of "PatternF"	


//--------------------------------------------------------------------------------------------

	static void PatternG(){

		System.out.println("\n**************Pattern # 7**************\n");

		for(int i=8-1; i>=0; i--){
			
			if(i==0 || i==7){
				
				for(int j=0; j<8 ; j++){

					System.out.print("# ");

				}
			}
			else{

				for(int k=0 ; k<8 ; k++){

					if(i==k){
					
						System.out.print("# ");

					}
					else{
						System.out.print("  ");

					}

				}
				
			}
			
			System.out.println();

		}



	}	// end of "PatternG"	




//--------------------------------------------------------------------------------------------
	
	static void PatternH(){

		System.out.println("\n**************Pattern # 8**************\n");
		
		for(int i=0; i<7; i++){


			if(i==0 || i==6){

				for(int j=0; j<7 ; j++){
					System.out.print("# ");
				}
			}
			else{
				for(int k=0 ; k<7 ; k++){
				
					boolean condition = true;
					if(i==k){
	
						if(i==3){
							System.out.print("# ");
							continue;
						}
						else
							System.out.print("# ");
						condition = false;
					}
					
					if(i==6-k){
						System.out.print("# ");
						condition = false;
					}
					if(condition)
						System.out.print("  ");	

				}

			}

			System.out.println();

		}
		



	}	// end of "PatternH"



//--------------------------------------------------------------------------------------------

	static void PatternI(){

		System.out.println("\n**************Pattern # 9**************\n");
		
		boolean condition = false;

		for(int i=0; i<7; i++){


			if(i==0 || i==6){

				for(int j=0; j<7 ; j++){
					System.out.print("# ");
				}
			}
			else{
 
				System.out.print("# ");
				condition = false;

				for(int k=0 ; k<6 ; k++){
				
					
					if(i==k){
	
						if(i==3){
							System.out.print("# ");
							continue;
						}
						else
							System.out.print("# ");
						condition = false;
					}
					
					if(i==6-k){
						System.out.print("# ");
						condition = false;
					}
					if(condition)
						System.out.print("  ");	
					
					condition = true;

				}	// end of inner for loop

				System.out.print("# ");

			}	// end of else`s body

			System.out.println();

		}	// end of outermost for loop 
		

	}	// end of "PatternI"



//--------------------------------------------------------------------------------------------

}	// end of class "Q20"
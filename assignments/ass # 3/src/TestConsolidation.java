/*====================================================================================================
	
					QUESTION NUMBER # 6 [PART-B]

======================================================================================================*/




import java.util.Scanner;


public class TestConsolidation{
		

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		String name = "";
	
		System.out.print("Enter name of Account # 1 : ");
		name = input.nextLine();

		Account a1 = new Account(100,name);

		System.out.print("Enter name of Account # 2 : ");
		name = input.nextLine();

		Account a2 = new Account(100,name);
		
		System.out.print("Enter name of Account # 3 : ");
		name = input.nextLine();

		Account a3 = new Account(100,name);
		
		a1.printSummary();
		a2.printSummary();
		a3.printSummary();

		a1.close();
		
		Account a4 = Account.consolidate(a2,a3);	

		a1.printSummary();
		a2.printSummary();
		a3.printSummary();

		if(a4!=null)
			a4.printSummary();		

	}


}		// end of class "TestConsolidation"
                                                                                                                                                                                                                                    : between 25 and 29.9    ");
		System.out.println("Obese       : 30 or Greater          ");


	}


}		// end of class "BMI"





/*====================================================================================================
	
				QUESTION NUMBER # 2

======================================================================================================*/




import java.util.Scanner;

public class BMI{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		float weight = 0f;
		float height = 0f;
		float bmi = 0F;
		String choice = "";
		
		while( !(choice.equals("1") || choice.equals("2")) ){
			
			System.out.println("Please Select the System of Units : ");
			System.out.println("1 = SI units (height in meters, weight in kgs)");
			System.out.println("2 = FPS units (height in Inches, weight in Pounds)");

			System.out.print("? : ");
			choice = input.nextLine();
			System.out.println();

			if(choice.equals("1")){
			
				do{
					System.out.print("Enter your weight (in kgs) : ");
					weight = input.nextFloat();

				}while(weight<=0);
				
				do{
					System.out.print("Enter your height (in meters) : ");
					height = input.nextFloat();

				}while(height<=0);
		
				bmi = calcBMI(weight, height);

			}
		
			else if(choice.equals("2")){

				do{
					System.out.print("Enter your weight (in Pounds) : ");
					weight = input.nextFloat();

				}while(weight<=0);

				do{
					System.out.print("Enter your height (in inches) : ");
					height = input.nextFloat();

				}while(height<=0);
				
				bmi = calcBMI( weight*703 , height);

			}

			else{

			System.out.println("Invalid Input!!!");			

			}
		}

		System.out.printf("\nYour BMI is : %.3f %n", bmi);

		System.out.printf("You are : " + BMICategory(bmi));

		printBMIChart();

		
	}	// end of "main"


	private static float calcBMI(float w, float h){
	
		return (float) ( w / Math.pow(h,2) );

	}

	private static String BMICategory(float num){

		String category = "";

		if(num >= 30)
			category = "Obese";			
		else if (num >= 25 && num <= 29.9 )
			category = "Overweight";
		else if (num >= 18.5 && num <= 24.9 )
			category = "Normal";
		else if (num < 18.5)
			category = "Underweight";
		
		return category;


	}


	public static void printBMIChart(){


		System.out.println("\n\n*****************BMI Chart*****************\n");
		System.out.println("Underweight : less than 18.5         ");
		System.out.println("Normal      : between 18.5 and 24.9  ");
		System.out.println("Overweight  : between 25 and 29.9    ");
		System.out.println("Obese       : 30 or Greater          ");


	}


}		// end of class "BMI"
                                                                                                                                                                                                                                           **********************Grade Report************************\n");
		
		System.out.printf("%-15s %-15s %-20s %-9s %-7s %n%n","Student Name","Course Name",
			"Assignment Marks","Average","Grade");

		for(int i=0; i<gradings.length; i++){

			System.out.printf("%-15s ",gradings[i].getName());
			System.out.printf("%-15s ",gradings[i].getCourseName());

			for(int temp : gradings[i].assgnMarks){

				System.out.printf("%-3d ",temp);

			}
			
			System.out.printf(" %-3.2f ",gradings[i].calcAvg());
			System.out.printf(" %7s ",gradings[i].calcGrade());


			System.out.println();
		}
		
		System.out.println("\n*******************Max & Min Marks*******************\n");

		System.out.printf("%-15s %-15s %-15s %-15s %n%n","Student Name","Course Name",
			"Max Marks","Min Marks");

		int max = gradings[0].maxMarks();
		int min = gradings[0].minMarks();

		for(int i=0; i<gradings.length; i++){

			System.out.printf("%-15s ",gradings[i].getName());
			System.out.printf("%-15s ",gradings[i
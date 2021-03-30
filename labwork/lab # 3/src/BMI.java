import java.util.Scanner;
public class BMI
{
	public static void main(String []args)
	{	
		Scanner input = new Scanner(System.in);
		
		double weight = 0d;
		double height = 0d;
		double bmi = 0d;	
	
		System.out.print("Enter your weight in pound : ");
		weight = input.nextDouble();
		

		System.out.print("Enter your height in inches : ");
		height = input.nextDouble();

		bmi = ( weight * (0.45359237D) ) / ( height *  height * 0.0254D * 0.0254D );
 
		System.out.println("Your BMI is : " + bmi);

	}






}
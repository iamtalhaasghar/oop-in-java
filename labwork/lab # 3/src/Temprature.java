import java.util.Scanner;
public class Temprature
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);		

		double TempF = 0d;
		double TempC = 0d;

		System.out.print("Enter the temprature in Farhenreit : ");
		TempF = input.nextDouble();

		TempC = (TempF - 32D) * (5D / 9D);
		
		System.out.println("Temprature " + TempF + " (0)F " +
				 " = " + TempC +" (0)C " );

	}


}
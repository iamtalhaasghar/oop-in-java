import java.util.Scanner;
public class Power
{
	public static void main(String []args)
	{
		int BaseNumber = 0;
		int PowerNumber = 0;
		Scanner input= new Scanner(System.in);
	
		System.out.print("Enter the base : ");
		BaseNumber=input.nextInt();

		System.out.print("Enter the Exponent : ");
		PowerNumber = input.nextInt();

		int result= Power.power(BaseNumber,PowerNumber);

		System.out.print(BaseNumber + " raised to  power " + PowerNumber );
		System.out.println(" gives = "+ result);

	}
	

	// function power to calculate power

	static int power(int base, int power)
	{
		int result=1;
		for(int i=0; i<power; i++)
		{
			result*=base;	
			
		}
		
		return result;

	}



}
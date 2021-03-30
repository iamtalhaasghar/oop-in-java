import java.util.Scanner;
public class CreditLimit
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);	
		Customer C1 = new Customer();
			

		System.out.print("Enter your account Number :   ");
		C1.accountNumber = input.nextInt();

		System.out.print("Enter Balance at beginning of month :   ");
		C1.beginBalance = input.nextInt();

		System.out.print("Enter Total Charges :   ");
		C1.charges = input.nextInt();

		System.out.print("Enter Total Credits : ");
		C1.credit = input.nextInt(); 
	

		C1.CalcNewBalance();
		
		C1.CheckCredit();

				
	}

}


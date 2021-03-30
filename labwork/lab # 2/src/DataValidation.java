import java.util.Scanner;
public class DataValidation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int number;
		
		do{		
			System.out.print("Enter the Number : ");
			number = input.nextInt();

		}while(!(number==1 || number==2));		
			

	}

}
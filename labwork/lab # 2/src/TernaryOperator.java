import java.util.Scanner;
public class TernaryOperator
{
	public static void main(String []args)
	{
		String output;
		Scanner input = new Scanner(System.in); 

		System.out.print("Please Enter a Number :	 ");
		int number = input.nextInt();
	

		output = ((number>=10) ? "Winner!" : "Loser!"); 
		
		System.out.println(output);		

	}



}
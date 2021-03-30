import java.util.Scanner;
public class ScannerDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String output="  ";
		
		int num;
		float fnum;
		String temp;
		
		num = input.nextInt();
		output += num; 

		temp = input.next();
		output += " " + temp + " ";
		
		num = input.nextInt();
		output += num; 		

		temp = input.next();
		output += " " + temp + " ";


		fnum = input.nextFloat();
		output += fnum;

		temp = input.next();
		output += " " + temp + " ";

		temp = input.next();
		output += " " + temp + " ";

		num = input.nextInt();
		output += num; 

		temp = input.next();
		output += " " + temp + " ";

		temp = input.next();
		output += " " + temp + " ";

		
		System.out.println(output);


	}


}
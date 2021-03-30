import java.util.Scanner;

public class Pattern
{
	public static void main(String []args)
	{
		int size =0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of Triangle : ");
		size = input.nextInt();

		drawTriangle(size);

	}
	
	static void drawTriangle(int number)
	{
		for(int i=0 ; i<= number ; i++ )
		{
			for(int j=0 ; j<i ; j++)
				System.out.print("*");
			
			System.out.println();			


		}
	}

}
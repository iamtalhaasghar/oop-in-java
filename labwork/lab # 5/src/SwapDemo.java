import java.util.Scanner;
class Swap
{
	int num1;
	int num2;	


	Swap(int x, int y)
	{	
		num1=x;
		num2=y;	

	}

	void SwapVar()
	{
		int temp=num1;
		num1=num2;
		num2=temp;

	}

	void PrintNumbers()
	{	
		System.out.println(num1 + " and " + num2 + " .");		

	}	
	

}

//...................................................

public class SwapDemo
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt(); 

		Swap SwapA = new Swap(a,b);
		System.out.print("The numbers before swapping are : ");
		SwapA.PrintNumbers();
	
		SwapA.SwapVar();

		System.out.print("The numbers after swapping are : ");
		SwapA.PrintNumbers();

	}

}


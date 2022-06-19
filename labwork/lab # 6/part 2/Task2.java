import java.util.Scanner;

class A
{
  final int a;
	A(int x)
	{
		System.out.println("Calling constructor to initialize value of instance variable.");
		a=x;

	}
	void display()
	{
		System.out.print("Initialized Value of 'a' using constructor: " + a);
	}
}



class Task2
{
  public static void main(String args[])
  {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	
	int x = input.nextInt();
	
	A obj = new A(x);
	obj.display();
  }
}
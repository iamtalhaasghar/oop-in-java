import java.util.Scanner;
class MinimumDouble
{
	double num1;
	double num2;
	double num3;
	double num4;
	double small;
		

	MinimumDouble(double a, double b, double c, double d)
	{
		num1=a;
		num2=b;
		num3=c;
		num4=d;
		
	}

	double getMinimum()
	{	
		double temp1 = Math.min(num1,num2);
		double temp2 = Math.min(num3,num4);	
		small = Math.min(temp1, temp2);
		return small;

	}

}

class MinimumDoubleDemo
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		double w,x,y,z;
		System.out.print("Enter 1st number : ");		
		w = sc.nextDouble();

		System.out.print("Enter 2nd number : ");		
		x = sc.nextDouble();

		System.out.print("Enter 3rd number : ");		
		y = sc.nextDouble();

		System.out.print("Enter 4th number : ");		
		z = sc.nextDouble();

		MinimumDouble miniObj = new MinimumDouble(w,x,y,z);
		
		System.out.print(" The Smallest number from given number is : ");
		System.out.println(miniObj.getMinimum());
	

	}
}
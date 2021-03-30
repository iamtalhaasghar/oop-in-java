import java.util.Scanner;
class Minimum3
{
	float num1;
	float num2;
	float num3;
	float small;
		

	Minimum3(float a, float b, float c)
	{
		num1=a;
		num2=b;
		num3=c;
		
	}

	float getMinimum()
	{	
		float temp = Math.min(num1,num2);
		small = Math.min(temp,num3);	
		return small;

	}

}

class Minimum3Demo
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		float x,y,z;
		System.out.print("Enter 1st number : ");		
		x = sc.nextFloat();

		System.out.print("Enter 2nd number : ");		
		y = sc.nextFloat();

		System.out.print("Enter 3rd number : ");		
		z = sc.nextFloat();

		Minimum3 miniObj = new Minimum3(x,y,z);
		
		System.out.print(" The Smallest number from given number is : ");
		System.out.println(miniObj.getMinimum());
	

	}
}
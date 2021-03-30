import java.util.Scanner;
class Overloading
{

	void test()
	{
		System.out.println("This fun. does not have any return type and "+
		" takes no argument!!!");	
	}

	void test(int a)
	{
		System.out.println("This fun. do not have any return type and "+
		" takes one int argument!!! :- " + a );	
	}

	void test(int a , int b)
	{
		System.out.println("This fun. does not have any return type and "+
		" takes two int arguments!!! :- "+ a + " and " + b);	
	}

	int test(int a , int b)
	{
		System.out.println("This fun. does has int return type and "+
		" takes two int argument!!! :- " );
		return (a+b);	
	}

	double test(double a)
	{
		System.out.println("This fun. has a double return type and "+
		" takes one double argument!!! :- " + a);
		return (a*10.0);	
	}
	void test(int a, float b)
	{
		System.out.println("This fun. does not have any return type and "+
		" takes one int and one float argument!!!:- " + a +" ---- "+ b);	
	}

	void test(float a, int b)
	{
		System.out.println("This fun. does not have any return type and "+
		" takes one float and one int argument!!!:- " + a +" ---- "+ b);	
	}





}


class DemoOverloading
{
	public static void main(String args[])
	{
		int num;
		float fnum;
		double dnum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a int : ");
		num = sc.nextInt();

		System.out.print("Enter a float : ");
		fnum = sc.nextFloat();

		System.out.print("Enter a double : ");
		dnum = sc.nextDouble();

		Overloading Load = new Overloading();		

		Load.test();
		Load.test( num);
		Load.test(num, num*2);
		
		double temp = Load.test(dnum);
		System.out.println("This function returned a double number : " + temp+"\n\n\n");
		
		Load.test(num, fnum);
		Load.test(fnum,num);


	}

}
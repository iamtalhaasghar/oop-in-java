public class TypeConversion
{
	public static void main(String []args)
	{
		int i = 3;
		double d;

		d=i;
		
		System.out.println("Implicit conversion");
		System.out.println("i = "+ i + " , d = " + d );
		d=(double)i;

		System.out.println("Explicit conversion");
		System.out.println("i = "+ i + " , d = " + d );

		double varA=55;
		double varB=0;    

		System.out.println("value of varA : " + varA);   
		
		System.out.println("value of varB : " + varB); 

	}

}                                                                                                                                                                                       
public class CozaLozaWoza
{
	public static void main(String []args)
	{
		
		CozaLozaWoza.ToungeTwister();


	}

	static void ToungeTwister()
	{	
		boolean PrintLine =false;
		for(int i = 1 ; i<=100 ; i++)
		{
			if(PrintLine)
			{
				System.out.println();
				PrintLine = false; 
			}
			if(i%11==0)
			{	
				PrintLine=true;
			}
			if(i%3==0)
				System.out.print(" Coza ");
			else if(i%5==0)
				System.out.print(" Loza ");
			else if(i%7==0)		
				System.out.print(" Woza ");
			else
				System.out.print(" "+i+" ");
		}

	}


}
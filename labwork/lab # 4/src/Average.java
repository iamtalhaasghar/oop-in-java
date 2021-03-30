public class Average
{
	public static void main(String []args)
	{
		int num[]= {23,6,47,35,2,14};
		double result=0d;
		
		for(int temp : num)
		{
			result+=temp;

		}

		System.out.println("Average = " +  (result/6));


	}


}
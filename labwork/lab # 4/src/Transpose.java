public class Transpose
{
	public static void main(String []args)
	{
		int num[][] = { {1,2,3},
				{3,4,5}  };
		int result[][]= new int[3][2];
	
		for(int i=0; i<2 ; i++)
		{
			
			for(int j=0; j<3 ; j++)
			{

				result[j][i]=num[i][j];

			}
		}

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2 ; j++)
			{
				System.out.print(result[i][j]+ "    ");

			}
			System.out.println();
		}

	}


}
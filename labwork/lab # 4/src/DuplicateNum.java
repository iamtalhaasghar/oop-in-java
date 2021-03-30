import java.util.Scanner;
public class DuplicateNum
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
	
		int num[] = new int[6];

		System.out.println("Enter the elements of Array : ");

		for(int i = 0; i< 6 ; i++)
		{
			
			System.out.print( (i) +")    ");
			num[i] = input.nextInt(); 

			while(!(num[i]>=10 && num[i]<=100))
			{
				System.out.println("Input Data is Out of Range! Enter Element again.");
				System.out.print( (i) +")    "); 
				num[i] = input.nextInt(); 
			}


			for( int j=i-1; j>=0 ; j--)
			{
				while(num[i]==num[j])
				{
				
				   System.out.println("Invalid Input! Enter Number again.");
				   do{
					System.out.print( (i) +")    "); 
					num[i] = input.nextInt(); 

				   }while(num[i]<10 || num[i]>100);

				   j = i - 1;					
				}
			}			



		}

		System.out.println("Elements of Array are : ");

		for( int i=0 ; i<6 ; i++)
		{
			System.out.print( (i) +")    "); 
			System.out.println(num[i]);
			

		}

		

	}



}
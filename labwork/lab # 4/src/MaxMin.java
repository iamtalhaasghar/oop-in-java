public class MaxMin
{
	public static void main(String []args)
	{
		int numbers[] = {23,6,47,35,2,14};
			
		int largest= numbers[0];
		int smallest= numbers[0];
	
		for(int temp: numbers)
		{
			if(temp>largest)	
				largest = temp;
			if(temp<smallest)		
				smallest = temp;
		}
	
		System.out.println("Smallest number is : " + smallest);
		System.out.println("Largest number is : " + largest);

	}


}
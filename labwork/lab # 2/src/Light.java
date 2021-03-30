public class Light
{
	public static void main(String [] args)
	{
		int seconds; 

		long distance; 

		int days = 1_000;

		long lightspeed = 186_000;
			
		seconds = days * 24 * 60 * 60;

		distance = lightspeed * seconds;

		System.out.println("Time in seconds(days int) is : " + seconds);
		System.out.println("The distance will be : " + distance);		


	}
	



}



public class TypeCast
{
	public static void main(String args[])
	{
		int myInt=123;
		double myDouble =123.0;
		String myStr = "123";
		String txtStr ="Hello World!";
	
		System.out.println("myInt / 5 :- " + (myInt/5) );
		System.out.println("myInt % 5 :- " + (myInt%5) );
		
		System.out.println("myDouble / 5 :- " + (myDouble/5) );	
		System.out.println("myInt / 5.0 :- " + (myInt/5.0) );
		
			
		//System.out.println("myStr to int :- " + (int) myStr );	
	
		System.out.print("Converting String to int :- ");
		System.out.println(Integer.parseInt(myStr));
		
		System.out.print("Converting text String to int :- ");
		System.out.println(Integer.parseInt(txtStr));

	}



}
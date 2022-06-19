class A
{
   static final int a;
	
	static {
		
		System.out.println("Initializing a in static block ....");
		a=4654;

	}
	
	 static void display(int x)
	{
		System.out.print("Value: "+a);
	}
}



class Task4
{
  public static void main(String args[])
  {
	A.display(45);
  }
}
class Outer
{
	private int outer_x = 100;
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}

	// static inner class

	static class In
	{
		
		void printMessage(){

			System.out.println("This is static class \"In\" in enclosed in \"Outer\".");

		}


	}


	// non-static inner class
	public class Inner
	{
		void display()
		{
			System.out.println("displaying private variable of outer : private int outer_x = "+outer_x);
		}
	}



}



class Task10
{
  public static void main(String args[])
  {

	Outer objOut = new Outer();

	Outer.In obj1 = new Outer.In();
	obj1.printMessage();


	Outer.Inner ob = objOut.new Inner();

	ob.display();

	
	
  }
}
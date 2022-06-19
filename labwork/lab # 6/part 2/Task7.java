class Outer
{
	 private int outer_x = 100;
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}
	// inner class
	class Inner
	{
		void display()
		{
			System.out.println("displaying private variable of outer : private int outer_x = "+outer_x);
		}
	}
}



class Task7
{
  public static void main(String args[])
  {
	Outer outer = new Outer();
	outer.test();
  }
}
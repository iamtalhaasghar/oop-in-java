class Outer
{
	private int outer_x = 100;

	void test()
	{
		
		class Inner
		{
		
			void display()
			{
				System.out.println("display fun of inner class : outer_x = "+outer_x);
			}
		}
		
	 	Inner in = new Inner();
		in.display();
	
	}

	
	
}



class Task8
{
  public static void main(String args[])
  {
	Outer outer = new Outer();
	outer.test();
  }
}
class Outer
{
	
	void test()
	{
		
		Inner inner = new Inner();
		
		System.out.print("Value: "+inner.x);
		
	}

	// inner class
	class Inner
	{
		int x =20;
	
		
	}

	void printInnerVar(){
	
		System.out.print("Inner variable of inner class 'x' : "+x);

	}
}



class Task6
{
  public static void main(String args[])
  {
	Outer outer = new Outer();
	outer.test();
  }
}
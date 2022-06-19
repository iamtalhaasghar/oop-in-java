public class Outer
{
	static class Nested_Demo
	{
		public void my_method()
		{
			System.out.print("This is my Nested Class.");
		}
	}
	
	





  public static void main(String args[])
  {
	Outer.Nested_Demo nested = new Outer.Nested_Demo();
	nested.my_method();
  }
}
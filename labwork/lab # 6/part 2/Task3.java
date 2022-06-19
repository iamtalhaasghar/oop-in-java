class A
{
  final int a;
	
	void display(int x)
	{
		a=x;
		System.out.print("Value of in method display : "+a);
	}
}



class Task3
{
  public static void main(String args[])
  {
	A obj = new A();
	obj.display(67);
  }
}
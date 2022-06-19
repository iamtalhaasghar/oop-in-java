class A
{
  int i=50;
  @Override 
  protected void finalize() throws Throwable
   {
	System.out.println("From Finalize Method");
   }
}



class Task1
{
  public static void main(String args[])
  {
	A a1 = new A();
	A a2 = new A();
	a1 = a2;
	 System.gc();
	System.out.println("done");
  }
}
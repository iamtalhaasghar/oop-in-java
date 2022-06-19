public class Task9 {

	 static class Nested_Demo {
		public void my_method() {
 			System.out.println("This is my nested class");
		} 

	}


	public static void main(String args[]){

		Task9.Nested_Demo nested = new Task9.Nested_Demo();
		nested.my_method();
	}


}
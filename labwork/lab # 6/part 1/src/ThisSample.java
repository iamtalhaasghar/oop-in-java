// Sample code for illustration of "this" keyword

import java.util.Scanner;

public class ThisSample{

	public static void main(String [] args){
	
		Scanner input= new Scanner(System.in);	
		System.out.print("Enter a number : ");

		int num = input.nextInt();
		A a = new A(num);

	}
}

class A{
	
	A(){
		System.out.println("This is constructor # 1 of class A which do not takes any input.");
	}

	A(int x){

		this();
		System.out.println("Constructor # 2 which takes an input parameter : "+x);
	}

}
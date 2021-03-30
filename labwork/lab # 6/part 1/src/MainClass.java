// Task # 3

//package pack1;

import java.util.Scanner;

public class MainClass{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter a number : ");
		int num = input.nextInt();
				
		X x = new X(num);
		
		System.out.println("Accessing 'i' directly : "+ x.i);
		x.methodOfX();


	}
	

}

class X{
	
	protected int i;

	X(){}

	X(int a){
		
		i = a;
		
	}	

	void methodOfX(){
		
		System.out.println("Value of 'i' through method : " + i);

	}
}

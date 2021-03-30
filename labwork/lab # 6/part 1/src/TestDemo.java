// Task # 1

import java.util.Scanner;
class TestDemo{
	
	public static void main(String []args){

		Scanner input = new Scanner(System.in);	

		System.out.print("Enter number # 1 : ");	
		int num1 = input.nextInt();
		
		System.out.print("Enter number # 2 : ");
		int num2 = input.nextInt();

		System.out.print("Enter number # 3 : ");
		int num3 = input.nextInt();
		

		Test obj = new Test();
	//	Test obj = new Test(num1,num2,num3);   //---> intialization using another constructor works perfectly
		obj.a=num1;
		obj.b=num2;
		obj.setc(num3);

		System.out.println("Value of a : "+obj.a);
		System.out.println("Value of b : "+obj.b);
		System.out.println("Value of c : "+obj.getc());
	}

}
class Test{

	int a; 
	public int b;
	private int c;
	
	Test(){}


	Test(int x, int y, int z){
		a=x;
		b=y;
		c=z;	
	}


	void setc(int i){
		c=i;
	
	}
	int getc(){
		return c;
	
	}
			
}
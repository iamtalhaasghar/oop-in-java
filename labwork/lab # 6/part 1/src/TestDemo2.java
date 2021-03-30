// Task # 2

import java.util.Scanner;

class TestDemo2{
	
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Number # 1 : ");
		int num1 = input.nextInt();

		System.out.print("Number # 2 : ");
		int num2 = input.nextInt();

		System.out.print("Number # 3 : ");
		int num3 = input.nextInt();
	
		Test2 obj = new Test2(num1,num2,num3);  // error : constructor has private access
		
		System.out.println("Value of a : "+obj.a);
		System.out.println("Value of b : "+obj.b);
		System.out.println("Value of c : "+obj.getc());
	}

}
class Test2{

	int a; 
	public int b;
	private int c;
	
	Test2(){}


	private Test2(int x, int y, int z){
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
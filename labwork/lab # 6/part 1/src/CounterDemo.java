// Task # 7

import java.util.Scanner;


public class CounterDemo{

	public static void main(String []args){
		
		Counter c1 = new Counter();
		c1.IncCounter();
		
		Counter c2 = new Counter();
		c2.IncCounter();


		Counter c3 = new Counter();
		c3.IncCounter();

	
	}
}

class Counter{

	static int count = 8;

	public static void IncCounter(){
			
		System.out.println("\n*************************\n");
		System.out.println("Value of count is : " + count);
		count++;
		System.out.println("Now value of count is : "+count);

	}

}


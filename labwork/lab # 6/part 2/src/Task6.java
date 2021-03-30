
class Outer { 
 

	int outer_x = 100;

	void test() {
 	Inner inner = new Inner();
 	inner.display();
 	}

	void DisplayInnerVar(){

		System.out.println("Value of inner variable is "+inner_x);

	}


 // this is an inner class

 	class Inner {
	int inner_x = 200;

 	void display() {
 		System.out.println("display: outer_x = " + outer_x); }
 	}
}


class Task6 {
 	public static void main(String args[]) {
 		Outer outer = new Outer();
 		outer.test();


		outer.DisplayInnerVar();

	} 

} 
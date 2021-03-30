
class Outer { 
 

	int outer_x = 100;
	
	void test() {

		// this is an inner class

 		class Inner {

 			void display() {

			System.out.println("I am inner class declared in "+
				"method \"test\" of outer class.");
 			System.out.println("display: outer_x = " + outer_x);
			
			}

 		}
 		
		Inner inner = new Inner();
 		inner.display();
 	}

 
}


class Task8 {
 	public static void main(String args[]) {
 		Outer outer = new Outer();
 		outer.test();

	} 

} 
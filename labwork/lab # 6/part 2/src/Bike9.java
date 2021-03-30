public class Bike9{

	final int speedlimit = 90;

	void run(){
	
		speedlimit = 400;	// you can not assign a value
					// to final variable
					// Program will not compile
	}

	public static void main(String args[]){

	Bike9 obj = new Bike9();
		
	obj.run();


	}


}






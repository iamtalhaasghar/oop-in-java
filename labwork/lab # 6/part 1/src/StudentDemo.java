// Task # 4
import java.util.Scanner;

public class StudentDemo{

	public static void main(String [] args){

		int r;
		String n;
		Float f;		
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		n = input.nextLine();
	
		System.out.print("Enter Roll # : ");
		r = input.nextInt();			

		System.out.print("Enter Fees : ");
		f = input.nextFloat();

		Student S1 = new Student(r,n,f);
		S1.DisplayInfo();
		
	}	
}

class Student{
	
	int rollno;
	String name;
	float fee;

	Student(){}
	
	/* //--------------> faulty code !!!!!
	Student(int rollno, String name, float fee){
		
		rollno=rollno;	 // instance variables are
		name=name;	// being hidden by 
		fee=fee;	// local variable of function...
	}
	*/

	// ----> this is the correct code :-
	Student(int rollno, String name, float fee){
		
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;	
	}
	
	void DisplayInfo()
	{
		System.out.println("***************** Student Info *****************");
		System.out.println("Roll # : " + rollno);		
		System.out.println("Name   : " + name);
		System.out.println("Fees   : " + fee);
	
	}

}

// Task # 5

import java.util.Scanner;

public class ReuseConstructors{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String n = input.nextLine();
		
		System.out.print("Enter Roll # : ");
		int r = input.nextInt();

		input.nextLine();  // input buffer problem

		System.out.print("Course Name : ");
		String c = input.nextLine();

		System.out.print("Enter Fee : ");
		float f = input.nextFloat();
	
		input.nextLine();  // input buffer problem

		Student S1 = new Student(r,c,n,f);
		
		System.out.println("\n---------------------------------\n");
	
		System.out.print("Enter your name : ");
		n = input.nextLine();
		
		System.out.print("Enter Roll # : ");
		r = input.nextInt();

		input.nextLine();  // input buffer problem
	
		System.out.print("Course Name : ");
		c = input.nextLine();

		System.out.print("Enter Fee : ");
		f = input.nextFloat();
		input.nextLine();  // input buffer problem		

		Student S2 = new Student(r,c,n);
		S2.fee = f;

		S1.DisplayInfo();
		S2.DisplayInfo();	
	
	}
}


class Student{

	int rollno;
	String course;
	String name;
	float fee;
	
	Student(){}

	Student(int r, String c, String n){
	
		rollno = r;
		course = c;
		name = n;	

	}
	Student(int r , String c, String n, float f){
		
		this(r,c,n);  // "this" should be first line...
		fee = f;
		

	}
	
	void DisplayInfo(){

		System.out.println("\n***************** Student Info *****************\n");
		System.out.println("Roll # : " + rollno);		
		System.out.println("Name   : " + name);
		System.out.println("Course : "+ course);
		System.out.println("Fees   : " + fee);
	
	}

}
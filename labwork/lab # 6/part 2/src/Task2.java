import java.util.Scanner;

public class Task2{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name : ");
		String n = input.nextLine();
		
		System.out.print("Enter your course : "); 
		String c  = input.nextLine();

		Student s1 = new Student(n,c);

		s1.PrintStatus();		


	}




}


class Student{

	final String name;
	final String course;

	Student(){

		name= "";
		course = "";

	}


	Student(String a, String b){
		
		name = a;
		course = b;


	}
	
	void PrintStatus(){
	
		System.out.println("\n************Student Info************\n");


		System.out.format("Student Info : %s%n", name);
		System.out.format("Course       : %s%n", course);


	}



}                                                                             
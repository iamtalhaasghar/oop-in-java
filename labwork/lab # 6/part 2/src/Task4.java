import java.util.Scanner;

public class Task4{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name : ");
		String n = input.nextLine();
		
		System.out.print("Enter your Department : "); 
		String d  = input.nextLine();
	
		Employee e1 = new Employee();
		//e1.setName(n);

		//e1.setDepart(d);

		e1.PrintStatus();		


	}




}


class Employee{

	static final String name;
	static final String department;


	static{

		name = "Mam Sameen Fatima";
		department = "Computer Science";

	}


/*	Employee(String a, String b){
		
		name = a;
		department = b;


	}
*/	
/*
	void setName(String a){
	
		name = a;

	}
	
	void setDepart(String a){
	
		department = a;

	}

*/
	void PrintStatus(){
	
		System.out.println("\n************Employee Info************\n");


		System.out.format("Student Info : %s%n", name);
		System.out.format("Course       : %s%n", department);


	}



}                                                                             
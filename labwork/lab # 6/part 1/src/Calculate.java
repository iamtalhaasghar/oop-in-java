// Task # 6
import java.util.Scanner;

public class Calculate{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);
		
		
				
		System.out.print("Enter a number to find its cube : ");
		int x =  input.nextInt();
		Cube c1 = new Cube(x);
		c1.DisplayCube();
		Cube.DisplayCube();
	}

}

class Cube{
	
	static int num;

	Cube(int a){
		num = a;
	}


	static int CalculateCube(){
		return (num*num*num);
	}


	


	static void DisplayCube(){

		System.out.println("\n****************\n");
		System.out.println("Cube of "+ num + " is : " 
			+ CalculateCube());
	}	

}
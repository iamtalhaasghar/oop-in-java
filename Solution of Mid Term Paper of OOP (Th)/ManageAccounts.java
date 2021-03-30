/*
	***REMOVED***
 	***REMOVED*** ***REMOVED*** ***REMOVED*** (***REMOVED*** ***REMOVED***) ***REMOVED*** ***REMOVED***
	Question # 5
 	
	"Write an Account Class with required functionality"

*/


import java.util.Random;	// importing the class "Random"

public class ManageAccounts{

	public static void main(String []args){

		
		Account account1 = new Account(1000, "Sally", 1111);
		Account account2 = new Account(500, "Joe" );

		account1.deposit(100);
	
		System.out.print("New Balance of Joe`s account : ");
		System.out.println( account1.getBalance() + " $");
	

		account2.withdraw(50);
	
		System.out.print("New Balance of Sally`s account : ");
		System.out.println( account2.getBalance() + " $");


		account1.setBalance( account1.chargeFee() );
		account2.setBalance( account2.chargeFee() );

		account2.changeName("Joseph");

		System.out.println("\n**************Summary**************\n");

		System.out.println(account1.toString());
		System.out.println(account2.toString());


	}	// end of "main"


}	// end of class "ManageAccounts"

class Account{

	private double balance;
	private String name;
	private long accNum;

	Random rand = new Random();


	// Constructor # 1
	public Account(double initBal, String owner , long number){
		
		balance = initBal;
		name = owner;
		accNum = number;

	}

	// Constructor # 2	
	public Account(double initBal, String owner ){
		
		this( initBal , owner , 0 );

		accNum = rand.nextInt(1000);
		
		/*  Note:

		   The above line  creates a ranodm number from 1 to 999 and then assigns
		   it to account number.

		*/

	}


	// Constructor # 3
	public Account(String owner ){
		
		this( 0 , owner , 0 );

		accNum = rand.nextInt(1000);

	}



	public void withdraw(double amount){
	
		if(balance >= amount){
		
			balance -= amount;
		}
		else
			System.out.println("You do not have sufficient balance for this withdrawl.");

	}


	public void deposit(double amount){

		if(amount > 0)
			balance += amount;
		else 
			System.out.println("Invalid amount entered.");

	}

	public void setBalance (double amount){

		if(amount > 0)
			balance = amount;
		else 
			System.out.println("Invalid amount entered.");

	}

	public double getBalance (){

		return (balance);
		

	}


	public void setName (String n){

		name = n;

	}

	public String getName (){

		return (name);
		

	}


	public void setAccNumber (long n){

		accNum = n;

	}

	public long getAccNumber (){

		return (accNum);
		

	}


	public void changeName(String n){

		name = n;

	}
	
	
	public String toString(){

		String temp = "" ;

		temp += accNum + " , " + name + " , " + balance + "$";

		return temp;

	}


	public double chargeFee(){

		balance -= 10;

		return balance;

	}





}	// end of class "Account"


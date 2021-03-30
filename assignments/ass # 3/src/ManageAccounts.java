/*====================================================================================================
	
				QUESTION NUMBER # 6 [PART-A]

======================================================================================================*/


/*
	-------------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Th - ***REMOVED*** # 3
	Question # 6
	"Bank Accounts"
	-------------------------------------
*/



import java.security.SecureRandom;	// importing the class "Random"

public class ManageAccounts{

	public static void main(String []args){

		
		Account account1 = new Account(1000, "Sally", 1111);
		Account account2 = new Account(500, "Joe" );

		account2.deposit(100);
	
		System.out.print("New Balance of Joe`s account : ");
		System.out.println( account2.getBalance() + " $");
	

		account1.withdraw(50);
	
		System.out.print("New Balance of Sally`s account : ");
		System.out.println( account1.getBalance() + " $");


		account1.setBalance( account1.chargeFee() );
		account2.setBalance( account2.chargeFee() );

		account2.changeName("Joseph");

		account1.printSummary();
		account2.printSummary();


	}	// end of "main"


}	// end of class "ManageAccounts"


/*-------------------------------------------------------------------------------------------

			CLASS DEFINATION OF "Account"

-------------------------------------------------------------------------------------------*/

class Account{

	private double balance;
	private String name;
	private long accNum;

	private static int numAccounts;

	private static SecureRandom rand = new SecureRandom();


	// Constructor # 1
	public Account(double initBal, String owner , long number){
		
		balance = initBal;
		name = owner;
		accNum = number;

		numAccounts++;

	}

	// Constructor # 2	
	public Account(double initBal, String owner ){
		
		this( initBal , owner , 0 );

		accNum = 1 + rand.nextInt(9999);
		
		/*  Note:

		   The above line  creates a ranodm number from 1 to 9999 and then assigns
		   it to account number.

		*/

	}


	// Constructor # 3
	public Account(String owner ){
		
		this( 0 , owner);

	}

	// explicit default constructor
	public Account(){		

		numAccounts++;
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

		if(amount >= 0)
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

		temp = String.format("%04d#%s#%.2f$", accNum, name, balance);

		return temp;

	}


	public double chargeFee(){

		balance -= 10;

		return balance;

	}


	public static int getNumAccounts(){

		return numAccounts;

	}
	

	public void printSummary(){

		System.out.println("\n\nTotal Accounts : "+getNumAccounts());
		System.out.println("*****************Account Summary*****************\n");	

		String temp[] = this.toString().split("#");

		System.out.printf("%-20s : %-20s %n","Account Number", temp[0]);
		System.out.printf("%-20s : %-20s %n","Owner`s Name", temp[1]);
		System.out.printf("%-20s : %-20s %n","Balance", temp[2]);

	}


	public void close(){
		
		this.setName( String.format("%s (%s)", this.name,"CLOSED" ) );
		this.setBalance(0.0);
		numAccounts--;

	}

	public static Account consolidate(Account acct1, Account acct2){

		
		if( (acct1.getName().equals(acct2.getName())) && 
		(acct1.getAccNumber() != acct2.getAccNumber())){
			
			Account conAcc = new Account();
			conAcc.setAccNumber( 1 + rand.nextInt(9999) );
			
			conAcc.setName(acct1.getName());
			conAcc.setBalance(acct1.getBalance() + acct2.getBalance());

			acct1.close();
			acct2.close();
	
			return conAcc;

		}
		else{

			System.out.println("\nWarning : The given two Accounts can not be consolidated!!!\n");
			return null;
		}

		
	}




}	// end of class "Account"

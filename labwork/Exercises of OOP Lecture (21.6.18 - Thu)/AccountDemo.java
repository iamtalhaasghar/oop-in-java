/* This is a demonstration that how to convert your 
   UML diagram into .java code*/


public class AccountDemo{

	public static void main(String []args){

		Account a = new Account(123,5000);

		System.out.println("Account Number of a : " + a.getAccountNumber());
		System.out.println("Balance in a : "+a.getBalance());
		System.out.println("Using debit function on account a!");
		
		a.debit(3100);
	
		System.out.println("a : "+a);

		System.out.println();

		Account b = new Account(789);

		System.out.println("Account Number of b : " + b.getAccountNumber());
		System.out.println("Balance in b : "+b.getBalance());
		System.out.println("Using credit function on account b!");		

		b.credit(4000);	
		
		System.out.println("b : "+b);

		System.out.println();

		Account c = new Account();

		c.setAccountNumber(487);
		c.setBalance(9875);

		System.out.println("c : "+c);
		System.out.println();


	}
}


class Account{

	private int accountNumber; 
	private double balance ;

	
	public Account(int accountNumber, double balance){

		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public Account(int accountNumber){

		this(accountNumber, 0D);

	}
	
	public Account(){};


	public int getAccountNumber(){

		return accountNumber;
	}


	public double getBalance(){

		return balance;
	}	

	public void setBalance(double balance){

		this.balance = balance;

	}

	public void setAccountNumber(int num){
		
		accountNumber = num;
	}
	
	public void credit(double amount){

		balance += amount;
	}

	public void debit(double amount){
		
		if(balance >= amount)
			balance -= amount;
		else
			System.out.println("\"Amount Withdrawn\" exceeds the current balance!!");
	}


	public String toString(){

		return (String.format("A/C no: %3d, Balance: Rs.%.2f",getAccountNumber(),
			getBalance()));
	}

	

}
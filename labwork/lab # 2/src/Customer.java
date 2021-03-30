public class Customer
{
			
	int accountNumber;
	int beginBalance;
	int newBalance;
	int charges;
	int credit;
	int creditLimit = 4000;

	void CalcNewBalance()
	{
		newBalance = beginBalance + charges - credit ;
		
		System.out.println("New balance is : " + newBalance);
	}
	

	void CheckCredit( )
	{
		if (newBalance > creditLimit)
		{
			System.out.println("Credit Limit Excedeed for this customer.");
		}
	}

}
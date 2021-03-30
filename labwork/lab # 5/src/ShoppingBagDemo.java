import java.util.Scanner;
class ShoppingBag
{
	int noOfItems;
	int TotalRetailCost;
	float taxRate;
	
	ShoppingBag(float t)
	{
		taxRate = t;
	}

	void Place(int n, float c)
	{
		noOfItems+=n;
		TotalRetailCost+=n*c;

	}
	
	int getTotalItems()
	{
		return noOfItems;
	}

	int getTotalPrice()
	{
		return (TotalRetailCost);
	}

	float CalcTotalPrice()
	{
		return (TotalRetailCost*taxRate);
	}
		
	void CurrentStatus()
	{
		System.out.println("************************************************************");
		System.out.println("\tCurrent Status Of Shopping Bax");
		System.out.println("Total items in Shopping Bag are : " + getTotalItems() );
		System.out.println("Total cost of items in Shopping Bag is : " + getTotalPrice() );
		System.out.println( "Including Tax, Total Cost is : " + CalcTotalPrice());
		System.out.println("************************************************************");
	
	}


}
class ShoppingBagDemo
{
	public static void main(String args[])
	{
		float y;
		int x;
		int z;
		boolean AddItemsAgain = true;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Tax Rate : ");
		y = input.nextFloat();

		ShoppingBag S1 = new ShoppingBag(y);


		while(AddItemsAgain)
		{
			System.out.print("Enter items to place in bag : ");
			x = input.nextInt();

			System.out.print("Enter the unit price of each item : ");
			z = input.nextInt();
			
			S1.Place(x,z);			
			S1.CurrentStatus();
			System.out.println("Do you want to add more Items ? (y=yes : any other input=exit)");
			System.out.print("?\t");
			input.nextLine();
			String choice = input.nextLine();
			if(choice.equals("y"))
				AddItemsAgain = true;
			else
			{
				AddItemsAgain = false;			
				System.out.println("You didn`t selected \"y\" so program will terminate.");
			}
		}		
		
		System.out.println("End of Program!!");
		
		

	}

}
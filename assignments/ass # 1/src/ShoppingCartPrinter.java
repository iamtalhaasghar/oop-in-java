/*
	***REMOVED*** # 1
	***REMOVED*** ***REMOVED***

*/


import java.util.Scanner;

public class ShoppingCartPrinter
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		
		ItemsToPurchase cart1 = new ItemsToPurchase();
		ItemsToPurchase cart2 = new ItemsToPurchase();
	
		boolean showMenuAgain = false;

		do{			// start of do ..... while ... loop
			
			System.out.print("Select Cart ? (1 or 2) : ");
			String cartChoice = input.nextLine();

			switch(cartChoice)     // outer "switch" to switch over two carts....
			{	
				case "1":      // cart 1 is selected
				{
					String choice = cart1.DisplayMenu(1);
					switch(choice)
					{
						case "1":
							{ cart1.AddItems();  break;}		
						case "2":
							{ cart1.DisplayItems();  break;}
						case "3":
							{System.out.print("Enter the item name to search in cart :\n?");
							cart1.SearchItemByName(input.nextLine());  
							break; }
						case "4":
							{System.out.print("Enter the quantity :\n?");
							cart1.ItemOfGreaterQuantity(input.nextInt());
							input.nextLine();  
							break; }
						case "5":
							{System.out.print("Enter the price :\n?");
							cart1.ItemOfGreaterPrice(input.nextInt());  
							input.nextLine();
							break; }
						case "6":
							{ cart1.MostBoughtItem();  break;}
						case "7":
							{ cart1.MostExpensiveItem();  break;}
						case "8":
							{ cart1.CalculateTotalBill();  break;}
						case "9":
							{ cart1.FindAndReplaceItem();  break;}
						default:
							{ System.out.println("Function not available!");  break;}
					
					}        // end of body of switch inside case 1 of outer switch
					
					break;   // break for case1 of outer "switch"

				}                // end of case 1 of outer switch

				case "2":	// cart 2 is selected
				{
					String choice = cart2.DisplayMenu(2);
					switch(choice)
					{
						case "1":
							{ cart2.AddItems();  break;}		
						case "2":
							{ cart2.DisplayItems();  break;}
						case "3":
							{System.out.print("Enter the item name to search in cart :\n?");
							cart1.SearchItemByName(input.nextLine());  
							break; }
						case "4":
							{System.out.print("Enter the quantity :\n?");
							cart2.ItemOfGreaterQuantity(input.nextInt());
							input.nextLine();  
							break; }
						case "5":
							{System.out.print("Enter the price :\n?");
							cart2.ItemOfGreaterPrice(input.nextInt());  
							input.nextLine();
							break; }
						case "6":
							{ cart2.MostBoughtItem();  break;}
						case "7":
							{ cart2.MostExpensiveItem();  break;}
						case "8":
							{ cart2.CalculateTotalBill();  break;}
						case "9":
							{ cart2.FindAndReplaceItem();  break;}
						default:
							{ System.out.println("Function not available!");  break;}
					
					}   	// end of body of switch inside case 2 of outer switch

					break;  // break for case2 of outer "switch"

				}  		 // end of case 2 of outer switch

				default :	// default case for outer switch
					{ System.out.println("Invalid Cart!"); break ;}
				

			}		// end of body of outer switch statement

			System.out.println("Do you Want to Go to Main Menu or Exit ?");
			System.out.println(" y = Main Menu     ;     Any other input = Exit");
			System.out.print("? ");
			if(input.nextLine().equals("y") )
				showMenuAgain = true;
			else
				showMenuAgain = false;

		}while(showMenuAgain);		   // end of do .. while loop
	


	}		// end of body of "main"


}		// end of body of class "Shopping Cart Printer"




/*======================================================================================================

	The defination of Class "ItemsToPurchase"

 ======================================================================================================= */




class ItemsToPurchase
{
	Scanner input = new Scanner(System.in);

/*--------------------------------------------------------------------

 		 >>> Data members of class "ItemsToPurchase"

----------------------------------------------------------------------*/


	String itemName[] = new String[200];
	int itemPrice[] = new int[200];
	int itemQuantity[] = new int[200];

/*--------------------------------------------------------------------

 		>>> constructor to print "Welcome message"

----------------------------------------------------------------------*/

	public ItemsToPurchase()        
	{
		System.out.println("Welcome to Metro Shopping Mall! You Selected a Cart.");

	}


/*---------------------------------------------------------------------

	 >>> Member functions of class "ItemsToPurchase"

----------------------------------------------------------------------*/


	// this function "displays the options" available to user

	String DisplayMenu(int number)
	{

			System.out.println("Main Menu for cart \" "+number+" \" : \n\n");
			System.out.println("1) Add items to cart");
			System.out.println("2) View items in cart");
			System.out.println("3) Search for an item in Cart");
			System.out.println("4) Check for items with quantity more than.... in Cart");
			System.out.println("5) Check for items with price more than.......in Cart");
			System.out.println("6) Check for most Bought item in Cart");
			System.out.println("7) Check for most Expensive item in Cart");
			System.out.println("8) Calculate Total Bill of Items in Cart");
			System.out.println("9) Update an item present in the cart\n\n");
			System.out.print("Enter your Choice : ");	
			String choice = input.nextLine();
			return choice;

	
	}            // end of body of function " DisplayMenu "

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function is used to "add items" to cart

	void AddItems()
	{
		System.out.println("\nType the items` details to add it to cart.\n");

		boolean moreItems=false;		

	ADD_MORE_ITEMS:
		for(int i=0;i<200 ; i++)
		{
			if( itemName[i]==null )
			{ 
				System.out.print("New Item`s Name       :  ");
				itemName[i] = input.nextLine();
				
				System.out.print("New Item`s Unit Price :  ");
				itemPrice[i] = input.nextInt();
				
				System.out.print("New Item`s Quantity   :  ");
				itemQuantity[i] = input.nextInt();	
							input.nextLine();
				System.out.println("\n\nDo you Want to Enter more Items to Cart ?");
				System.out.println(" y = yes     ;     Any other input = No");
				System.out.print("? ");
				if( !( input.nextLine().equals("y") ) )
					break ADD_MORE_ITEMS; 
					
			} 	// end of if block
			
		}		// end of for loop
		
		System.out.println("\nNew Items were added to Cart Successfully!\n\n");

	}         // end of body of function " AddItems "

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function is used to display the items currently present in a cart	

	void DisplayItems()
	{
		System.out.println("\nThe items in the cart are : \n\n");
		System.out.println("Item Name \t Unit Price \t Quantity Purchased \n");
		boolean foundAny = false;	
		
		for( int i=0; i < 200 ; i++ )
		{
			if( !( itemName[i]==null ) )
			{
				foundAny=true;
				System.out.print((i+1) + ") " + itemName[i] + "        ");
				System.out.print( "Rs." + itemPrice[i] + ".00\\-        ");
				System.out.println(itemQuantity[i]);
			}
		}
		if(!foundAny)
			System.out.println("\n No items were present in the list.\n\n");
		else
			System.out.println("\nEnd of Item List!\n\n");

	}	         // end of body of function " DisplayItems "

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function is used to search for a particular item in cart and
	// prints its serial number as on list

	void SearchItemByName(String itemToSearch)
	{
		System.out.println("\nSearching " + itemToSearch + " .....\n");
		boolean foundAny = false ;
		for( int i=0; i<200 ; i++)
		{
			if((itemName[i]!=null) && (itemName[i].equals(itemToSearch)) )
			{
				foundAny = true;
				System.out.println("Found the item " + itemName[i] + 
					" on serial number : " + (i+1) );	
				System.out.print((i+1) + ") " + itemName[i] + "        ");
				System.out.print( "Rs." + itemPrice[i] + ".00\\-        ");
				System.out.println(itemQuantity[i]);

			}
		}

		if(!foundAny)
			System.out.println("\n No such item is present in the list.\n\n");
		else
			System.out.println("\nSearching Ended Successfully!\n\n");

	}    // end of body of function "SearchItemByName"

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function takes a number ("Quantity") and prints all items present in cart whose  
	// quantity is greater than that number.....

	void ItemOfGreaterQuantity(int number)
	{
		System.out.println("\nSearching for items with quantity more than " + number + " : \n");
		boolean foundAny = false ;

		for( int i=0; i<200  ; i++ )
		{
			if((itemName[i]!=null) && (itemQuantity[i]>number))
			{
				foundAny = true;
				System.out.println(itemName[i] + " has quantity of " + itemQuantity[i]);
			}
		}

		if(!foundAny)
			System.out.println("\n No such item is present in the list.\n\n");
		else
			System.out.println("\nSearching Ended Successfully!\n\n");


	}    // end of body of function "ItemOfGreaterQuantity"

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function takes a number ("Price") and prints all items present in cart whose  
	// price is greater than that number.....

	
	void ItemOfGreaterPrice(int givenPrice)
	{	
		System.out.println("\nSearching for items having cost greater than " + givenPrice + " : \n");
		boolean foundAny = false;

		
		for ( int i=0; i<200 ; i++)
		{
			if((itemName[i]!=null) && (itemPrice[i] > givenPrice))
			{
				foundAny = true;
				System.out.println(itemName[i] + " has the price : " + itemPrice[i] );
	
			}

		}

		if(!foundAny)
			System.out.println("\n No such item is present in the list.\n\n");
		else
			System.out.println("\nSearching Ended Successfully!\n\n");
		

	}    // end of body of function "ItemOfGreaterPrice"


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function prints the name of item whose "quantity" is greater than the rest of 
	// items present in cart.

	void MostBoughtItem()
	{
		System.out.println("\nMost Bought Item in Cart is : \n");
		int mostBought = itemQuantity[0];
		int index=0;	

		if(itemName[0]==null)
			System.out.println("Cart is empty!");
		else
		{
			for ( int i=0; i<200 ; i++)
			{
				if((itemName[i]!=null) && (itemQuantity[i]>mostBought))
				{

					mostBought=itemQuantity[i];
					index=i;		
				
				}
			

			}
			System.out.println(itemName[index] + " is most bought item in your cart" 
							+" of Quantity : "+ itemQuantity[index] );
		
			System.out.println("\nSearching Ended Successfully!\n\n");
		}	
		
	}    // end of body of function "MostBoughtItem"

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function prints the name of item whose "Price" is greater than the rest of 
	// items present in cart.

	void MostExpensiveItem()
	{
		System.out.println("\nMost Expensive Item in Cart is : \n");
		int largestPrice = itemPrice[0];
		int index=0;	

		if(itemName[0]==null)
			System.out.println("Cart is empty!");
		else
		{
			for (int i=0; i<200 ; i++)
			{
				if((itemName[i]!=null) && (itemPrice[i]>largestPrice))
				{

					largestPrice=itemPrice[i];
					index=i;		
				
				}
			

			}
			System.out.println(itemName[index] + " is most expensive of price : " 
							+ itemPrice[index] );
		
			System.out.println("\nSearching Ended Successfully!\n\n");
		}

	}	// end of body of function "MostExpensiveItem"

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function is used to calculate bill of all items present in cart

	void CalculateTotalBill()
	{
		System.out.println("\nCalculating Total Bill ..... \n\n");
		long bill=0;			

		if(itemName[0]==null)
			System.out.println("Cart is empty!");
		else
		{
			for ( int i=0; i<200 ; i++)
			{
				if( !( itemName[i]==null ) )
				{
					long total=itemPrice[i]*itemQuantity[i];
					System.out.println(itemName[i] + " = Rs." + total + ".00\\-");
					bill+=total;
				}

			}
			System.out.println("\nTotal Bill is : Rs. "+ bill + ".00\\-\n");
		
		}

		System.out.println("\nEnd of Bill!\n\n");

	}	// end of body of function ""CalculateTotalBill"
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	// this function is used to change the name, price or quantity of an item in the cart	

	void FindAndReplaceItem()
	{
		
		System.out.println("\nFinding and Replacing an item of cart.\n");

		System.out.print("Enter the item`s Name to replace : ");
		String oldName= input.nextLine();
	
		boolean foundAny = false ;

		if(itemName[0]==null)
			System.out.println("Cart is empty!");
		else
		{
			for( int i=0; i<200 ; i++)
			{
				if((itemName[i]!=null) && (itemName[i].equals(oldName)) )
				{
					foundAny = true;
					System.out.print("Enter the new Name of item : " );	
					itemName[i]=input.nextLine();
					System.out.print("Do you also want to change Price ? (y=yes) : ");
					String choice = input.nextLine();
					if( choice.equals("y") ) 
					{	
						System.out.print("Enter the new Price : ");
						itemPrice[i]=input.nextInt();
						input.nextLine();  // store '\n' character from input buffer....
							
					}
					System.out.print("Do you also want to change Quantity ? (y=yes) : ");
					choice = input.nextLine();
					if( choice.equals("y") ) 
					{	
						System.out.print("Enter the new Quantity : ");
						itemQuantity[i]=input.nextInt();
						input.nextLine();  // store '\n' character from input buffer....
							
					}

				}	
			}	
		
		}
		
		if(!foundAny)
			System.out.println("\n No such item is present in the cart.\n\n");
		else
			System.out.println("\n Update Successfull!\n\n");


	}	// end of body of function "FindAndReplaceItem"

/*------------------------------------------------------------------------------------------------

 	>>> End of Definations of Member functions of class "ItemsToPurchase"

--------------------------------------------------------------------------------------------------*/


}		// end of body of class "ItemsToPurchase"





/*------------------------------------------------------------
	Programming by : 
			***REMOVED*** ***REMOVED*** 
		

--------------------------------------------------------------*/



//	(((((((((((((((((((((((((((		End of File !!!		)))))))))))))))))))))))))))
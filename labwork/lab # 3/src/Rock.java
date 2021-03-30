import java.util.Scanner;
import java.util.Random;
public class Rock
{
	public static void main(String []args)
	{
		
		boolean again = true;
GAME:
	   do{
		String userPlay= "" ;
		String myPlay= "" ;
		
		int randomNum = 0;
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.print("Enter your Choice :    ");
		userPlay=input.next();
			
		if( userPlay.equals("r"))
			userPlay="R";
		else if (userPlay.equals("p")) 
			userPlay="P";		
		else if (userPlay.equals("s"))
			userPlay="S";
		else if(    !  ( userPlay.equals("R") || userPlay.equals("P") || userPlay.equals("S")   )      )
		{
			System.out.println("Wrong Input!");
			break GAME;
		}	

		randomNum = generator.nextInt(3);
//		System.out.println(randomNum);
		switch(randomNum)
		{
			case 0:
				myPlay = "R";
				break;
			case 1: 
				myPlay = "P";
				break;
			case 2: 
				myPlay = "S";
				break;			
		
		}		


		System.out.print("My Choice is :       ");
		System.out.println(myPlay);

		if(userPlay.equals(myPlay))
		{
            			System.out.println("Tie!");
		}

		else if (userPlay.equals("R")){
			if(myPlay.equals("R"))
				{System.out.println("Tie!");}
			else if(myPlay.equals("P"))
				{System.out.println("I won! ***REMOVED*** Folded Rock!");}
			else if(myPlay.equals("S"))
				{System.out.println("You won! Rock Crushed Scissor!");}					
			}


		else if (userPlay.equals("P")){
			if(myPlay.equals("R"))
				{System.out.println("You won! ***REMOVED*** Folded Rock!");}
			else if(myPlay.equals("P"))
				{System.out.println("Tie!");}
			else if(myPlay.equals("S"))
				{System.out.println("I won! Scissor Cuts ***REMOVED***!");}					
			}


		else if (userPlay.equals("S")){
			if(myPlay.equals("R"))
				{System.out.println("I won! Rock Crushed Scissor! ");}
			else if(myPlay.equals("P"))
				{System.out.println("You won! Scissor Cuts ***REMOVED***!");}
			else if(myPlay.equals("S"))
				{System.out.println("Tie!");}					
			}
	
		
		System.out.println("\n\n\n\nDo you want to play again ?");
		System.out.println("y = yes     n = no ");
		userPlay = input.next();
		
		if(userPlay.equals("n") || userPlay.equals("N")	)	
			again=false;
		else if(userPlay.equals("Y") || userPlay.equals("y") )		
			again=true;
		else{
			System.out.println("Are you crazy?");
			break GAME;
			}

		}while(again);

		System.out.println("Game Ends!");

	}


}

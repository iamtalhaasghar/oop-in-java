/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 12
	"Check the amount of cookies without if .... else..."
	-------------------------------
*/
import java.util.Scanner;
public class Q12 {

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		boolean again = false;
		String choice = "";

		do{

			System.out.println("**********Searching Cookies**********\n");
			System.out.print("Enter cookies :   ");
			long cookies = input.nextLong();
						
			NoOfCookies(cookies);

			System.out.print("\n\nRun Application Again ? (y or n) :   ");
			choice = input.next();
	
			if(choice.equals("y"))
				again = true;
			else if(choice.equals("n"))
				again = false;
			else{
				System.out.println("Invalid Choice.Application is going to close.");
				again = false;
			}

		}while(again);

		System.out.println("End of Program!!!");		

	}	// end of main


	static void NoOfCookies(final long num){

		boolean found = false;
		
		found = (num<1 || num == 0 || num == 1) ? true  : false ;
		
		System.out.println( (num==0) ? "There is no cookie in jar." : "" );
		System.out.println( (num< 0) ? "Number of cookies can not be negative." : "" );
		System.out.println( (num==1) ? "There is \"1\" cookie in jar." : "" );
		
		
		long i=2 ;
		
		System.out.print(">>>>>Searching Cookies....Please be Patient...");
		while ( !(found) ){

			found = (num==i) ? true  : false ;
			System.out.print((num==i)? "\n\nThere are \""+ i + "\" cookies in jar." : "" );			
			i++;
		}		// end of while loop

	}		// end of "Cookies"


}	// end of class "Q 12"
/*
	-------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Lab - ***REMOVED*** # 1
	Question # 22
	"Twelve Days of Christmas"
	-------------------------------
*/

import java.util.Scanner;
public class Q22{

	public static void main(String []args){


		System.out.println("\n*******************Twelve days of Christmas*******************\n");

		PrintSongTwelveDays();

		System.out.println("\n**************************************************************\n");
		
	
		System.out.println("End of Program!!!");

	}	// end of main


//------------------------------------------------------------------------------

	static void PrintSongTwelveDays(){
		
		String print = "";

		for(int i=1 ; i<13 ; i++){
			
			print = "\tThe ";

			switch(i){

				case 1:
					print+="\"First\"";
					break;

				case 2:
					print+="\"Second\"";
					break;

				case 3:
					print+="\"Third\"";
					break;

				case 4:
					print+="\"Fourth\"";
					break;

				case 5:
					print+="\"Fifth\"";
					break;

				case 6:
					print+="\"Sixth\"";
					break;

				case 7:
					print+="\"Seventh\"";
					break;

				case 8:
					print+="\"Eigth\"";
					break;

				case 9:
					print+="\"Ninth\"";
					break;

				case 10:
					print+="\"Tenth\"";
					break;

				case 11:
					print+="\"Eleventh\"";
					break;

				case 12:
					print+="\"Twelfth\"";
					break;

				default:
					System.out.println("This '1st default case',"+
						" should never execute.");
			
			}	// end of first switch

		
			print += " day of Christamas,\n";
			print +="\t\tMy true love fent to me\n";

			for(int j=i ; j>0 ; j--){
				
				print+="\t\t";

				switch(j){
	
					case 1:
						print+="A partridge in a peer tree.\n";
						break;

					case 2:
						print+="Two turtle doves, and\n";
						break;

					case 3:
						print+="Three Freench hens,\n";
						break;
	
					case 4:
						print+="Four colly brids,\n";
						break;

					case 5:
						print+="Five gold rings,\n";
						break;

					case 6:
						print+="Six geefe a laying,\n";
						break;

					case 7:
						print+="Seven fwans a fwimming,\n";
						break;

					case 8:
						print+="Eight maids a milking,\n";
						break;

					case 9:
						print+="Nine drummers drumming,\n";
						break;

					case 10:
						print+="Ten pipers piping,\n";
						break;

					case 11:
						print+="Eleven ladies dancing,\n";
						break;

					case 12:
						print+="Twelve lords a leaping,\n";
						break;

					default:
						System.out.println("This '2nd default case' "+
							"should never execute.");

			
	
				}	// end of 2nd switch

		
			}  // end of 2nd for loop
			
			System.out.format("%s%n",print);

		}	// end of 1st for loop



	}	// end of "PrintSongTwelveDays"




}	// end of class "Q22"
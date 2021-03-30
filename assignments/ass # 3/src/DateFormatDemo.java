/*====================================================================================================
	
				QUESTION NUMBER # 5

======================================================================================================*/

/*
	-------------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Th - ***REMOVED*** # 3
	Question # 5
	"Date Format"
	-------------------------------------
*/



import java.util.Scanner;

public class DateFormatDemo{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		int d = 0;
		int m = 0;
		int y = 0;
		String month = "";

		System.out.println("Enter Date # 1 : ");

		do{
			System.out.print("Day ? : ");
			d = input.nextInt();		
	
		}while(d<=0 || d>31);

		do{

			System.out.print("Month ? (in number) : ");
			m = input.nextInt();

			while(m==2 && d>29){
			
				System.out.printf("February can not have %d days.%n%n",d);	
				System.out.print("Enter Correct Month ? (in number) : ");
				m = input.nextInt();											

			}

		}while(m<=0 || m>12);
	
		do{
			System.out.print("Year ? : ");
			y = input.nextInt();
		
		}while(y<=0);

		DateFormat date1 = new DateFormat(d,m,y);

		System.out.println("\n\nEnter Date # 2 : ");

		do{
			System.out.print("Day ? : ");
			d = input.nextInt();		
	
		}while(d<=0 || d>31);
	
		do{
	
			System.out.print("Month ? (full Name) : ");
			month = input.next();
		
			while(month.equals("February") && d>29){

				System.out.printf("February can not have %d days.%n%n",d);	
				System.out.print("Enter Correct Month ? (full Name) : ");
				month = input.next();
			}


		}while(!(Months.isValid(month)));
	
		do{	
			System.out.print("Year ? : ");
			y = input.nextInt();			
		
		}while(y<=0);
		
		DateFormat date2 = new DateFormat(d,month,y);
		
		date1.printAllFormats();
		date2.printAllFormats();
		
	}	// end of "main"



}		// end of class "DateFormatDemo"


/*-------------------------------------------------------------------------------------------

			CLASS DEFINATION OF "DateFormat"

-------------------------------------------------------------------------------------------*/
class DateFormat{

	private int day;
	private String month;
	private int year;

	private boolean monthIsInString;


	DateFormat(int d, Integer m, int y){
	
		day = d;
		month = m.toString();
		year = y;
		monthIsInString = false;
	
	}

	DateFormat(int d, String m, int y){
	
		day = d;
		month = m;
		year = y;
		monthIsInString = true;
	
	}
	
	
	public void setDay(int d){

		day = d;
	}

	public int getDay(){

		return day;
	}

	public void setMonth(Integer m){

		month = m.toString();
	}

	public void setMonth(String m){

		month = m;
	}

	public String getMonth(){

		return month;
	}

	public void setYear(int y){

		year = y;
	}

	public int getYear(){

		return year;
	}



	public String toFormat1(){
	
		String temp = "";

		if(monthIsInString){
	
			temp = String.format("%02d / %02d / %4d",
			Months.toNumber(getMonth()),getDay(),getYear() );
		}
		else{

			int index = Integer.parseInt(month);

			temp = String.format("%02d / %02d / %4d",
			index,getDay(),getYear() );
		}
			
		return temp;

	}

	public String toFormat2(){

		String temp = "";

		if(monthIsInString){
	
			temp = String.format("%s %02d, %4d",
			getMonth(),getDay(),getYear() );
		}
		else{

			int index = Integer.parseInt(month);

			temp = String.format("%s %02d, %4d",
			Months.fullName(index),getDay(),getYear() );
		}
			
		return temp;
	}

	public String toFormat3(){
	
		int monthNum = 0;

		if(monthIsInString){
	
			monthNum = Months.toNumber(getMonth());
		}
		else{
			monthNum = Integer.parseInt(month);
		}
			
		return (String.format("%03d %4d",julianDate(monthNum,getDay()),getYear()));


	}

	public void printAllFormats(){
	
		System.out.println("\n**********************Date Formats**********************\n");

		System.out.printf("%-20s : %-20s %n", "MM/DD/YYYY", toFormat1());
		System.out.printf("%-20s : %-20s %n", "month dd, yyyy", toFormat2());
		System.out.printf("%-20s : %-20s %n", "DDD YYYY", toFormat3());



	}

	public int julianDate(int mIndex, int d){
	
		int result = 0;
		for(int i=1; i<mIndex; i++){
			
			if(i==2)
				result += 28;

			else if(i<=7){

				if(i%2==1)
					result += 31;
				else
					result += 30;
			}
			else if(i<=12){

				if(i%2==0)	
					result += 31;
				else
					result += 30;
			}
		}

		return (result+d);
	}



}	// end of DateFormat

/*-------------------------------------------------------------------------------------------

			ENUMERATION "Months"

-------------------------------------------------------------------------------------------*/

enum Months{

	January(1),February(2),March(3),April(4),May(5),June(6),July(7),August(8),	
	September(9),October(10),November(11),December(12);

	private int index;

	private Months(int n){
		
		index = n;
	}

	public static boolean isValid(String m){
			
		Months[] allMonths = Months.values();
			
		for(Months temp : allMonths){

			if(temp.toString().equals(m))			

				return true;
			}
			
		return false;
	}

	public static int toNumber(String m){

		Months temp = Months.valueOf(m);
		return (temp.index);			

	}

	public static String fullName(int i){
			
		Months allMonths[] = Months.values();
	
		String m = "";

		for(Months temp : allMonths ){
				
			if(temp.index == i)
				m = temp.toString();
				
		} 
	
		return m;
	}



}	// end of Enum "Months"
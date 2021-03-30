/*====================================================================================================
	
				QUESTION NUMBER # 3

======================================================================================================*/

/*
	-------------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Th - ***REMOVED*** # 3
	Question # 3
	"Monitoring Device for Heart Rate"
	-------------------------------------
*/



import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class HealthyHeartRateDemo{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int d=0,m=0,y=0;

		System.out.print("Enter First Name : ");
		String f = input.next();		
		
		System.out.print("Enter Last Name : ");
		String l = input.next();

		System.out.println("Enter Date of Birth : ");

		do{
			System.out.print("Day ? : ");
			d = input.nextInt();
		}while(d<=0 || d>31);

		do{
			System.out.print("Month ? : ");
			m = input.nextInt();

			while(m==2 && d>29){
			
				System.out.printf("February can not have %d days.%n%n",d);	
				System.out.print("Enter Correct Month ? : ");
				m = input.nextInt();											

			}
		}while(m<=0 || m>12);

		do{
			System.out.print("Year ? : ");
			y = input.nextInt();
		}while(y<=0);

		HealthyHeartRate obj1 = new HealthyHeartRate (f,l,d,m,y);

		obj1.displayReport();

		
	}

	

}		// end of class "HealtyHeartRateDemo"


/*-------------------------------------------------------------------------------------------

			CLASS DEFINATION OF "HealthyHeartRate"

-------------------------------------------------------------------------------------------*/


class HealthyHeartRate{

	private String firstName;
	private String lastName;
	
	private int day;
	private int month;
	private int year;

	HealthyHeartRate(){}

	HealthyHeartRate(String f, String l, int d, int m, int y){

		firstName = f;
		lastName = l;
		
		day = d;
		month = m;
		year = y;

	}


	public void setFirstName( String f){

		firstName  = f;
	}

	public String getFirstName(){

		return firstName;
	}

	public void setLastName (String l){

		lastName = l;
	}
	
	public String getLastName(){

		return lastName;
	}

	public void setDay(int d){

		day = d;
	}

	public int getDay(){

		return day;
	}

	public void setMonth(int m){

		month = m;
	}

	public int getMonth(){

		return month;
	}

	public void setYear(int y){

		year = y;
	}

	public int getYear(){

		return year;
	}


	public Period calcAge(){

		return Period.between(LocalDate.parse(String.format("%04d-%02d-%02d",getYear(),getMonth(),
			getDay())),LocalDate.now());

	}



	public int maxHeartRate(){

		return (220-calcAge().getYears());

	}

	public String targetHeartRate(){

		return ( String.format("%.0f to %.0f",50f/100f * maxHeartRate(),
			 85f/100f * maxHeartRate()) );
		
	}
	
	public void displayReport(){
		
		System.out.println("\n**************************Report**************************\n");

		System.out.printf("%-29s : %s %s %n","Name", getFirstName(), getLastName());
		System.out.printf("%-29s : %02d - %02d - %04d %n","Date of Birth", getDay(), getMonth(), getYear() );
		System.out.printf("%-29s : %d Years and %d Months.%n","Age", 
			this.calcAge().getYears(),calcAge().getMonths());

		System.out.printf("%-29s : %d beats per min. %n","Max. Heart Beat Rate" ,this.maxHeartRate() );
		System.out.printf("%-29s : %s beats per min.%n ","Recommended Heart Beat Rate" ,this.targetHeartRate() );	

	}


}	// end of class "HealthyHeartRate"

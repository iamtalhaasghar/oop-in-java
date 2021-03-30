/*====================================================================================================
	
					QUESTION NUMBER # 4

======================================================================================================*/


/*
	-------------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Th - ***REMOVED*** # 3
	Question # 4
	"Medication Profile"
	-------------------------------------
*/



import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class MedicationProfileDemo{

	public static void main(String[] args){
		
		Scanner input =  new Scanner(System.in);


		System.out.print("Enter First Name : ");
		String f = input.next();		
		
		System.out.print("Enter Last Name : ");
		String l = input.next();

		int d=0,m=0,y=0;

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


		System.out.print("Gender : ");
		String g = input.next();

		float w = 0f;

		do{

			System.out.print("Enter your weight (in kgs) : ");
			w = input.nextFloat();

		}while(w<=0);

		float h = 0f;

		do{
			System.out.print("Enter your height (in inches) : ");
			h = input.nextFloat();

		}while(h<=0);

		MedicationProfile obj1 = new MedicationProfile (f,l,g,w,h,d,m,y);

		obj1.displayReport();



	}


}		// end of class "MedicationProfileDemo"

/*-------------------------------------------------------------------------------------------

			CLASS DEFINATION OF "MedicationProfile"

-------------------------------------------------------------------------------------------*/


class MedicationProfile{

	private String firstName;
	private String lastName;
	private String gender;
	

	private float weight ;		// in kgs
	private float height ;		// in inches
	
	private int day;
	private int month;
	private int year;

	MedicationProfile(){}

	MedicationProfile(String f, String l, String g, float w, float h, int d, int m, int y){

		firstName = f;
		lastName = l;
		gender = g;
		
		weight = w;
		height = h;		

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

	public void setGender(String g){

		gender = g;
	}

	public String getGender(){

		return gender;
	}

	public void setHeight(float h){

		height = h;
	}

	public float getHeight(){

		return height;
	}

	public void setWeight(float w){

		weight = w;
	}

	public float getWeight(){

		return weight;
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

	
	private float toMeters(float h){
		
		return (float)( h*(2.54f/100f) );

	}

	public float calcBMI(float w, float h){
	
		return (float) ( w / Math.pow(h,2) );

	}


	public static String BMICategory(float num){

		String category = "";

		if(num >= 30)
			category = "Obese";			
		else if (num >= 25 && num <= 29.9 )
			category = "Overweight";
		else if (num >= 18.5 && num <= 24.9 )
			category = "Normal";
		else if (num < 18.5)
			category = "Underweight";
		
		return category;


	}


	public static void printBMIChart(){


		System.out.println("\n\n*****************BMI Chart*****************\n");
		System.out.println("Underweight : less than 18.5         ");
		System.out.println("Normal      : between 18.5 and 24.9  ");
		System.out.println("Overweight  : between 25 and 29.9    ");
		System.out.println("Obese       : 30 or Greater          ");


	}

	public void displayReport(){
		
		System.out.println("\n**************************Report**************************\n");

		System.out.printf("%-29s : %s %s %n","Name", getFirstName(), getLastName());
		System.out.printf("%-29s : %s %n","Gender", getGender());

		System.out.printf("%-29s : %02d - %02d - %04d %n","Date of Birth", getDay(), getMonth(), getYear() );
		
		System.out.printf("%-29s : %d Years and %d Months.%n","Age", 
			this.calcAge().getYears(),calcAge().getMonths());

		System.out.printf("%-29s : %.2f kgs %n","Weight", getWeight());
		System.out.printf("%-29s : %.2f inches %n","Height", getHeight());

		System.out.printf("%-29s : %.2f %n","Your BMI", calcBMI(getWeight(),toMeters(getHeight())) );

		System.out.printf("%-29s : %s %n","You are", BMICategory(calcBMI(getWeight(),toMeters(getHeight()))));
		
		System.out.printf("%-29s : %d beats per min. %n","Max. Heart Beat Rate" ,this.maxHeartRate() );
		System.out.printf("%-29s : %s beats per min.%n ","Recommended Heart Beat Rate" ,this.targetHeartRate() );	
		
		printBMIChart();
	}



}	// end of class "MedicationProfile"

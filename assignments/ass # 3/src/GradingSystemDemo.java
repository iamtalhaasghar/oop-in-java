/*====================================================================================================
	
				QUESTION NUMBER # 1

======================================================================================================*/



/*
	-------------------------------------
 	***REMOVED*** ***REMOVED***
	***REMOVED***
	***REMOVED***

	***REMOVED*** Th - ***REMOVED*** # 3
	Question # 1
	"Grading System"
	-------------------------------------
*/



import java.util.Scanner;

public class GradingSystemDemo{

	public static void main(String[] args){


		
		GradingSystem obj1 = new GradingSystem("***REMOVED***", "***REMOVED***" );
		GradingSystem obj2 = new GradingSystem("Ali", "Data Struct." );
		GradingSystem obj3 = new GradingSystem("Usman", "PF" );

		obj1.getAssgnMarks();
		obj2.getAssgnMarks();
		obj3.getAssgnMarks();


		GradingSystem.printRecord(obj1,obj2,obj3);
		GradingSystem.showBarChart(obj1,obj2,obj3);

	}

}	// end of class "GradingSystemDemo"


/*-------------------------------------------------------------------------------------------

			CLASS DEFINATION OF "GradingSystem"

-------------------------------------------------------------------------------------------*/


class GradingSystem{

	private String name;
	private String courseName;
	private int[] assgnMarks;

	private final int size = 5;


	Scanner input = new Scanner(System.in);

	public GradingSystem(){
		
		this("Student","Course",null);
		
	}

	public GradingSystem(String n, String course ){
		
		this(n,course,null);

	}
	
	public GradingSystem(String name, String courseName, int []marks ){
		
		this.name = name;
		this.courseName = courseName;
		this.assgnMarks = marks;

	}


	public void setName(String n){

		name = n;
	
	}

	public String getName(){

		return name;
	}
	
	public void setCourseName(String n){

		courseName = n;
	
	}

	public String getCourseName(){

		return courseName;
	}
	
	public void setAssgnMarks(int [] marks){

		assgnMarks = marks;
	
	}

	public void getAssgnMarks(){
	
		assgnMarks = new int[size];
		System.out.println("Student Name : " + getName());
		System.out.println("Course Name : "+ getCourseName());
		System.out.println("Enter marks of 5 assignments : ");
		
		for(int i=0; i<size; i++){

			System.out.print("? ");
			assgnMarks[i]=input.nextInt();

			while(assgnMarks[i]>100 || assgnMarks[i]<0){
				System.out.println("Invalid Input. Enter marks between 1 and 100.");
				System.out.print("? ");
				assgnMarks[i]=input.nextInt();

			}
			
		}
		System.out.println();
			
	}
	

	public String calcGrade(){

		String grade = "";
		double avg = this.calcAvg();
				

		if(avg >= 95)
			grade = "A+";
		else if(avg >= 90)
			grade = "A";
		else if(avg >= 85)
			grade = "A-";
		else if(avg >= 80)
			grade = "B+";
		else if(avg >= 75)
			grade = "B";
		else if(avg >= 70)
			grade = "B-";
		else if(avg >= 60)
			grade = "C";
		else if(avg >= 50)
			grade = "D";
		else 
			grade = "F";

		return grade;

	}

	public double calcAvg(){
	
		double result = 0.0;

		for(int temp : assgnMarks){
			
			result += temp;

		}
		
		return (result/assgnMarks.length);		

	}
	
	public int minMarks(){

		int min = assgnMarks[0];

		for(int temp : assgnMarks){
			
			if(temp < min)
				min = temp;

		}
		
		return (min);		

	}

	public int maxMarks(){

		int max = assgnMarks[0];

		for(int temp : assgnMarks){
			
			if(temp > max)
				max = temp;

		}
		
		return (max);	

	}

	public static void printRecord(GradingSystem...gradings){

		System.out.println("\n*********************************Grade Report*********************************\n");
		
		System.out.printf("%-15s %-15s %-4s %-4s %-4s %-4s %-7s %-9s %-7s %n%n","Student Name","Course Name",
			"Ass1","Ass2","Ass3","Ass4","Ass5","Average","Grade");

		for(int i=0; i<gradings.length; i++){

			System.out.printf("%-15s ",gradings[i].getName());
			System.out.printf("%-15s ",gradings[i].getCourseName());

			for(int temp : gradings[i].assgnMarks){

				System.out.printf("%-4d ",temp);

			}
			
			System.out.printf("%3s"," ");			
			System.out.printf(" %-3.2f ",gradings[i].calcAvg());
			System.out.printf(" %7s ",gradings[i].calcGrade());


			System.out.println();
		}
		
		System.out.println("\n************************Max & Min Marks************************\n");

		System.out.printf("%-15s %-15s %-15s %-15s %n%n","Student Name","Course Name",
			"Max Marks","Min Marks");

		int max = gradings[0].maxMarks();
		int min = gradings[0].minMarks();

		for(int i=0; i<gradings.length; i++){

			System.out.printf("%-15s ",gradings[i].getName());
			System.out.printf("%-15s ",gradings[i].getCourseName());

			
			System.out.printf("%-15d ",gradings[i].maxMarks());
			System.out.printf("%-15d ",gradings[i].minMarks());
			
			if(gradings[i].maxMarks()>max)
				max = gradings[i].maxMarks();
			if(gradings[i].minMarks()<min)
				min = gradings[i].minMarks();

			System.out.println();
		}
	
		System.out.println("\nOverall Highest Marks :  " + max);
		System.out.println("Overall Lowest Marks  :  " + min);
				

	}

	public static void showBarChart(GradingSystem...gradings){

		int []grades = new int[11];

		for(int i=0; i<gradings.length; i++){
	
			for(int j=0; j<gradings[i].assgnMarks.length; j++){
						
				++grades[gradings[i].assgnMarks[j]/10];
			}
	
		}

		System.out.println("\n*******************Bar Chart*******************\n");


		for(int k=0; k<grades.length; k++){

			if(k==10)
				System.out.printf("%7d : ",100 );
			else
				System.out.printf("%02d - %02d : ",(k*10),(k*10+9) );
			
			for(int m=0; m<grades[k]; m++){
			
				System.out.print("*");

			}
			
			System.out.println();			

		}

	}


}		// end of class "Grading System"


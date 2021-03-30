/*
	***REMOVED***
 	***REMOVED*** ***REMOVED*** ***REMOVED*** (***REMOVED*** ***REMOVED***) ***REMOVED*** ***REMOVED***
	Question # 3
 	
	"No Of Instances(Objects) of a Class"

*/

public class Q3{

	public static void main(String []args){

		Student s1 = new Student("Java Champion","CS***REMOVED***");

		/* 
		 *
		 * Here you can create as many objects of class "Student"
		 * But We will create only two objtcts.
		 * And then we will check out that how many objects of class "Student"
		 * has been created by calling method "getNumberOfInstances"
		 *
		 */

		Student s2 = new Student ("***REMOVED*** ***REMOVED***","***REMOVED***");

		System.out.print("Total Objects created of class \"Student\" are: ");
		System.out.println( Student.getNumberOfInstances() );

	
// -------->	Note : Output of this program is provided in PDF File.

		
	}	// end of "main"


}	// end of class "Q3"


class Student{

	private String name;
	private String rollNum;
	
	private static int noOfInstances;	/*  variable to keep track of the number 
						 of objects created of class "Student".
						 Note : The variable is kept static for purpose.  */


	Student(String n, String r){

		name = n;
		rollNum = r;
	
		noOfInstances++; 	/*  As we know that Whenever an object is created 
					a constructor is always called(default or user defined). 
					In this case when user defined constructor will be called 
					it will assign values to instances variables and
					it will also increment the int variable "noOfInstances" by 1 
					indicating that an object has been created of class "Student"    */

	}	// end of constructor


	/* 
	 *
	 * Here you can write your code as required.
	 * Here we will declare only one function which
	 * will return the value of variable "noOfInstances".
	 *
	 */

	public static int getNumberOfInstances(){	/* As the variable "noOfInstances" is static,
							   that is why we have also declared this 
							   method as "static"  */

		return noOfInstances;	 

	}


}	// end of class "Student"




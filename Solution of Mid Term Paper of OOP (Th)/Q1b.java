/*
	***REMOVED***
 	***REMOVED*** ***REMOVED*** ***REMOVED*** (***REMOVED*** ***REMOVED***) ***REMOVED*** ***REMOVED***
	Question # 1 part (b)
 	Find the output of the following code.

	"Selection_Statements"

*/

public class Q1b{

	public static void main(String []args){

		int var1 = 5;
		int var2 = 6;

		
			/* The following if statement first assigns value of "1" to var2 and 
				then checks for equality with "var1" */

		if( (var2=1) == var1 )			// as 1 is not equal to 5 so else executes.... 

			System.out.println(var2);	// this will not execute

		else
			System.out.println(++var2);	/* this line pre-increments value of "var2" by "1" and then prints it.
							   Note : var2 has value of 1 not 6("1" was assigned to "var2" in if`s header)  
							    and after increment output will be "2" */	
	}


}



/*
=============================================

In console window Output will be as:

=============================================

2


*/
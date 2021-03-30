/*
	***REMOVED***
 	***REMOVED*** ***REMOVED*** ***REMOVED*** (***REMOVED*** ***REMOVED***) ***REMOVED*** ***REMOVED***
	Question # 1 part (a)
 	Find the output of the following code.
	
	"IntegerConversion"

*/

public class Q1a{

	public static void main(String []args){

		long l=66;
		int i=55;
		short s=44;
		byte b=33;


		i = (int) l;		// "i" now contains "66" because "l=66"
		s = (short) i;		// "s" also now contains "66" because "i=66"
		b = (byte) s;		// "b" also now contains "66" because "s=66"
		
		System.out.println("l = " + l);	
		System.out.println("i = " + i);		
		System.out.println("s = " + s);
		System.out.println("b = " + b);


	}


}



/*
=============================================

In console window Output will be as:

=============================================

l = 66
i = 66
s = 66
b = 66


*/
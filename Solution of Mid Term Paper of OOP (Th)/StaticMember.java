/*
	***REMOVED***
 	***REMOVED*** ***REMOVED*** ***REMOVED*** (***REMOVED*** ***REMOVED***) ***REMOVED*** ***REMOVED***
	Question # 1 part (c)
 	Find the output of the following code.

	"Static Members"

*/

class StaticMember{

	static int x; int y;	// Note: x is static only y is non-static
	StaticMember(){

		x+=2;	// this line increments value of x by "2"
		y++;	// this line increments value of y by "1"

	}


	static int getSquare(){

		return x*x;

	}				

	public static void main(String []args){

		StaticMember sm1 = new StaticMember();		// sm1.x=2 ; sm1.y=1
		StaticMember sm2 = new StaticMember();		// sm2.x=4 ; sm2.y=1
		
		int z = sm1.getSquare();			/*   as "sm1.x=4", getSquare returns "16" which 
								     is stored in "z"   */

		System.out.print("-x" + z + "-y" + sm2.y);	// value of "sm2.y" is "1" see constructor


	}

}





/*
=============================================

In console window Output will be as:

=============================================

-x 16 -y 1 


*/
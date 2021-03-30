/*
	***REMOVED***
 	***REMOVED*** ***REMOVED*** ***REMOVED*** (***REMOVED*** ***REMOVED***) ***REMOVED*** ***REMOVED***
	Question # 4
 	
	"Print the Grid using array"

*/

public class Q4{

	public static void main(String []args){

		char pattern[] = {'-' , ' '};		/*  pattern[0] = '-';
							    pattern[1] = ' ';	*/			

		for(int i = 0 ; i<10 ; i++){
			
			for(int j=0; j<20 ; j++){

				if(j%2==0)
					System.out.print(pattern[0]);	// print '-'
				else
					System.out.print(pattern[1]);	// print ' '

			}

			System.out.println();

		}	// end of "outer for loop"


// -------->	Note : Output of this program is provided in PDF File.		
	


	}	// end of "main"


}	// end of class "Q4"


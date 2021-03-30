package Task1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ***REMOVED***
 */
public class SimpleInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ClassA superOb = new ClassA();
		
       ClassB subOb = new ClassB();

    // The superclass may be used by itself.

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Contents of superOb: ");
		
        superOb.showij();

        System.out.println();

		/* The subclass has access to all 
			public members of its superclass
		*/
                subOb.i = 7;
                subOb.j = 8;
                subOb.k = 9;
                System.out.println("Contents of Sub Obj :");
                subOb.showij();
                subOb.showk();
                System.out.println();
                System.out.println("Sum of i,j and k in subOb: ");
                subOb.sum();
                
    }
    
}



package Task1;

/**
 *
 * @author ***REMOVED***
 */
public class NonSubClassOfASamePckg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Accessing data members of a class from A Non-Subclass class and same Package.\n\n");
        
        
        ClassA ob =  new ClassA();
        System.out.println("Protected Var of Class A : " + ob.protectedVar);
        System.out.println("Default Var of Class A : " + ob.defaultVar);
        System.out.println("Public Var of Class A : " + ob.publicVar);
        
        //System.out.println("Protected Var of Class A : " + ob.privateVar);        // private var can not be accessed outside the class
        System.out.println("Private Member accessed through getter Method : " + ob.getPrivateVar());
        
        SubclassOfASamePckg ob1 = new SubclassOfASamePckg();
        
        System.out.println("**********************************************************************\n");
        
        ob1.accessingDefaultInSubclass();
        ob1.accessingPrivateInSubclass();
        ob1.accessingProtectedInSubclass();
        ob1.accessingPublicInSubclass();
        
        
    }
    
}


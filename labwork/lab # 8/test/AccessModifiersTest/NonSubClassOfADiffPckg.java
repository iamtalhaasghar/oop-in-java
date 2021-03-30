package AccessModifiersTest;


import Task1.ClassA;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ***REMOVED***
 */
public class NonSubClassOfADiffPckg {
    
        public static void main(String[] args) {
            
                System.out.println("Accessing data members of a class from A Non-Subclass class and Different Package.\n\n");
       
                ClassA ob =  new ClassA();
                System.out.println("Protected Var of Class A accessed through getter : " + ob.getProtectedVar());
                System.out.println("Default Var of Class A accessed through getter : " + ob.getDefaultVar());
                System.out.println("Public Var of Class A : " + ob.publicVar);

                //System.out.println("Protected Var of Class A : " + ob.privateVar);        // private var can not be accessed outside the class
                System.out.println("Protected Member accessed through getter Method : " + ob.getProtectedVar());

                SubClassDiffPckg ob1 = new SubClassDiffPckg();
        
                System.out.println("**********************************************************************\n");

                ob1.accessingDefaultInSubclass();
                ob1.accessingPrivateInSubclass();
                ob1.accessingProtectedInSubclass();
                ob1.accessingPublicInSubclass();
    }
    
    
}

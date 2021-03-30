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
public class SubClassDiffPckg  extends ClassA{
    
        public void accessingDefaultInSubclass(){
        
            System.out.println("Default Variable accessed in Subclass Diff Package through getter : \n"
                + super.getDefaultVar());
    
        }

        public void accessingProtectedInSubclass(){
        
        System.out.println("Protected Variable can be accessed in Subclass Diff Package : \n"
                + super.protectedVar);
    
        }
        public void accessingPublicInSubclass(){
        
        System.out.println("Public Variable can be accessed in Subclass Diff Package : \n"
                + super.publicVar);
    
        }
    
        public void accessingPrivateInSubclass(){
        
        System.out.println("Private Variable accessed in Subclass Diff Package through getter : \n"
                + super.getPrivateVar());
    
        }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/**
 *
 * @author ***REMOVED***
 */
public class SubclassOfASamePckg extends ClassA{
    
    public void accessingDefaultInSubclass(){
        
        System.out.println("Default Variable can be accessed in Subclass Same Package : \n"
                + super.defaultVar+"\n\n");
    
    }

    public void accessingProtectedInSubclass(){
        
        System.out.println("Protected Variable can be accessed in Subclass Same Package : \n"
                + super.protectedVar + "\n\n");
    
    }
    public void accessingPublicInSubclass(){
        
        System.out.println("Public Variable can be accessed in Subclass Same Package : \n"
                + super.publicVar + "\n\n");
    
    }
    
    public void accessingPrivateInSubclass(){
        
        System.out.println("Private Variable accessed in Subclass Same Package through getter : \n"
                + super.getPrivateVar() +"\n\n");
    
    }
    
    
    
}

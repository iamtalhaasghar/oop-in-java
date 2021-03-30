/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import java.util.Scanner;

/**
 *
 * @author ***REMOVED***
 */
public class ClassB extends ClassA{
    
    private String fullName;
    
    ClassB(String f, String l){
        super(f,l);
        System.out.println("I am Constructor of Class B with two arguments.");
    
    }
    
    public void showFirstName( ){
    
        System.out.println("First Name : "+super.firstName);
       
    }
    
    public void showLastName( ){
    
        //System.out.println("Last Name : "+super.lastName);
       
    }    
    
    public void showFullName(){
    
        System.out.println("Full Name : "+fullName);
    }
    
    public void setFullName(){
    
        fullName = super.getFirstName()+" "+ super.getLastName();
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input  = new Scanner(System.in);
        
        System.out.println("Enter First Name: ");
        String f = input.nextLine();
   
        System.out.println("Enter Last Name: ");
        String l = input.nextLine();

        ClassB obj = new ClassB(f,l);
        obj.setFullName();
        obj.showFullName();

    }
    
}

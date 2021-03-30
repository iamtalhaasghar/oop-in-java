/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.Scanner;

/**
 *
 * @author ***REMOVED***
 */
public abstract class Employee implements Payable{
    
   Scanner input = new Scanner(System.in);
   
   private String firstName;
   private String lastName;
   private int socialSecurityNumber;
   
   Employee(){}
   
   Employee(String firstName, String lastName, int ssn){
       
       setFirstName(firstName);
       setLastName(lastName);
       setSocialSecurityNumber(ssn);
  
   }
   
   
   public String getFirstName(){
   
       return firstName;
   }
   
   public String getLastName(){
       
       return lastName;
   }
   
   public int getSocialSecurityNumber(){
   
       return socialSecurityNumber;
   }
   
   public final void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final void setSocialSecurityNumber(int socialSecurityNumber) {
        
        while((Integer.toString(socialSecurityNumber).length())!=9 ){
            
            System.out.println("Invalid SSN!! SSN should must contain 9 digits only.");
            System.out.print("Enter SSN again : ");
            socialSecurityNumber = input.nextInt();
       }
        
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public abstract double earnings();
    
}

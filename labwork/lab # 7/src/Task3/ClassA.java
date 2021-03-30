/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;


/**
 *
 * @author ***REMOVED***
 */
public class ClassA {
    
    public String firstName;
    private String lastName;
    
    ClassA(){
    
           System.out.println("I am Constructor of Class A with no argument.");
    }
    
   ClassA(String first, String last){
   
       System.out.println("I am Constructor of Class A with two arguments.");
       firstName = first;   
       lastName = last;
   
   }
    
   public String getFirstName(){
       
       return firstName;
   }
   
   public String getLastName(){
   
       return lastName;
   }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author ***REMOVED***
 */
public class ClassA {
    
    public String firstName;
    private String lastName;
    
    ClassA(){}
    
   ClassA(String first, String last){
   
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

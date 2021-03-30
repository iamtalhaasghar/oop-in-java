/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

import java.util.Scanner;

/**
 *
 * @author ***REMOVED***
 */
public class Employee {
    
    Scanner input = new Scanner(System.in);
    
    private String name;
    private double salary;
    
    Employee(){}
    
    Employee(String n){
    
        name = n;
    }
    
     public void setName(String temp){
    
        name = temp;
    }
    
    public String getName(){
    
        return name;
    }
    
    public void setSalary(double temp){
    
        salary = temp;
    }
    
    public double getSalary(){
    
        return salary;
    }
    
    public void getData(){
    
        System.out.print("Enter Name of Employee : ");
        setName(input.nextLine());
          
    }
    
    
    
    public void summary(){
    
        System.out.println("**************Summary of Employee**************");
        System.out.printf("%-15s : %-15s %n", "Name", getName());
              
    }
    
}

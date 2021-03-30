/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

/**
 *
 * @author ***REMOVED***
 */
public class RegularEmployee extends Employee{
    
    private double basicSalary;
    
    RegularEmployee(){}
    
    RegularEmployee(double salary){
        
            basicSalary = salary;
    }
    
    public void setBasicSalary(double temp){
    
        basicSalary = temp;
    }
    
    public double getBasicSalary(){
    
        return basicSalary;
    }
    
    public void calcSalary(){
    
        this.setSalary(basicSalary);
    }
    
    @Override
    public void getData(){
    
        super.getData();
        
        System.out.print("Enter Basic Salary : ");
        setBasicSalary(input.nextDouble());
        
    
    }
    
    @Override
    public void summary(){
    
        super.summary();
        System.out.printf("%-15s : %.2f $ %n", "Basic Salary", getBasicSalary());
        System.out.printf("%-15s : %-15s %n", "Total Salary", getSalary());
    }
   
    
}

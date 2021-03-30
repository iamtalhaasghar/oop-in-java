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
public class HourlyEmployee extends Employee{
     
    private float noOfHours;
    private float hourlyRate;
    
    HourlyEmployee(){}
    
    HourlyEmployee(float rate, float hours){
        
        hourlyRate = rate;
        noOfHours = hours;
        
    }
    
    public void setHourlyRate(float rate){
    
        hourlyRate = rate;
    }
    
    public void setNoOfHours(float hours){
    
        noOfHours = hours;
    }
    
      public float getHourlyRate(){
    
            return hourlyRate;
    }
    
    public float getNoOfHours(){
    
            return noOfHours ;
    }
    
    public void calcSalary(){
    
        this.setSalary(noOfHours*hourlyRate);
    }  
    
    @Override
      public void getData(){
    
        super.getData();
        
        System.out.print("Enter Hourly Rate : ");
        setHourlyRate(input.nextFloat());
        
        System.out.print("Enter Num of Hours : ");
        setNoOfHours(input.nextFloat());
        
    }
    
    @Override
    public void summary(){
    
        super.summary();
        
        System.out.printf("%-15s : %.2f %n", "Hourly Rate", getHourlyRate());
        System.out.printf("%-15s : %.2f %n", "Num of Hours", getNoOfHours());
        System.out.printf("%-15s : %.2f $ %n", "Total Salary", getSalary());;
    }  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author ***REMOVED***
 */
public class HourlyEmployee extends Employee{
    
    private double hourlyWage;
    private int hoursWorked;
    private double overtimeBonus;
    
    HourlyEmployee(){}
    
    HourlyEmployee(String firstName, String lastName, int ssn, double hourlyWage, int hoursWorked){
    
        super(firstName, lastName, ssn);
        setHourlyWage(hourlyWage);
        setHoursWorked(hoursWorked);
        setOvertimeBonus(0D);
        
    
    }

    public final void setHourlyWage(double hourlyWage) {
        
        while(hourlyWage<=0){
        
            System.out.println("Hourly Wage can not be negative or zero.");
            System.out.print("Enter Hourly Wage again : ");
            hourlyWage = super.input.nextDouble();
            
        }
        this.hourlyWage = hourlyWage;
    }

    public final void setHoursWorked(int hoursWorked) {
        
        while(hoursWorked<=0){

            System.out.println("Hours can not be negative or zero.");
            System.out.print("Enter Hours Worked again : ");
            this.hoursWorked = super.input.nextInt();
            
        }
        this.hoursWorked = hoursWorked;
    }

    public final void setOvertimeBonus(double overtimeBonus) {
        this.overtimeBonus = overtimeBonus;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    
    public double getOvertimeBonus() {
        return overtimeBonus;
    }


    
    @Override
    public double earnings(){
    
        if(getHoursWorked() <= 40)
            return getHoursWorked()*getHourlyWage();
        else{
                
                setOvertimeBonus((getHoursWorked()-40) * (getHourlyWage()*1.5));
                return ( (40*getHourlyWage()) + getOvertimeBonus());
        }
}
    
        @Override
    public String toString(){ 
        
             return String.format("%15s%n%-40s : %-20s%n%-40s : %-9d%n%-40s : Rs. %.2f/- %n%-40s : Rs. %04d/-%n%-40s : Rs. %.2f%n%-40s : Rs. %.2f" ,
               "Hourly Employee","Full Name",getFirstName()+" "+getLastName(),"SSN" ,
               getSocialSecurityNumber(), "Hourly Wage", getHourlyWage(),
               "Hours Worked",getHoursWorked(),"Overtime Pay",getOvertimeBonus(),"Total Earnings", earnings());

    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }


    
}

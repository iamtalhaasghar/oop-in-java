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
public class SalariedEmployee extends Employee{

    private double weeklySalary;
    
    SalariedEmployee(){}
    SalariedEmployee(String firstName, String lastName, int ssn, double weeklySalary){
    
        super(firstName, lastName, ssn);
        setWeeklySalary(weeklySalary);
    }



    public double getWeeklySalary() {
        return weeklySalary;
    }

    public final void setWeeklySalary(double weeklySalary) {
        
        while(weeklySalary<=0){
            
            System.out.println("Weekly Salary can not be negative or zero.");
            System.out.print("Enter Weekly Salary again : ");
            weeklySalary = super.input.nextDouble();
            
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings(){
    
        return getWeeklySalary();
    }

    @Override
       public String toString(){
   
       return String.format("%15s%n%-40s : %-20s%n%-40s : %-9d%n%-40s : Rs. %.2f" ,
               "Salaried Employee","Full Name",getFirstName()+" "+getLastName(),"SSN" ,
               getSocialSecurityNumber(), "Earnings", earnings());
   }

    @Override
    public double getPaymentAmount() {
        
        return earnings();
        
    }

}

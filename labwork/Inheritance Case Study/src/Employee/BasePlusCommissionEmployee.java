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
public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;
 
    public BasePlusCommissionEmployee(){}
    public BasePlusCommissionEmployee(String f, String l, int ssn, double sales, double rate, double base){
    
        super(f, l, ssn, sales, rate);
        setBaseSalary(base);
        
    }

    public double getBaseSalary() {
        
        return baseSalary;
    }

    public final void setBaseSalary(double baseSalary) {
        
        while(baseSalary<=0){
            
            System.out.println("Base Salary can not be negative or zero.");
            System.out.print("Enter Base Salary again : ");
            baseSalary = super.input.nextDouble();
        
        }
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double earnings(){
        
        return (this.getBaseSalary()+(super.getCommissionRate()*super.getGrossSales()));
   
    }
    
    @Override
    public String toString(){ 
        
             return String.format("%15s%n%-40s : %-20s%n%-40s : %-9d%n%-40s : Rs. %.2f/- %n%-40s : Rs. %.2f/-%n%-40s : Rs. %.2f%n%-40s : Rs. %.2f" ,
               "Base Commission Employee","Full Name",getFirstName()+" "+getLastName(),"SSN" ,
               getSocialSecurityNumber(), "Gross Sales", getGrossSales(),
               "Commission Rate",getCommissionRate(),"Base Salary",getBaseSalary(),"Earnings", earnings());

    }

    
    
    
}

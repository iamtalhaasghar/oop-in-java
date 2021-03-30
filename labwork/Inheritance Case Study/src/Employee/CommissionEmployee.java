package Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ***REMOVED*** ***REMOVED***
 */

public class CommissionEmployee extends Employee{
    

   private double grossSales;
   private double commissionRate;
   
   // Constructors
   public CommissionEmployee(){}
   
   public CommissionEmployee(String f,String l, int SSN, double sales, double rate){
      
        super(f, l, SSN);
        setGrossSales(sales);
        setCommissionRate(rate);
   
   }
  
   // getter methods
   

   
   public double getGrossSales(){
   
       return grossSales;
   }
   
   public double getCommissionRate(){
   
       return commissionRate;
   }

   
      // setter methods
   
   
    

    public final void setGrossSales(double grossSales) {
        
        while(grossSales<0){
            
            System.out.println("Gross Sales can not be negative.");
            System.out.print("Enter gross Sales again : ");
            grossSales = super.input.nextDouble();
        
        }
        this.grossSales = grossSales;
    }

    public final void setCommissionRate(double commissionRate) {
        
        while(commissionRate<0 || commissionRate>1){
            System.out.println("Commission Rate can not be negative and should be less than 1.");
            System.out.print("Enter Commission Rate again : ");
            commissionRate = super.input.nextDouble();
        }

        this.commissionRate = commissionRate;
    }
    
   @Override
  public double earnings(){
   
       return (this.getCommissionRate() * this.getGrossSales()) ;
   
  }
       @Override
   public String toString(){
   
       return String.format("%15s%n%-40s : %-20s%n%-40s : %-9d%n%-40s : Rs. %.2f/- %n%-40s : Rs. %.2f/-%n%-40s : Rs. %.2f" ,
               "Commission Employee","Full Name",getFirstName()+" "+getLastName(),"SSN" ,
               getSocialSecurityNumber(), "Gross Sales", getGrossSales(),
               "Commission Rate",getCommissionRate(), "Earnings", earnings());
   }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
   

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
public class PayRollSystemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", 111111111, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", 222222222, 16.75, 40);
        
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", 333333333,
        10000,0.6);
        
        
        BasePlusCommissionEmployee basePlusCommissionEmployee = new
            BasePlusCommissionEmployee ("Bob", "Lewis", 444444444, 5000, 0.4, 300);
        
        System.out.println("*******************Employees processed individually*******************\n");
        System.out.printf("%s%n%s : Rs. %.2f /- %n%n",salariedEmployee,"earned",salariedEmployee.earnings());
        System.out.printf("%s%n%s : Rs. %.2f /- %n%n",hourlyEmployee,"earned",hourlyEmployee.earnings());
        System.out.printf("%s%n%s : Rs. %.2f /- %n%n",commissionEmployee,"earned",
                commissionEmployee.earnings());
        System.out.printf("%s%n%s : Rs. %.2f /- %n%n",basePlusCommissionEmployee,"earned",
                basePlusCommissionEmployee.earnings());
        
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee,
            basePlusCommissionEmployee};
        
        System.out.println("*******************Employees Processed Polymorphically*******************");
        
        for(Employee temp : employees){
            
            
            System.out.println(temp);
            
            if(temp instanceof BasePlusCommissionEmployee){
                
                BasePlusCommissionEmployee employee = 
                        (BasePlusCommissionEmployee) temp;
            
                employee.setBaseSalary(employee.getBaseSalary() * 1.10);
            
                System.out.printf("New Base Salary with 10%% increase is : Rs. %.2f /- ",employee.getBaseSalary());
                
            }
        
            System.out.printf("%nearned Rs. %.2f /- %n%n ",temp.earnings());
            System.out.println("*******************");
        }
        
    }
    
}

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
public class BasePlusCommissionEmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
         BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Sue", "Jones", 123456789,1000,0.6,4000);
        
        System.out.printf("Employee information obtained by get methods: %n");
        System.out.printf("%-25s : %s %n","First Name is",employee.getFirstName());
        System.out.printf("%-25s : %s %n","Last Name is",employee.getLastName());
    
        System.out.printf("%-25s : %d %n","Social Security Number",employee.getSocialSecurityNumber());
        System.out.printf("%-25s : Rs.%.2f /- %n","Gross Sales is",employee.getGrossSales());
        System.out.printf("%-25s : Rs.%.2f /- %n","Comission Rate is",employee.getCommissionRate());
        System.out.printf("%-25s : Rs.%.2f /- %n","Base Salary is",employee.getBaseSalary());
        
        employee.setGrossSales(500);
        employee.setCommissionRate(.1);
        employee.setBaseSalary(8000);
        
        System.out.printf("%n%s : %n%n %s%n", 
                "Updated employee information obtained by toString",employee);
        
    }
    
}

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
public class EmployeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HourlyEmployee h = new HourlyEmployee();
        RegularEmployee r = new RegularEmployee();
        
        h.getData();
        
        System.out.println();
        
        r.getData();
        
        h.summary();
        r.summary();
        
        
    }
    
}

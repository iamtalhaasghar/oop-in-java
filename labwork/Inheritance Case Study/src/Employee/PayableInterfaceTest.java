
package Employee;

public class PayableInterfaceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Payable payableObjects[] = new Payable[4];
        
        payableObjects[0] = new Invoice(01234,"seat",2,375);
        payableObjects[1] = new Invoice(56789, "tyre",4,79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", 111111111, 800);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", 888888888, 1200);
        
        System.out.println("Invoices and Employees processed ploymorphically : \n");
        
        for(Payable currentPayable : payableObjects){
        
            
               System.out.printf("%s %n %s%n Total : $ %.2f %n%n", "Payment Due",currentPayable,currentPayable.getPaymentAmount());
               
        
        }
        
    }
    
}

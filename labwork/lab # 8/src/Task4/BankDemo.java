
package Task4;

public class BankDemo {

        public static void main(String[] args) {
        
                CheckingAccount c = new CheckingAccount(101);
                System.out.println("Depositing $500...");
                c.deposit(500.0);

                try{

                        System.out.println("\n Withdrawing $100....");
                        c.withdraw(100.00);
                        System.out.println("\n Withdrawing $600....");
                        c.withdraw(600.00);
                }
                catch(InsufficientFundsException e){
                    
                        System.out.printf("Sorry, but you are $%.0f short.", e.getAmount());
                        e.printStackTrace();
                }

        }
     
}

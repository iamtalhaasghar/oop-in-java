/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;
import java.util.Scanner;


public class Invoice implements Payable{
    
    private int partNumber;
    private String partDescription;
    private double pricePerItem;
    private int quantity;
    private final Scanner input;

    Invoice(int partNum, String description,int quantity, double price){
    
        input =  new Scanner(System.in);
        setPartNumber(partNum);
        setPartDescription(description);
        setPricePerItem(price);
        setQuantity(quantity);
        
        
    }
    
    public int getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public final void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public final void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public final void setPricePerItem(double pricePerItem) {
        while(pricePerItem<0){
            
            System.out.println("Price can not be negative.");
            System.out.print("Enter price again : ");
            pricePerItem = input.nextDouble();
            
        }
        this.pricePerItem = pricePerItem;
    }

    public final void setQuantity(int quantity) {
        while(quantity<0){
            
            System.out.println("Quantity can not be negative.");
            System.out.print("Enter quantity again : ");
            quantity = input.nextInt();
        }
        
        this.quantity = quantity;
    }

    
    @Override
    public  String toString(){
    
        return String.format("%-20s : %d%n%-20s : %-20s%n%-20s : %.2f%n%-20s : %d%n","Part Num", getPartNumber(), "Description", getPartDescription(),
                "Price Per Item", getPricePerItem(), "Quantity", getQuantity() );
    
    }
    
    @Override
    public double getPaymentAmount() {
        
        return getPricePerItem()*getQuantity();
    }
    
    
            



}

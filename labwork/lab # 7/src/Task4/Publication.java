/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

import java.util.Scanner;

/**
 *
 * @author ***REMOVED***
 */
public class Publication {
    
    
    protected Scanner input = new Scanner(System.in);
    private String title;
    private double price;
    
    Publication(){}
    
    Publication(String t, double p){
    
        title  = t;
        price = p;
    
    }
    
   public String getTitle(){
   
       return title;
   }
    
   public double getPrice(){
   
       return price;
   }
   
   public void setTitle(String t){
   
       title = t;
   }
   
   public void setPrice(double p){
   
       price = p;
   }
   
   public void getData(){
   
       System.out.print("Enter Title : ");
       setTitle(input.nextLine());
       
       System.out.print("Enter Price : ");
       setPrice(input.nextDouble());
   
   }
   
   public void putData(){
   
       System.out.println("************Summary************");
       System.out.printf("%-10s : %-20s %n" ,"Title" , getTitle());
       System.out.printf("%-10s %-4.2f %n","Price", getPrice());
   
   }
   
   
}

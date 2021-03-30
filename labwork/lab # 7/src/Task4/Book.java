/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

/**
 *
 * @author ***REMOVED***
 */
public class Book extends Publication{
    
    private int pageCount;
    
    Book(){}
    
    Book(String t, double p, int pages){
        
        super(t,p);
        pageCount = pages;
         
    
    }
    
    public int getPageCount(){
        
            return pageCount;
    }
    
    public void setPageCount(int pages){
    
        pageCount = pages;
    }
    
    @Override
       public void getData(){
   
       System.out.print("Enter Book Title : ");
       setTitle(input.nextLine());
       
       System.out.print("Enter Book Price : ");
       setPrice(input.nextDouble());
       
       System.out.print("Enter Book Pages : ");
       setPageCount(input.nextInt());
       
   
   }
    
    @Override
       public void putData(){
   
       System.out.println("************Summary of Books************");
       System.out.printf("%-10s : %-20s %n" ,"Book Title" , getTitle());
       System.out.printf("%-10s : %-4.2f$ %n","Book Price", getPrice());
       System.out.printf("%-10s : %d %n","Book Pages", getPageCount());
   
   }
       
    
}

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
public class PublicationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Book jhtp = new Book();
        jhtp.getData();
        
        System.out.println();
        
        Tape t1 = new Tape();
        t1.getData();
        
        jhtp.putData();
        t1.putData();
        
        
        
    }
    
}

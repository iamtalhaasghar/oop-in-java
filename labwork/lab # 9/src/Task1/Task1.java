
package Task1;

import java.io.FileOutputStream;

/**
 *
 * @author ***REMOVED***
 */
public class Task1 {
    
    public static void main(String []args){
    
        try{
        
            FileOutputStream fout = new FileOutputStream("files/Task1.txt");
            String s = "***REMOVED*** is a good Programmer.";
            
            fout.write(s.getBytes());
            
            fout.close();
            System.out.println("Success");
            
        }
        catch(Exception e){
        
            System.out.println(e);
        }
    
    }
    
    
}

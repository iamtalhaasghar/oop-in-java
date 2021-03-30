
package Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
           
            BufferedReader reader = new BufferedReader(new FileReader("files/Task3.txt"));
            String s[] = reader.readLine().split(",");
            System.out.printf("%s : %.04f + %.04f + %.04f = %.04f %n",s[0],Double.parseDouble(s[1]),Double.parseDouble(s[2]),Double.parseDouble(s[3]),
                    Double.parseDouble(s[1])+Double.parseDouble(s[2])+Double.parseDouble(s[3]));
            
            reader.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            Logger.getLogger(Task3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}


// Examle # 3

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


// Example 3 : BufferedOutputStreamExample

public class BufferedOutputStreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            FileOutputStream fout = new FileOutputStream("files/BufferedOutputStreamTest.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "A Good Reader is a Good Leader.";
            bout.write(s.getBytes());
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success!");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
    
}

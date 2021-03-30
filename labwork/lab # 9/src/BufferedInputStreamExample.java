
// Example 4

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class BufferedInputStreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("files/BufferedInputStreamTest.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            do{
                i=bin.read();
                System.out.print((char)i);
            }while(i!=-1);
            
            bin.close();
            fin.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
